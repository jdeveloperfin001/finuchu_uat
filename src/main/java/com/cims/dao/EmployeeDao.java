package com.cims.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cims.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	

}
