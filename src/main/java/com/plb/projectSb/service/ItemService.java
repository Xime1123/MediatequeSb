package com.plb.projectSb.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.plb.projectSb.model.Item;
import com.plb.projectSb.repository.ItemRepository;


@Service
public class ItemService {
	
	private final ItemRepository itemRepository;

	public ItemService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	
	// Get all items
	 public List<Item> getAll(){
	  		
	  		List<Item> allItems= itemRepository.findAll();
	  		return (allItems);
	  	
	      }
	
     
    // Get items by disponible  
      public List<Item> findByItemDisp(){
  		
  		List<Item> disItems= itemRepository.findByItemDisp();
  		return (disItems);
  	
      }
      
      //Get new items
      public List<Item> findByReleaseDate(Date today) {
    	  today= new Date();
    	  List<Item> newItems = itemRepository.findByReleaseDate(today);
    	  return (newItems);
    	  switch() {
    	  
    	  case "cd" : {
    			List<Document> ret =new ArrayList<>();
    			for(Document d : documentRepository.findDocumentDisponibleByDateParution(currenteDate)) {
    				if(d instanceof Cd)
    				ret.add(d);
    			}
    			return ret;
    				
    		}
    	  
    	  
    	  }
    	  	  
      }
      
  	
  		
  	}
  	
}
      
      