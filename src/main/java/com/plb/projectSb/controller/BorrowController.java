/* package com.plb.projectSb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plb.projectSb.model.Borrow;
import com.plb.projectSb.model.Item;
import com.plb.projectSb.service.BorrowService;
import com.plb.projectSb.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/borrows")
public class BorrowController {
	
	@Autowired
	private BorrowService borrowService;
	
	
	@PostMapping("/")
	public  ResponseEntity<Borrow>  makeABorrow(@Valid @RequestBody Long user_id, Long item_id ,List<Item> items){
		return  ResponseEntity.ok(borrowService.makeABorrow(user_id, item_id, items));
	}

}
*/