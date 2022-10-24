package com.plb.projectSb.controller;


import java.util.Optional;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plb.projectSb.service.UserService;
import com.plb.projectSb.model.*;

@RestController
@RequestMapping(value="/users")

public class UserController {
	
	
	private final UserService userService;
	

public UserController(UserService userService) {
		this.userService = userService;
	}



//Get user by login
@GetMapping(value= "/by-login/{login}")
public  ResponseEntity<Optional<User>> findByLogin(@PathVariable String login) throws Exception{

	Optional<User> userByLogin = userService.findByLogin(login);

	if (userByLogin.isEmpty()) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	} else {
		return new  ResponseEntity<>(userByLogin, HttpStatus.OK);
	}

}

}





