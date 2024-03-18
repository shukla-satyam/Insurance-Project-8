package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Premium;
import com.test.repository.PremiumRepository;
import com.test.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService{

	@Autowired
	private PremiumRepository premiumRepository;
	
	@Override
	public Premium savePremium(Premium premium) {
	Premium premium1=premiumRepository.save(premium);	
		return premium1;
	}

	@Override
	public void deletePremium() {
		premiumRepository.deleteAll();
		
	}

	

}
