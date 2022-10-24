package com.plb.projectSb.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.plb.projectSb.repository.UserRepository;
import com.plb.projectSb.model.*;


@Service
public class UserService {
	
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	// create new user	
	public User saveUser(User user) {	 
			 return  this.userRepository.save(user);
					
			}
	// Get all users
	public List<User> getAll(){
		
		return this.userRepository.findAll();
	} 
	


	// Get user by login
	public Optional<User> findByLogin(String login){
		return  this.userRepository.findByLogin(login);

	}
	
}
	/*
	
	
	// Delete user by Login  
	 @Transactional
	    public void deleteByLogin(String login) {
	        userRepository.deleteByLogin(login);
	    }
	
	


  	}*/