package com.project.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Policy;

@Repository
public interface PolicyRepository  extends JpaRepository<Policy, Serializable>{

}
