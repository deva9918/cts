package com.spring.cts.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.cts.pojo.User;

public interface UserRepository extends CrudRepository<User,String>{

	Iterable<User> findAll();

}
