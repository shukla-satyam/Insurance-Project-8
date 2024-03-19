package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}
