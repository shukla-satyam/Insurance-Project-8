package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Premium;
import com.test.model.User;
import com.test.service.PremiumService;
import com.test.service.UserService;

@RestController
public class Controller {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PremiumService premiumService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		User user1=userService.saveUser(user);
		List<Premium>premiumList=user.getPremiumList();
		for(Premium premium:premiumList) {
			premium.setUserId(user.getId());
			premiumService.savePremium(premium);
		}
		return user1;
	}
	
	@GetMapping("/getPremium")
	public List<Premium> getPremium(){
		List<Premium>list=premiumService.getPremium();
		return list;
	}

}
