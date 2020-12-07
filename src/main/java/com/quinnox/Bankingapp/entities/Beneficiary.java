package com.quinnox.Bankingapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="beneficiary")
public class Beneficiary {

	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	

	@Column(name="accountno")
	private int accountno;
	

	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="benfId")
	private int benfId;
	
	
	@Column(name="emailId")
	private String emailId;
	
	@Column(name="phoneNo")
	private String phoneNo;
	
}
