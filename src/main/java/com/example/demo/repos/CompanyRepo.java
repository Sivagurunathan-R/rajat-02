package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Company;

@Repository
public interface CompanyRepo extends CrudRepository<Company , Long> {

}
