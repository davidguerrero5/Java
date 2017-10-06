package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class RegisterBean {
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserName() {
		return username;
	}

	public void setUserName(String user) {
		this.username = user;
	}

	public String getPassWord() {
		return password;
	}

	public void setPassWord(String password) {
		this.password = password;
	}
	
	public String getById() {
		Connection con = null;
		try {
			// Setup the DataSource object
			com.mysql.jdbc.jdbc2.optional.MysqlDataSource ds = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
			ds.setServerName("localhost");
			ds.setPortNumber(3306);
			ds.setDatabaseName("online_course");
			ds.setUser("root");
			ds.setPassword("12345");

			// Get a connection object
			con = ds.getConnection();

			// Get a prepared SQL statement
//			String sql = "SELECT first_name from user where id = ?";
//			String sql = "INSERT INTO user(firstName, lastName, email, userID, username, password) VALUES(?,?,?,?,?,?)";
			String sql = "INSERT INTO user(first_name, last_name, email_address, username, password) VALUES(?,?,?,?,?);";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, this.firstName);
			st.setString(2, this.lastName);
			st.setString(3, this.email);
			st.setString(4, this.username);
			st.setString(5, this.password);
			

			// Execute the statement
			int rs = st.executeUpdate();

		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}
		return "successreg";
//		 return "successreg?faces-redirect=true";
	}
}
