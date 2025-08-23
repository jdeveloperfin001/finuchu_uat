package com.cims.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cims.dto.ApiResponse;
import com.cims.entity.Employee;
import com.cims.service.EmployeeService;

@RestController
@RequestMapping("/rest-api")
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/SaveEmployee")
	public ResponseEntity<?> registerEmployee(@RequestBody Employee employee)
	{
		Map<String, Object> responseMsg=new HashMap<String, Object>();
		try {
			String response=service.saveEmployee(employee);
			
			if("SUCCESS".equalsIgnoreCase(response))
			{
				return  ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("SUCCESS", "Employee saved successfully!"));
			}
			else
			{
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("FAILED", "Employee not saved!"));
			}
		}
		catch (Exception e) {
			 return ResponseEntity
	                    .status(HttpStatus.INTERNAL_SERVER_ERROR) // 500 Error
	                    .body(new ApiResponse("ERROR", "Exception: " + e.getMessage()));
		}
		
		
	}

}
