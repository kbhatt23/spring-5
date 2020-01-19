package com.springmvc.basics.bean;

public class ProfileV1 {

	private String firstName;
	private String password;
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "ProfileV1 [firstName=" + firstName + ", password=" + password + "]";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
