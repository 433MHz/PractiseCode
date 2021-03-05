package com.example.springsec;

public class User {

	private String login;
	private String firstName;
	private String lastName;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
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
	
	
	public User(String login, String firstName, String lastName) {
		super();
		this.login = login;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
