package com.plb.projectSb.service;

import java.time.LocalDateTime;

import java.util.ArrayList;

import java.util.List;


import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;


import org.springframework.stereotype.Service;
import com.plb.projectSb.model.Borrow;
import com.plb.projectSb.model.Item;
import com.plb.projectSb.model.User;
import com.plb.projectSb.repository.BorrowRepository;
import com.plb.projectSb.repository.ItemRepository;
import com.plb.projectSb.repository.UserRepository;

@Service
@Transactional
public class BorrowService {
	
	
	private final BorrowRepository borrowRepository;
	private final  UserRepository userRepository;
	private final  ItemRepository itemRepository;
	
	

	public BorrowService(BorrowRepository borrowRepository, UserRepository userRepository, ItemRepository itemRepository)  {
		this.borrowRepository = borrowRepository;
		this.userRepository = userRepository;
		this.itemRepository = itemRepository;
	}


  //make a borrow and do not exceed 3 per member
	public Borrow createABorrow( Long user_id, List<Item> items ) throws Exception {
	
		User user= userRepository.findById(user_id).orElseThrow(() -> new EntityNotFoundException("User does not exist!"));
         
		
		// Get the  list with the items to borrow
		 List<Item> borrowItems = new ArrayList<>();
		 int cont=0;
		 
		 for(Item item: items){
				Item itemAdd = itemRepository.findById(item.getId()).orElseThrow(() -> new EntityNotFoundException("this item doesn't exist"));
				if(itemAdd.getCopiesNumber()==0){
					throw new Exception("There aren´t a item disponible");
				} 
				itemAdd.setCopiesNumber(itemAdd.getCopiesNumber()-1);
			    borrowItems.add(itemAdd);
				
			}
		 
		 
		 for ( Borrow borrow : user.getBorrows() ) {
				cont += borrow.getItems().size();
			}
			if (cont + items.size() > 3) {
				throw new Exception("you currently have three borrows, you cannot use the service");
			}
		
		
		// make the borrow
		 Borrow newBorrow = new Borrow();
		 newBorrow.setUser(user);
		 newBorrow.setBorrowDate(LocalDateTime.now());
		 newBorrow.setReturnDate(LocalDateTime.now().plusDays(7));
		 newBorrow.setItems(borrowItems );
		
		 for(Item item: borrowItems) {
				itemRepository.save(item);
			}
		 
		 
		 borrowRepository.save(newBorrow);
		 return newBorrow ;
	   
			
		}
	// Return 
	public void returnItem(Long idBorrow) throws Exception{
		
		Borrow borrow = borrowRepository.findById(idBorrow).orElseThrow(()-> new EntityNotFoundException());
		
		// Methodology for searching the list of items borrows related with idBorrow
		List <Item> items= new ArrayList<Item>();
		items= borrow.getItems();
		
		// delete borrow from repository
		borrowRepository.delete(borrow);
		
		// 
		for(Item returnItem: items) {
			 returnItem.setCopiesNumber(returnItem.getCopiesNumber()+1);
			 itemRepository.save(returnItem);
			
			
		}
	
  
		
		
		
	}
	
	
		
	}
  

 
	



