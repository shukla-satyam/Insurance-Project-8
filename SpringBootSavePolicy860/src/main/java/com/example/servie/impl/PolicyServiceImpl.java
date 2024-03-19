package com.example.servie.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Policy;
import com.example.repository.PolicyRepository;
import com.example.service.PolicyService;

@Service
public class PolicyServiceImpl  implements PolicyService{
  @Autowired
   private PolicyRepository policyRepository;
	@Override
	public Policy savePolicy(Policy policy) {
	Policy policy2=policyRepository.save(policy);
		return policy2;
	}
    
   

}
