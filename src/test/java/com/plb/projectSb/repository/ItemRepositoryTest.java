package com.plb.projectSb.repository;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.plb.projectSb.model.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ItemRepositoryTest {
	
	@Autowired
	public ItemRepository itemRepository;
	
	@BeforeAll
	public static void init() {
		System.out.println("starting the test for itemRepository");
	}
	
	@BeforeEach
	public void initEach() {
		System.out.println("--------------- ");
	}
	
	@Test
	public void findByItemDispTest(){
		
		int cont=0;
	   List<Item> items= itemRepository.findByItemDisp();
	   
	   for(Item i:items) {
		    if(i.getCopiesNumber()>0) {
		    	cont+=1;
		    }
	   }
	   assertEquals(cont, itemRepository.findByItemDisp().size());
		
	
	}
	@Test
	public void  findByReleaseDateTest() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH-1));
        Date date = cal.getTime();
        
        int copiesNumber= 0;
		List<Item> news =  itemRepository.findByReleaseDate(date);
		 for (Item item : news) {
	            if(item.getCopiesNumber()>0 && date.before(item.getReleaseDate())) {
	            	copiesNumber++;
	            }
	        }
		    assertNotNull(copiesNumber);
		
	}

	private void assertNotNull(int copiesNumber) {
		// TODO Auto-generated method stub
		
	}
		
	
	
}
	