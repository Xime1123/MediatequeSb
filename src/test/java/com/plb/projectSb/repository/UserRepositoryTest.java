package com.plb.projectSb.repository;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.plb.projectSb.model.Item;
import com.plb.projectSb.model.User;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class UserRepositoryTest {
	
	@Autowired
	public UserRepository userRepository;
	
	@BeforeAll
	public static void init() {
		System.out.println("starting the test for userRepository");
	}
	
	@BeforeEach
	public void initEach() {
		System.out.println("---------------");
	}
	
	
	@Test
	public void findByLoginTest(){	
		Optional<User> user1= userRepository.findByLogin("amelier23@gmail.fr");
		assertEquals("Bonnet", user1.get().getLastname());
		
	}
	
	

}
