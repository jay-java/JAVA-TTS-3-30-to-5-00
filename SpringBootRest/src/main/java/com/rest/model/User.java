package com.rest.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private long contact;
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Vehicle vehicle;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, long contact, String address, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.vehicle = vehicle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + ", vehicle="
				+ vehicle + "]";
	}

}
