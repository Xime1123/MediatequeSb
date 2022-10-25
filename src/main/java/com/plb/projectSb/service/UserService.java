package com.plb.projectSb.service;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;
import com.plb.projectSb.repository.UserRepository;
import com.plb.projectSb.model.*;


@Service
public class UserService {
	
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	// Get user by login
    public User findByLogin(String login) throws EntityNotFoundException {
		
    	return  userRepository.findByLogin(login).orElseThrow(() -> new EntityNotFoundException("User does not exist!"));
			
	}
	
	// Get all user
	public List<User> GetAll(){
		
	    return userRepository.findAll();
	}
	
	
	
}
