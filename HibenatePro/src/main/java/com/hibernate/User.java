package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="user_data")
public class User {
	@Id
	@Column(name="user_id")
	private int id;
	@Column(name="user_name")
	private String name;
	private long contact;
	private String email;
	private String password;
}
