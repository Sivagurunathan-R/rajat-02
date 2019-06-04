package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employees;
import com.example.demo.repos.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController  {

	@Autowired
	private EmployeeRepo ER;
	
	@GetMapping("/get")
	public List<Employees> getAll(){
        
		return (List<Employees>) ER.findAll();
	}
	
	@PostMapping("/add")
	public Employees addEmployee(@RequestBody Employees employee) {
		
		return ER.save(employee);
	}
	
}
