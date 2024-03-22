package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Premium;
import com.velocity.model.User;
import com.velocity.service.PremiumService;
import com.velocity.service.UserService;

@RestController
public class UserPremiumController {

	// inject
	@Autowired
	public UserService userService;

	@Autowired
	public PremiumService premiumService;

	@GetMapping("/getUser")
	public User getUser(@PathVariable User user) {
		User user1 = userService.getUser(user);
		List<Premium> premiums = user.getPremiumList();
		for (Premium premium : premiums) {
			premium.setUserId(user.getId());
			premiumService.getPremium(premium);
		}

		return user1;

	}
}
