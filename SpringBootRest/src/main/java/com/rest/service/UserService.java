package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.User;
import com.rest.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> getAllUser(){
		return this.repo.findAll();
	}
	
	public User addUser(User u) {
		this.repo.save(u);
		return u;
	}
	
	public Optional<User> getUserById(int id) {
		return this.repo.findById(id);
	}
	
	public User updateUesr(User u) {
		return this.repo.save(u);
	}
	
	
	public void deleteUser(int id) {
		this.repo.deleteById(id);
	}
}
