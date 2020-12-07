package com.quinnox.Bankingapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "transactions")
@Data
public class Transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transId;
	
	
	@Column(name="balance")
	private int balance;
	
	@Column(name="beneficiaryname")
	private String beneficiaryname;
	
	
	@Column(name="customerid")
	private int customerid;
	
	@Column(name="date")
	private String date;
	
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="debit")
	private int debit;
	
	@Column(name="credit")
	private int credit;
	
//
//	@Column(name="balance")
//	private int balance;
//	
//	
	
	
}
