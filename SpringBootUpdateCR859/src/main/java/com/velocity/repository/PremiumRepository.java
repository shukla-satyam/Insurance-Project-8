package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Premium;

@Repository
public interface PremiumRepository extends JpaRepository<Premium, Integer> {

}
