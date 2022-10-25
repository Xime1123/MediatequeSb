package com.plb.projectSb.controller;


import java.util.List;
import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plb.projectSb.service.UserService;
import com.plb.projectSb.model.*;

@RestController
@RequestMapping("/users")

public class UserController {
	
	
	private final UserService userService;
	

public UserController(UserService userService) {
		this.userService = userService;
	}



//Get user by login
@GetMapping(value= "/by-login/{login}")
public  ResponseEntity<User> findByLogin(@PathVariable String login) throws EntityNotFoundException{

	User userByLogin = userService.findByLogin(login);
	return new  ResponseEntity<>(userByLogin, HttpStatus.OK);
}
	


//Get all users
@GetMapping
public List<User> GetAll(){
	return userService.GetAll();

      
	}
	
	
}








