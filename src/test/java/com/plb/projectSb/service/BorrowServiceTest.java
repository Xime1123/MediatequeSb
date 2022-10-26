package com.plb.projectSb.service;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.plb.projectSb.model.Borrow;
import com.plb.projectSb.model.Item;
import com.plb.projectSb.model.User;
@SpringBootTest
public class BorrowServiceTest {
	
	@Autowired
	public BorrowService borrowService;

	
	@BeforeAll
	public static void init() {
		System.out.println("starting the tests for itemsService");
	}
	
	@BeforeEach
	public void initEach() {
		System.out.println("---------------");
	}


	@Test
	public void createABorrowTest() throws Exception {
		 User user = new User();
	     user.setId(1L);
	     List<Item> ListBorrow= new ArrayList<>();
          Item item = new Item();
	      item.setId(10L);
	      ListBorrow.add(item);
	      
	      Borrow borrow = borrowService.createABorrow(user.getId(), ListBorrow);
	      assertEquals(1, borrow.getItems().size());
		
	}
	
	@Test
	public void createABorrowLimitException() throws Exception {
		 User user = new User();
	     user.setId(1L);
	     List<Item> ListBorrow= new ArrayList<>();
          Item item1 = new Item();
	      item1.setId(1L);
	      ListBorrow.add(item1);
	      
	      Item item2 = new Item();
	      item1.setId(2L);
	      ListBorrow.add(item2);
	      
	      Item item3 = new Item();
	      item1.setId(3L);
	      ListBorrow.add(item3);
	      
	      Item item4 = new Item();
	      item1.setId(4L);
	      ListBorrow.add(item4);
	      try {
	  		borrowService.createABorrow(1L, ListBorrow);
	  		fail ("Exception quota exceed");
	  		} catch (Exception e) {
	  			
	  			
	  		}
	  
	}
	
	@Test
	public void createABorrowTestNoItemException() throws Exception {
		 User user = new User();
	     user.setId(1L);
	     List<Item> ListBorrow= new ArrayList<>();
          Item item1 = new Item();
	      item1.setCopiesNumber(0);
	      ListBorrow.add(item1);
	      
	      try {
	  		borrowService.createABorrow(1L, ListBorrow);
	  		fail ("Exception no Disponible");
	  		} catch (Exception e) {
	  			
	  			
	  		}
	  
	}

}
