package com.plb.projectSb.repository;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.plb.projectSb.model.Borrow;
import com.plb.projectSb.model.User;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class BorrowRepositoryTest {
	
	@Autowired
	public BorrowRepository borrowRepository;

	@BeforeAll
	public static void init() {
		System.out.println("starting the test for borrowRepository");
	}
	
	@BeforeEach
	public void initEach() {
		System.out.println("---------------");
	}
	
	@Test
	public void findByLoginTest(){	
		User user1 = new User();
		user1.setId(1l);
		user1.setFirstname("Laura");
		List<Borrow>  resul= borrowRepository.findByUser(user1);
		assertEquals("Laura", user1.getFirstname());
		assertTrue(resul.size()>0);
		
	}

}
