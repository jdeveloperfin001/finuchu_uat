package com.cims.service;

import org.springframework.stereotype.Service;

import com.cims.entity.Employee;

@Service
public interface EmployeeService {
	
	public String saveEmployee(Employee employee);

}
