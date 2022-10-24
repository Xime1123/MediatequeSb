package com.plb.projectSb.service;
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
	
	
	// Get user by login
	public Optional<User> findByLogin(String login) {
			return  this.userRepository.findByLogin(login);

	}
	
}
