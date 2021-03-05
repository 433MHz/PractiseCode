package com.example.springsec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

	
	UserList userList;
	
	@Autowired
	public UserApi(UserList userList) {
		this.userList = userList;
	}
	
	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		userList.addToList(user);
	}
	
	@GetMapping("/user")
	public @ResponseBody List<User> getUsers(){
		return userList.getList();
	}
	
	@DeleteMapping("/user")
	public void removeUser (@RequestParam int id) {
		userList.removeUser(id);
	}
}
