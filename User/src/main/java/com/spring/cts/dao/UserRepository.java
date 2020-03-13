package com.spring.cts.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.spring.cts.pojo.User;

public interface UserRepository extends CrudRepository<User,String>{

	Iterable<User> findAll();

	User findByUsernameAndPassword(String username, String password);

	User findByUsernameAndPasswordAndConfirmed(String username, String password, String string);

	Optional<User> findByEmail(String emailId);

}
