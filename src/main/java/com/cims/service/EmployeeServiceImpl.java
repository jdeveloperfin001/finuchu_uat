package com.cims.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cims.dao.EmployeeDao;
import com.cims.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao dao;

	@Override
	public String saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp=dao.save(employee);
		if(!emp.equals(null)&& emp.getEmpId() != null)
		{
			return "SUCCESS";
		}
		else {
			return "FAILED";
		}
		
	}

}
