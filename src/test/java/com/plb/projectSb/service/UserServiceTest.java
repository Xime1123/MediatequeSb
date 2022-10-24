package com.plb.projectSb.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.plb.projectSb.model.User;
import com.plb.projectSb.repository.UserRepository;

@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	public UserService userService;
	
	@BeforeAll
	public static void init() {
		System.out.println("starting the test for userService");
	}
	
	@BeforeEach
	public void initEach() {
		System.out.println("---------------");
	}
	
}
	/*@Test
	public void findByLoginTest(){	
		Optional<User> user1= userRepository.findByLogin("amelier23@gmail.fr");
		assertEquals("Bonnet", user1.get().getLastname());
		
	}
*/

