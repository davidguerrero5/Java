package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.context.FacesContext;

public class LoginDAO {

	private static String firstName;
	private static String lastName;
	private static String emailAddress;
	private static double balance;
	private static String role;

	public static boolean validate(String username, String password, String role) {
		String confirmed = "No";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("select * from users where username = ? and password = ? and role = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, role);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("username",
						rs.getString("username"));
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("uid", rs.getString("uid"));
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("role", rs.getString("role"));
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("balance", rs.getDouble("balance"));

				
				// System.out.println("uid: " + rs.getString("uid"));
				// FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(key,object);
				DataConnect.close(con);
				return true;
			}

		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return false;
		} finally {

		}
		return false;
	}

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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getRole() {
		return role;
	}

	public static void setRole(String role) {
		LoginDAO.role = role;
	}

}
