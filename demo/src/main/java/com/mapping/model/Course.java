package com.mapping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String cname;
	private double c_price;
	private String c_duration;
}
