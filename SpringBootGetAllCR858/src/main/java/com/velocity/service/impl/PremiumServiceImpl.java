package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Premium;
import com.velocity.repository.PremiumRepository;
import com.velocity.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	public PremiumRepository premiumRepository;

	@Override
	public Premium getPremium(Premium premium) {
		Premium premium2 = premiumRepository.findAll(premium);
		return premium2;
	}

}
