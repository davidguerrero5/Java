package com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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

}
