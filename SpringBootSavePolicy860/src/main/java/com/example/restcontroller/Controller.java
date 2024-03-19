package com.example.restcontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Claim;
import com.example.model.Policy;
import com.example.service.ClaimService;
import com.example.service.PolicyService;

@RestController
public class Controller {
	@Autowired
    private PolicyService policyService;
    @Autowired
    private ClaimService claimService;
    
    @PostMapping("/savePolicy")
    public Policy savePolicy(@RequestBody Policy policy) {
    	Policy policy2=policyService.savePolicy(policy);
    	List<Claim> list=policy.getClaimList();
    	for(Claim claim: list) {
    		claim.setPolicyId(policy.getId());
    		claimService.savClaim(claim);
    	}
		return policy2;
    }
}
