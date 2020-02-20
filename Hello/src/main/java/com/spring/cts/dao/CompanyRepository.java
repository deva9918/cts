package com.spring.cts.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.cts.pojo.Company;
import com.spring.cts.pojo.User;

public interface CompanyRepository  extends CrudRepository<Company,String>{
	Iterable<Company> findAll();
}
