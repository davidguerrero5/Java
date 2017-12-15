package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "userBean")
@SessionScoped
public class UserBean {

	private String username;
	private String password;
	private String role;
	private Integer uid;
	private String newFirstName;
	private String newLastName;
	private String newUsername;
	private String newEmailAddress;
	private String newPassword;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getNewUsername() {
		return newUsername;
	}

	public void setNewUsername(String newUsername) {
		this.newUsername = newUsername;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getNewFirstName() {
		return newFirstName;
	}

	public void setNewFirstName(String newFirstName) {
		this.newFirstName = newFirstName;
	}

	public String getNewLastName() {
		return newLastName;
	}

	public void setNewLastName(String newLastName) {
		this.newLastName = newLastName;
	}

	public String getNewEmailAddress() {
		return newEmailAddress;
	}

	public void setNewEmailAddress(String newEmailAddress) {
		this.newEmailAddress = newEmailAddress;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String validateUser() {
		boolean valid = LoginDAO.validate(username, password, role);
		if (valid == true && role.equalsIgnoreCase("user")) {
			return "userhome?faces-redirect=true";
		} else if (valid == true && role.equalsIgnoreCase("admin")) {
			return "adminhome?faces-redirect=true";
		} else if (valid == true && role.equalsIgnoreCase("manager")) {
			return "managerhome?faces-redirect=true";
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Incorrect Username and Passowrd. Please enter correct username and Password", ""));
			return "login";
		}
	}

	public String updateUsername(String newUsername) {
		Connection conn = null;
		try {
			conn = DataConnect.getConnection();
			String sql = "UPDATE users SET username = ? WHERE uid = ?;";
			PreparedStatement st = conn.prepareStatement(sql);

			// gets uid
			Integer uid = Integer.parseInt(
					(String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("uid"));

			st.setString(1, newUsername);
			st.setInt(2, uid);

			// Execute the statement
			st.executeUpdate();

		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
		System.out.println("You have successfully updated your username!");
		return "userhome";
		// return "successreg?faces-redirect=true";
	}

	public String updatePassword(String newPassword) {
		Connection conn = null;
		try {
			conn = DataConnect.getConnection();
			String sql = "UPDATE users SET password = ? WHERE uid = ?;";
			PreparedStatement st = conn.prepareStatement(sql);

			// gets uid
			Integer uid = Integer.parseInt(
					(String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("uid"));

			st.setString(1, newPassword);
			st.setInt(2, uid);

			// Execute the statement
			st.executeUpdate();

		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
		System.out.println("You have successfully updated your password!");
		return "userhome";
		// return "successreg?faces-redirect=true";
	}
	
	public String updateFirstName(String newFirstName) {
		Connection conn = null;
		try {
			conn = DataConnect.getConnection();
			String sql = "UPDATE users SET first_name = ? WHERE uid = ?;";
			PreparedStatement st = conn.prepareStatement(sql);

			// gets uid
			Integer uid = Integer.parseInt(
					(String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("uid"));

			st.setString(1, newFirstName);
			st.setInt(2, uid);

			// Execute the statement
			st.executeUpdate();

		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
		System.out.println("You have successfully updated your first name!");
		return "userhome";
		// return "successreg?faces-redirect=true";
	}
	
	public String updateLastName(String newLastName) {
		Connection conn = null;
		try {
			conn = DataConnect.getConnection();
			String sql = "UPDATE users SET last_name = ? WHERE uid = ?;";
			PreparedStatement st = conn.prepareStatement(sql);

			// gets uid
			Integer uid = Integer.parseInt(
					(String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("uid"));

			st.setString(1, newLastName);
			st.setInt(2, uid);

			// Execute the statement
			st.executeUpdate();

		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
		System.out.println("You have successfully updated your last name!");
		return "userhome";
		// return "successreg?faces-redirect=true";
	}

	public String updateEmailAddress(String newEmailAddress) {
		Connection conn = null;
		try {
			conn = DataConnect.getConnection();
			String sql = "UPDATE users SET email_address = ? WHERE uid = ?;";
			PreparedStatement st = conn.prepareStatement(sql);

			// gets uid
			Integer uid = Integer.parseInt(
					(String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("uid"));

			st.setString(1, newEmailAddress);
			st.setInt(2, uid);

			// Execute the statement
			st.executeUpdate();

		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
		System.out.println("You have successfully updated your email address!");
		return "userhome";
		// return "successreg?faces-redirect=true";
	}
	
	public List<User> getManagerList() {
		List<User> list = new ArrayList<User>();
		PreparedStatement ps = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			conn = DataConnect.getConnection();
			String sql = "SELECT * from users where role = 'manager' && confirmed = 'No'";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				User usr = new User();
				usr.setUserID(rs.getInt("uid"));
				usr.setFirstName(rs.getString("first_name"));
				usr.setLastName(rs.getString("last_name"));
				usr.setUsername(rs.getString("username"));
				list.add(usr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public void validateManagers() {
		try {
			Connection conn = DataConnect.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate("UPDATE users SET confirmed='Yes' WHERE role='manager'");

		} catch (Exception e) {
			System.out.println("Error Data : " + e.getMessage());
		}
	}

	public void denyManagers() {
		try {
			Connection conn = DataConnect.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate("DELETE FROM users WHERE role='manager' && confirmed='No'");

		} catch (Exception e) {
			System.out.println("Error Data : " + e.getMessage());
		}
	}

	public List<Stock> getPurchasedStocks() {
		List<Stock> list = new ArrayList<Stock>();
		PreparedStatement ps = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			conn = DataConnect.getConnection();
			String sql = "SELECT * from purchase where uid = ?";
			ps = conn.prepareStatement(sql);

			// gets uid
			Integer uid = Integer.parseInt(
					(String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("uid"));

			ps.setInt(1, uid);
			rs = ps.executeQuery();

			while (rs.next()) {
				Stock stock = new Stock();
				stock.setStockSymbol(rs.getString("stock_symbol"));
				stock.setQuantity(rs.getInt("qty"));
				stock.setPrice(rs.getDouble("price"));
				stock.setAmount(rs.getDouble("amt"));
				list.add(stock);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	// logout event, invalidate session
	public void logout() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
	}

}
