package com.cims.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	/*EMPID
	EMPNAME
	EMPDESIGNATION
	EMPSALARY
	DEPTID*/
	@Id
	@Column(name="EMPID")
	private Integer empId;
	@Column(name="EMPNAME")
	private String empName;
	@Column(name="EMPDESIGNATION")
	private String designation;
	@Column(name="EMPSALARY")
	private Double salary;
	@Column(name="DEPTID")
	private Integer deptId;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

}
