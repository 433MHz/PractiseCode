package com.example.filters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

	private UserList list;
	
	@Autowired
	public UserApi(UserList list) {
		this.list = list;
	}
	
	@PostMapping("/addUser")
	public @ResponseBody boolean addUser(@RequestBody User user) {
		return list.addToList(user);
	}
	
	@GetMapping("/getUsers")
	public @ResponseBody List<User> getList(){
		return list.getList();
	}
	
}
