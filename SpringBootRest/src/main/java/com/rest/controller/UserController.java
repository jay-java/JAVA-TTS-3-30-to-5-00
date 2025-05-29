package com.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.User;
import com.rest.service.UserService;
import com.rest.service.VehicleService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private VehicleService vehicleService;
	
	@GetMapping("/")
	public String msg() {
		return "hello users";
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return this.service.getAllUser();
	}
	
	@PostMapping("/users")
	public User postMethodName(@RequestBody User u) {
		System.out.println(u);
		System.out.println(u.getVehicle());
		this.vehicleService.addVehicle(u.getVehicle());
		this.service.addUser(u);
		return u;
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable("id") int id) {
		return this.service.getUserById(id);
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User u) {
		return this.service.updateUesr(u);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable("id") int id) {
		this.service.deleteUser(id);
	}
	
}
