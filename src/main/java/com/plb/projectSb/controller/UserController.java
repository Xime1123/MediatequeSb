package com.plb.projectSb.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plb.projectSb.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.plb.projectSb.model.*;

@RestController
@RequestMapping(value="/users")

public class UserController {
	
	
	private final UserService userService;
	

public UserController(UserService userService) {
		this.userService = userService;
	}

//Create user
@PostMapping
public ResponseEntity<User> saveUser(@Valid @RequestBody User user) {
return ResponseEntity.ok(userService.saveUser(user));
}

// Get All users
@GetMapping
public  ResponseEntity <List<User>> getAll(){

	List <User> allUsers = userService.getAll();

	if (allUsers .isEmpty()) {
		return ResponseEntity.notFound().build();
	} else {
		return  ResponseEntity.ok(allUsers);
	}

}


//Get user by login
@GetMapping(value= "/by-login/{login}")
public  ResponseEntity<Optional<User>> findByLogin(@PathVariable String login){

	Optional<User> userByLogin = userService.findByLogin(login);

	if (userByLogin.isEmpty()) {
		return ResponseEntity.notFound().build();
	} else {
		return  ResponseEntity.ok( userByLogin);
	}

}

}
/*

//Delete by email
@DeleteMapping("/{login}")
public ResponseEntity<Void> deleteByLogin(@PathVariable String login) {
    userService.deleteByLogin(login);
    return ResponseEntity.ok().build();
}

}*/




