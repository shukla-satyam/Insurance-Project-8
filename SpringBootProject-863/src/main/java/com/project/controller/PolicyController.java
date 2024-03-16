package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Policy;
import com.project.service.PolicyService;

@RestController
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;
	@GetMapping("/getAllPolicy/{start_date}/{end_date}")
	public List<Policy> getAllPolicy(@PathVariable String start_date,@PathVariable String end_date){
		
		List<Policy> policyList =policyService.getAllPolicy();
		return policyList;
		
	}

}
