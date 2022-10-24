package com.plb.projectSb.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plb.projectSb.model.Item;
import com.plb.projectSb.repository.BorrowRepository;
import com.plb.projectSb.service.ItemService;

@RestController
@RequestMapping("/items")

public class ItemController {
	
	
	 
	@Autowired
	ItemService itemService;
	    
	@Autowired
	BorrowRepository borrowRepository;

	
	@GetMapping
	public  ResponseEntity <List<Item>> getAll(){

		List <Item> allitem = itemService.getAll();

		if (allitem .isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return  ResponseEntity.ok(allitem);
		}
		
	}

	
	@GetMapping(value= "/items-disponibles")
	public ResponseEntity <List<Item>> findByItemDisp(){
		 
		 List<Item> dispItem = itemService.findByItemDisp();
		 if (dispItem.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else {
				return new  ResponseEntity<>(dispItem, HttpStatus.OK);
			}
		
	}
	
	@GetMapping(value= "/items-new-releases")
	public ResponseEntity <List<Item>> findByReleaseDate(){
		
		
		 
		 List<Item> newItem = itemService.findByReleaseDate(Date today);
		 if (newItem.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else {
				return new  ResponseEntity<>(newItem, HttpStatus.OK);
			}
		
	}
	
	
	
	
}
	



