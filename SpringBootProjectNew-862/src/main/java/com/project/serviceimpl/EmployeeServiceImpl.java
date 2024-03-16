package com.project.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Employee;
import com.project.repository.EmployeeRepository;
import com.project.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	//injectRepository
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void deleteClameEmployee() {
		employeeRepository.deleteAll();
		
	}
	
}
