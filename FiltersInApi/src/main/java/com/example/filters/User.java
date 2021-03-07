package com.example.filters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {

	private String login;
	private String password;
	private String firstName;
	private String lastName;
	private int age;
}
