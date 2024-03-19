package com.example.servie.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Claim;
import com.example.repository.ClaimRepository;
import com.example.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {
   @Autowired
   private ClaimRepository claimRepository;
	@Override
	public Claim savClaim(Claim claim) {
		Claim claim2 =claimRepository.save(claim);
		return claim2;
	}

}
