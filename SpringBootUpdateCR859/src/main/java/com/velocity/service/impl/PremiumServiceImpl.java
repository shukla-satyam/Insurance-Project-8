package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Premium;
import com.velocity.repository.PremiumRepository;
import com.velocity.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {

	// inject
	@Autowired
	public PremiumRepository premiumRepository;

	@Override
	public Premium savePremium(Premium premium) {
		Premium premium3 = premiumRepository.save(premium);
		return premium3;
	}

}
