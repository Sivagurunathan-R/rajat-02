package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Company_id;
	
	private String CompanyName;
	
	private String Location;

	private String Field;

	//@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,  fetch = FetchType.EAGER )
	@JoinColumn(name = "company_id")
	private List<Employees> employee; 
	//
	
	public long getCompany_id() {
		return Company_id;
	}

	public void setCompany_id(long company_id) {
		Company_id = company_id;
	}

	
	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getField() {
		return Field;
	}

	public void setField(String field) {
		Field = field;
	}
	
	//
	
	public Company(String companyName, String location, String field, List<Employees> employee) {
		super();
		CompanyName = companyName;
		Location = location;
		Field = field;
		this.employee = (List<Employees>) employee;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Employees> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employees> employee) {
		this.employee = employee;
	}
	

}
