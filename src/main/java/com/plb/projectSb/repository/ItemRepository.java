package com.plb.projectSb.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.plb.projectSb.model.Item;


@Repository
public interface ItemRepository extends JpaRepository <Item, Long>{
	
	// Get all  items available 
	@Query("SELECT i FROM  Item i WHERE i.copiesNumber >0")
	public List<Item> findByItemDisp(); 
	
	
	//Get all  new items
	 @Query("SELECT i  FROM Item i  WHERE i.releaseDate > ?1")
	 public List<Item> findByReleaseDate(Date date);
	 
	 

	   
	


		
	   
}
