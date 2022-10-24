package com.plb.projectSb.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plb.projectSb.model.Borrow;
import com.plb.projectSb.model.Item;
import com.plb.projectSb.model.User;
import com.plb.projectSb.repository.BorrowRepository;
import com.plb.projectSb.repository.ItemRepository;
import com.plb.projectSb.repository.UserRepository;

@Service
public class BorrowService {
	
	
	private final BorrowRepository borrowRepository;
	private final  UserRepository userRepository;
	private final  ItemRepository itemRepository;
	
	

	public BorrowService(BorrowRepository borrowRepository, UserRepository userRepository, ItemRepository itemRepository) {
		this.borrowRepository = borrowRepository;
		this.userRepository = userRepository;
		this.itemRepository = itemRepository;
	}


  //make a borrow and do not exceed 3 per member
	public Borrow makeABorrow( Long user_id, List<Long> items_id ) {
	User user1= userRepository.findById(user_id).get();
		int numBorrows= user1.getBorrows().size();

		if(numBorrows > 3) { 
			System.out.println("User have already 3 items borrowed");}
		
		
		 List<Item> itemsForBorrow = new ArrayList<>();
		  
		for(Item item: itemsForBorrow){      
		            if(item.getCopiesNumber() == 0){
		                System.out.println("Item indisponible actuellement");
		            } 
		            item.setCopiesNumber(item.getCopiesNumber()- 1);
		             itemsForBorrow.add(item);
		             itemRepository.save(item);
		            
		        }
		
		 Borrow reservation = new Borrow();
		 reservation.setUser(user1);
		 reservation.setBorrowDate(LocalDateTime.now());
		 reservation.setReturnDate(LocalDateTime.now().plusDays(7));
		 reservation.setItems(itemsForBorrow);
		 borrowRepository.save(reservation);
		 return reservation ;
	   
			
		}
	
	  //return a borrow
	
		
	}
  

 
	



