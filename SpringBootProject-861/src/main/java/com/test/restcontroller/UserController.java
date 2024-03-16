package com.test.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.User;
import com.test.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getClaimDetails")
	public List<User> getClaimDetails(){
		List<User> userlist=userService.getClaimDetails();
		return userlist;
		
	}
	@PutMapping("/getUpdateDetails")
	public User getUpdateDetails(@RequestBody User user) {
		User user2=userService.getUpdateDetails(user);
		return user2;
	}

}
