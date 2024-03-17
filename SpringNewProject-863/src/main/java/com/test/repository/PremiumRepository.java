package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Premium;

@Repository
public interface PremiumRepository extends JpaRepository<Premium, Integer> {

}
