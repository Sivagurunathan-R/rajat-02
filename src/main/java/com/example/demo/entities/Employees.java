package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="Employee")
public class Employees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Employee_id;
	
	private String FirstName;
	
	private String LastName;
	
	private String City;
	
	private String Role;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	//@JoinColumn(name = "Company_id")
	private Company company; 
	
	//
	
	public long getEmployee_id() {
		return Employee_id;
	}

	public void setEmployee_id(long employee_id) {
		Employee_id = employee_id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public Employees(String firstName, String lastName, String city, String role) {
		super();
		FirstName = firstName;
		LastName = lastName;
		City = city;
		Role = role;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//
	@Override
	public String toString() {
		
		return "Employees [firstname: "+FirstName+" , lastname : "+LastName+" , city: = "+City+" ,role: "+Role+", company: "+company+"]"; 
	}

}