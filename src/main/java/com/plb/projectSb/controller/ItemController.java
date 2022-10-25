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

	
	@GetMapping (value= "cd-items")
	public  ResponseEntity <List<Item>> getAllCd(){

		List <Item> Cds= itemService.getAllCd();

		if (Cds .isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return  new  ResponseEntity<>(Cds, HttpStatus.OK);
		}
		
	}
	
	@GetMapping (value= "dvd-items")
	public  ResponseEntity <List<Item>> getAllDvd(){

		List <Item> Dvds= itemService.getAllDvd();

		if (Dvds.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return  new  ResponseEntity<>(Dvds, HttpStatus.OK);
		}
		
	}
	
	@GetMapping (value= "book-items")
	public  ResponseEntity <List<Item>> getAllbook(){

		List <Item> Books= itemService.getAllBook();

		if (Books .isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return  new  ResponseEntity<>(Books, HttpStatus.OK);
		}
		
	}

	
	@GetMapping(value= "available-items")
	public ResponseEntity <List<Item>> findByItemDisp(){
		 
		 List<Item> dispItem = itemService.findByItemDisp();
		 if (dispItem.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else {
				return new  ResponseEntity<>(dispItem, HttpStatus.OK);
			}
		
	}
	
	
	@GetMapping(value= "/new-cd-items")
	public ResponseEntity <List<Item>> findsNews(){
		 
		 List<Item> newitems= itemService.findNewsCd();
		 if (newitems.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else {
				return new  ResponseEntity<>(newitems, HttpStatus.OK);
			}
		
	}

	
	
	
	
}
	



