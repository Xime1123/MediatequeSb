/*package com.plb.projectSb.service;

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
	
	//Get All items
	
      public List<Item> getAll(){
		
		List<Item> allItems= itemRepository.findAll();
		return (allItems);
	} 
      
    // Get items by Id     
      public List<Item> findByItemDisp(){
  		
  		List<Item> disItems= itemRepository.findByItemDisp();
  		return (disItems);
  	}  
      
      // 
      
	
	
	
	

}
*/