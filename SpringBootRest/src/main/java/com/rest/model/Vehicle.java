package com.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vid;
	private String vname;
	private double vprice;
	
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vid, String vname, double vprice) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vprice = vprice;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public double getVprice() {
		return vprice;
	}
	public void setVprice(double vprice) {
		this.vprice = vprice;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", vprice=" + vprice + "]";
	}
	
}
