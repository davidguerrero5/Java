package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UpdateBean {
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private String role;
	private int uid;

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

	public String updateUser(String newUsername) {
		System.out.println("THIS IS PRINTINGNIGNGGNINGNG");
		Connection con = null;
		try {
			con = DataConnect.getConnection();
			
//			UPDATE `online_course`.`users` SET `last_name`='aaaaaaa' WHERE `uid`='12';
		

			String sql = "UPDATE users SET username = ? WHERE uid = ?;";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, newUsername);
			st.setInt(2, 7);

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
		System.out.println("Update successful");
		return "userhome";
		// return "successreg?faces-redirect=true";
	}
}
