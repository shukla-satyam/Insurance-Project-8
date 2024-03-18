package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.User;
import com.test.repository.UserRepository;
import com.test.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		User user1=userRepository.save(user);
		return user1;
	}

}
