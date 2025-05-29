package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Vehicle;
import com.rest.repository.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;
	
	public Vehicle addVehicle(Vehicle v) {
		return this.vehicleRepository.save(v);
	}
}
