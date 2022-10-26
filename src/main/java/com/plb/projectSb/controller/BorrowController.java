 package com.plb.projectSb.controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plb.projectSb.model.Borrow;
import com.plb.projectSb.model.Item;
import com.plb.projectSb.model.User;
import com.plb.projectSb.repository.BorrowRepository;
import com.plb.projectSb.repository.UserRepository;
import com.plb.projectSb.service.BorrowService;



@RestController
@RequestMapping("/borrows")
public class BorrowController {
	
	@Autowired
	private BorrowService borrowService;
	
	@Autowired
	private BorrowRepository borrowRepository;
	
	
	@Autowired 
	private  UserRepository userRepository; 
	

	@PostMapping("/user/{user_id}")
	public  ResponseEntity<Borrow>  createABorrow(@Valid @RequestBody List<Item> items, @PathVariable Long user_id) throws Exception{
		
		User user= userRepository.findById(user_id).orElseThrow(() -> new EntityNotFoundException());
        user.setId(user_id);
		
		
		return  ResponseEntity.status(HttpStatus.CREATED).body(borrowService.createABorrow(user_id, items));
	}


	
@DeleteMapping("/delete/{idBorrow}")
	public void deleteItem(@PathVariable Long idBorrow) {
		Borrow borrow = borrowRepository.findById(idBorrow).orElseThrow(()-> new EntityNotFoundException());
		borrow.setId(idBorrow);
		
		try {
			borrowService.returnItem(idBorrow);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
	
	
	
	


