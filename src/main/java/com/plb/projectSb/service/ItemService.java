package com.plb.projectSb.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Service;

import com.plb.projectSb.model.Book;
import com.plb.projectSb.model.Cd;
import com.plb.projectSb.model.Dvd;
import com.plb.projectSb.model.Item;
import com.plb.projectSb.repository.ItemRepository;


@Service
public class ItemService {
	
	private final ItemRepository itemRepository;

	public ItemService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	
	// Get all Cds items
	 public List<Item> getAllCd(){
	// Get of the elements of database;
	List<Item> allItems= itemRepository.findAll();
		 
		List<Item> allItemsCd = new ArrayList<>();	
		
		for (Item allItem: allItems) {
  			
 			 if(allItem instanceof Cd) {
   			  
 				allItemsCd.add(allItem);	
 				
 			 }
		}
		return allItemsCd;
		
	 }
	 
	 
		// Get all Dvds items
	 public List<Item> getAllDvd(){
		// Get of the elements of database;
	List<Item> allItems2= itemRepository.findAll();
		 
		List<Item> allItemsDvd = new ArrayList<>();	
		
		for (Item allItem: allItems2) {
  			
 			 if(allItem instanceof Dvd) {
   			  
 				allItemsDvd .add(allItem);		
 			 }
		}
		return allItemsDvd;
		
	 }
	 
		// Get all books items
	 public List<Item> getAllBook(){
		// Get of the elements of database;
	List<Item> allItems3= itemRepository.findAll();
		 
		List<Item> allItemsBook = new ArrayList<>();	
		
		for (Item allItem: allItems3) {
			
			 if(allItem instanceof Book) {
			  
				allItemsBook .add(allItem);		
			 }
		}
		return allItemsBook;
		
	 } 
	 
		
    // Get  available items 
      public List<Item> findByItemDisp(){
  		
  		List<Item> disItems= itemRepository.findByItemDisp();
  		return disItems;
  	
      }

      //Get new items
     public List<Item> findNewsCd() {
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.MONTH, -3);
    	  
    	  List<Item> newItems = itemRepository.findByReleaseDate(cal.getTime());
    	  
    	  List<Item> newItemsCd = new ArrayList<>();
    	  for(Item newItem: newItems) {
    		  
    		  if(newItem instanceof Cd) {
    			  
    			 newItemsCd.add(newItem);
    			 		  
    		  }
    	  }
    	  return newItemsCd;
    
    	  
    	  
    	  }
     
  	  
     
  		
  	}
  	
      
      