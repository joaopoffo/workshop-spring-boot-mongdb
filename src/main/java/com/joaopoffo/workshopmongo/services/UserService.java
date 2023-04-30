package com.joaopoffo.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaopoffo.workshopmongo.domain.User;
import com.joaopoffo.workshopmongo.repository.UserRepository;
import com.joaopoffo.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		User user = findById(id);
		if(user ==null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}
}
