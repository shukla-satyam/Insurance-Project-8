package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Claim;
import com.test.repository.ClaimRepository;
import com.test.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService{

	
	
	@Autowired
	private ClaimRepository claimRepository;

	

	@Override
	public void delteUser() {
		claimRepository.deleteAll();
	}



	@Override
	public Claim saveClaim(Claim claim) {
		Claim claim1=claimRepository.save(claim);
		return claim1;
	}


	
	

}
