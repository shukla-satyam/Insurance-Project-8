package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}
