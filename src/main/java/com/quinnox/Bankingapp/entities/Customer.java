package com.quinnox.Bankingapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="customer")
@Data
public class Customer {

	@Column(name="lastname")
	private String lastname;
	
	@Column(name="firstname")
	private String firstname;

	@Column(name="dob")
	private String dob;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="aadaharno")
	private int aadaharno;

	
	@Column(name="emailid")
	private String emailid;
	
	@Column(name="address")
	private String address;
	
	@Column(name="bankbranch")
	private String bankbranch;
	
	@Column(name="pin")
	private int pin;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="openingbalance")
	private int openingbalance;
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int customerId;
//	
	@Id
	@Column(name="accountno")
		private int accountno;
	
	@Column(name="role")
	private String role;
	
	





}
