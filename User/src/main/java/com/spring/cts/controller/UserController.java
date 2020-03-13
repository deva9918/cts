package com.spring.cts.controller;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.cts.dao.UserRepository;
import com.spring.cts.email.EmailService;
import com.spring.cts.pojo.User;

@RestController
@CrossOrigin(origins = "*" ,allowedHeaders="*")
@RequestMapping(value = "/UserPortal")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/getAllUser")
	public Iterable<User> getAllUser() {
		return userRepository.findAll();
	}

	@Autowired

	private EmailService emailService;

	

	@PostMapping("/saveUser")

	public User saveUser(@RequestBody User user) {

		System.out.println(user);

		userRepository.save(user);

		StringBuffer mailContain = new StringBuffer();

		mailContain.append("Hi " + user.getUsername() + "\n");

		mailContain.append("Please Click on Below Click to Confirm Your Email With Us\n");

		mailContain
				.append("<a href='http://localhost:8095/UserPortal/confirmEmail/" + user.getEmail() + ">Click</a>\n");

		mailContain.append("Thanks And Regards\n CTS Participant\n");

		emailService.sendMail(user.getEmail(), "Email Confirmation", mailContain.toString());

		// emailService.sendPreConfiguredMail("Ho ho ho");

		return user;

	}

	@GetMapping("/confirmEmail/{emailId}")

	public User confirmEmail(@PathVariable("emailId") String emailId)

	{

		Optional<User> user = userRepository.findByEmail(emailId);

		if (user != null && user.get() != null)

		{

			User u = user.get();

			u.setConfirmed("yes");

			userRepository.save(u);

			return u;

		}

		return user.get();

	}

	
	@PutMapping("/updateUser/{username}")
	public User updateuser(@RequestBody User user, @PathVariable("username") String username) {
		user.setUsername(username);
		System.out.println(user);
		userRepository.save(user);
		return user;
	}

	@DeleteMapping("/deleteUser/{username}")
	public boolean deleteUser(@PathVariable("username") String username) {
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

	@GetMapping("/findByUsernameAndPassword/{username}/{password}")

	public User findByUsernameAndPassword(@PathVariable("username") String username,
			@PathVariable("password") String password) {

		User user = userRepository.findByUsernameAndPasswordAndConfirmed(username, password, "yes");

		return user;

	}
	@PostMapping("/uploadImage")

	  public int handleFileUpload(@RequestParam("file") MultipartFile file, HttpSession session) {

	 Path rootLocation = Paths.get(session.getServletContext().getRealPath("/resources/images"));



	  System.out.println("rootLocation == " + rootLocation);

	  String nameExtension[] = file.getContentType().split("/");

	  String profileimage = System.currentTimeMillis() + "." + nameExtension[1];

	  try

	     {

	     System.out.println("ProfileImage :: " + profileimage);

	     }

	  catch(Exception exception)

	     {



	     }



	 return 1;

	  }  


}
