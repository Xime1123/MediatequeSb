package com.plb.projectSb.service;

import static org.assertj.core.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;



import javax.persistence.EntityNotFoundException;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.plb.projectSb.model.User;

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
		User user= userService.findByLogin("amelier23@gmail.fr");
		assertEquals(user.getFirstname(), "Amelie");
		
	}
	
	@Test
	public void findByLoginTestException() {	
		
		try {
		userService.findByLogin("coco@gmail.fr");
		fail ("Exception not use");
		} catch (EntityNotFoundException e) {
			
			
		}
		
	}
	
	
	
		
	
}

