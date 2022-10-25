package com.plb.projectSb.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.plb.projectSb.model.*;

	

   @Repository
	public interface UserRepository extends JpaRepository <User, Long>{

		  // Get users by login
		   public Optional<User>findByLogin(String login); 
		   
		   //Delete user by Login
		    void deleteByLogin(String login);
		   
		  
		  
		   
		   
		
	}

	

