/*package com.plb.projectSb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plb.projectSb.model.Item;
import com.plb.projectSb.repository.BorrowRepository;
import com.plb.projectSb.service.ItemService;

@RestController
@RequestMapping("api/items")

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
	
	@GetMapping 
	public ResponseEntity <List<Item>> findByItemDisp(){
		
	}
}
	

*/


