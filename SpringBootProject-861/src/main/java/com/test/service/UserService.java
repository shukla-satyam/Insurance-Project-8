package com.test.service;

import java.util.List;

import com.test.model.User;

public interface UserService {
	
	public List<User> getClaimDetails();
	public User getUpdateDetails(User user);

}
