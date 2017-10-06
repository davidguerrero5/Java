package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class SignInBean {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String successP() {
		if (username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("Admin")) {
			return "pagesuccess";
		} else
			return "pagefail";

	}

	 public String validateUser() {
	 Connection con = null;
	 try {
	 // Setup the DataSource object
	 com.mysql.jdbc.jdbc2.optional.MysqlDataSource ds = new
	 com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
	 ds.setServerName("localhost");
	 ds.setPortNumber(3306);
	 ds.setDatabaseName("online_course");
	 ds.setUser("root");
	 ds.setPassword("12345");
	
	 // Get a connection object
	 con = ds.getConnection();
	
	 // Get a prepared SQL statement
	 String sql = "SELECT * FROM online_course.user WHERE username = ? AND password = ?";
	 PreparedStatement st = con.prepareStatement(sql);
	 st.setString(1, this.username);
	 st.setString(2, this.password);
	// st.setInt(1, this.userID);
	
	 // Execute the statement
	 ResultSet rs = st.executeQuery();
	
	 // starts session --> ?
//	 FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("username",
//	 username);
	
	 // Iterate through results
	 if (rs.next()) {
	 System.out.println("Username is: " + rs.getString("username"));
	 this.username = rs.getString("username");
	 
	 return "pagesuccess";
	 }
	 } catch (Exception e) {
	 System.err.println("Exception: " + e.getMessage());
	 } finally {
	 try {
	 con.close();
	 } catch (SQLException e) {
	 }
	 }
	 return "pagefail";
	// return "successreg?faces-redirect=true";
	 }


	 public String logout() {
		    FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		    
		    return "loginandsignup";
		}

}
