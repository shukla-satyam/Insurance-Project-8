package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Claim;
import com.test.model.User;
import com.test.service.ClaimService;
import com.test.service.UserService;

@RestController
public class Controller {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ClaimService claimService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		User user1=userService.saveUser(user);
		List<Claim>premiumList=user.getClaimList();
		for(Claim claim:premiumList) {
			claim.setUserId(user.getId());
			claimService.saveClaim(claim);
		}
		return user1;
	}
	
	@DeleteMapping("/delteUser/{id}")
	public void delteUser(@PathVariable("id") Integer id) {
		claimService.delteUser(id);
	}


}
