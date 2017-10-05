package com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class RegisterBean {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String username;
	private String password;
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNumber;
	}

	public void setPhoneNum(String number) {
		this.phoneNumber = number;
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
}
