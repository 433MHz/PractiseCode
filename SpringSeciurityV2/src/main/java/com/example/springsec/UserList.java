package com.example.springsec;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserList {
	List<User> list = new ArrayList<User>();
	
	
	public List<User> getList() {
		return list;
	}
	
	public void addToList(User user) {
		list.add(user);
	}
	
	public void removeUser(int id) {
		list.remove(id);
	}
}
