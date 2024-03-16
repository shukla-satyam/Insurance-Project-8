package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Policy;
import com.project.repository.PolicyRepository;
import com.project.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

	// inject repository
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public List<Policy> getAllPolicy() {
		List<Policy> policyList = policyRepository.findAll();
		return policyList;
	}

}
