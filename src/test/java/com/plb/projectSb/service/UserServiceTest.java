package com.plb.projectSb.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import javax.validation.constraints.AssertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.plb.projectSb.exception.ItemNotFoundException;
import com.plb.projectSb.model.User;
import com.plb.projectSb.repository.UserRepository;

@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	public UserService userService;

	
	@BeforeAll
	public static void init() {
		System.out.println("starting the tests for userService");
	}
	
	@BeforeEach
	public void initEach() {
		System.out.println("---------------");
	}
	

	@Test
	public void findByLoginTest() {	
		Optional<User> user= userService.findByLogin("amelier23@gmail.fr");
		assertEquals(user.get().getFirstname(), "Amelie");
		
	}
	
	@Test
	public void findByLoginTestException() {	
		Optional<User> user= userService.findByLogin("toto@gmail.fr");
		assertEquals(user, "User does not exist!");
		
	}
	
	
	
		
	
}

