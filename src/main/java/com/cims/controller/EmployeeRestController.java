package com.cims.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cims.entity.LoginDetails;
import com.cims.service.LoginDetailsService;

@RestController
@RequestMapping("/rest-api")
public class EmployeeRestController {
	@Autowired
	private LoginDetailsService service;
	
	
	@GetMapping("/getLoginDetails")
	public ResponseEntity<List<LoginDetails>> getLoginDetails()
	{
		List<LoginDetails> users=service.getAllLoginDetails();
		System.out.println(users);
         return ResponseEntity.ok(users);
	}
	
	

}
