package com.spring.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cts.dao.UserRepository;
import com.spring.cts.pojo.StockPrice;
import com.spring.cts.pojo.User;

@RestController
@RequestMapping
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/getAllUsers")
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@PostMapping("/saveUser")
	public User saveuser(@RequestBody User user) {
		System.out.println(user);
		userRepository.save(user);
		return user;
	}

	@PutMapping("/updateUser/{username}")
	public User updateuser(@RequestBody User user, @PathVariable("username") String username) {
		user.setUsername(username);
		System.out.println(user);
		userRepository.save(user);
		return user;
	}

	@DeleteMapping("/deleteUser/{username}")
	public boolean deleteuser(@PathVariable("username") String username) {
		System.out.println(username);

		Optional<User> user = userRepository.findById(username);

		userRepository.delete(user.get());

		return true;
		
	}

	@GetMapping("/findOneInAll6/{username}")
	public User findoneinall(@PathVariable("username") String username) {

		Optional<User> user = userRepository.findById(username);
		return user.get();

	}
}
