package com.example.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Policy")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String policyName;
     private String status;
     @OneToMany (mappedBy = "policyId")
     private List<Claim> claimList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Claim> getClaimList() {
		return claimList;
	}
	public void setClaimList(List<Claim> claimList) {
		this.claimList = claimList;
	}
	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyName=" + policyName + ", status=" + status + ", claimList=" + claimList
				+ "]";
	}
}
