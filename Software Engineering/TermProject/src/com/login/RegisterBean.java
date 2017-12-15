package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

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
	private String role;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String registerUser() {
		Connection con = null;
		try {
			con = DataConnect.getConnection();

			String sql = "INSERT INTO users(first_name, last_name, email_address, username, password, role) VALUES(?,?,?,?,?,?);";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, this.firstName.trim());
			st.setString(2, this.lastName.trim());
			st.setString(3, this.email.trim());
			st.setString(4, this.username.trim());
			st.setString(5, this.password.trim());
			st.setString(6, this.role.trim());

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
		// return "successreg?faces-redirect=true";
	}
}
