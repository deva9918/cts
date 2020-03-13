package com.spring.cts.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.cts.pojo.Company;

public interface CompanyRepository  extends CrudRepository<Company,String>{
	Iterable<Company> findAll();
	
}
