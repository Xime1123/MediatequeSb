package com.plb.projectSb.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.plb.projectSb.model.Cd;
import com.plb.projectSb.model.Item;


public class ItemServiceTest {
	@Autowired
	public ItemService itemService;

	
	@BeforeAll
	public static void init() {
		System.out.println("starting the tests for itemsService");
	}
	
	@BeforeEach
	public void initEach() {
		System.out.println("---------------");
	}
	
	@Test
	 public void getAllCdTest(){
		List<Item> all= itemService.getAllCd();
		int count=0;
		for(Item cd:all)
			count++;
		assertEquals(count,itemService.getAllCd().size());		
		
	}
	
	
	@Test
	 public void getAllDvdTest(){
		List<Item> all= itemService.getAllDvd();
		int count=0;
		for(Item dvd:all)
			count++;
		assertEquals(count,itemService.getAllDvd().size());		
		
	}
	
	@Test
	 public void getAllBookTest(){
		List<Item> all= itemService.getAllBook();
		int count=0;
		for(Item book:all)
			count++;
		assertEquals(count,itemService.getAllBook().size());		
		
	}
	@Test
	 public void findByItemDispTest(){
		List<Item> dispo= itemService.findByItemDisp();
		int count=0;
		for(Item item:dispo) {
			if(item.getCopiesNumber()>0) {
				
				count++;
			}
			
		}
			
		assertEquals(count,itemService.findByItemDisp().size());		
		
	}
	
	@Test
	 public void findNewsCdTest() {
  	  List<Item> newItemsCd = itemService.findNewsCd();
  	  int count=0;
  	  for(Item newItem: newItemsCd) {
  		  count ++;
  		  
 	  
  	  }
  	  
  	assertEquals(count,itemService.findNewsCd().size());		
	
  	  
  	  }
	
	


}
