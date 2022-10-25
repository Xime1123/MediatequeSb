package com.plb.projectSb.service;
import java.util.List;
import java.util.Optional;

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
	public Optional<User> findByLogin(String login) {
		
		Optional<User> user = Optional.ofNullable(userRepository.findByLogin(login).orElseThrow(() -> new EntityNotFoundException("User does not exist!")));;
			return  user;

	}
	
	// Get all user
	public List<User> GetAll(){
		
	    return userRepository.findAll();
	}
	
	
	
}
