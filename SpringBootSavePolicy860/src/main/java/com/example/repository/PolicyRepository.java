package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer>{

}
