package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Employee;
import com.project.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@DeleteMapping("/deleteClameEmployee")
	public void deleteClameEmployee() {
		employeeService.deleteClameEmployee();
		
	}

}
