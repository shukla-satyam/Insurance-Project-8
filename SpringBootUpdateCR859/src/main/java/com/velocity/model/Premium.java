package com.velocity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "premium")
public class Premium {

	// id,policyId,status,policyName,duration,amount
	// Design restful web service to update premium details.

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String policyId;
	private String status;
	private String policyName;
	private String duration;
	private int amount;
	private int userId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Premium [id=" + id + ", policyId=" + policyId + ", status=" + status + ", policyName=" + policyName
				+ ", duration=" + duration + ", amount=" + amount + ", userId=" + userId + "]";
	}

}
