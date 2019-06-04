package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Company;
import com.example.demo.repos.CompanyRepo;
import com.example.demo.repos.EmployeeRepo;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyRepo CR;
	
	@Autowired
	private EmployeeRepo ER;
	
	@GetMapping("/view")
	public List<Company> getCompany(){
		
		return (List<Company>) CR.findAll();
	}
	
	@PostMapping("/add")
	public Company addCompany(@RequestBody Company company) {
		
		return CR.save(company);
	}
	
	@DeleteMapping("/remove")
	public void deleteElements() {
		
		CR.deleteAll();
	}
	
	@DeleteMapping("/removeER")
	public void deleteElement() {
		
		ER.deleteAll();
	}
	
}
