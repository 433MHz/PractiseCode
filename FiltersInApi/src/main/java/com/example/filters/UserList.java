package com.example.filters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class UserList {

	private List<User> list = new ArrayList<User>();
	
	
	public boolean addToList(User user){
		list.add(user);
		return true;
	}


	public List<User> getList() {
		return list;
	}
	
	
}
