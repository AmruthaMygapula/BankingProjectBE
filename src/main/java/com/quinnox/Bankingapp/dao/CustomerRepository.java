package com.quinnox.Bankingapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quinnox.Bankingapp.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,	Integer>{



	
}
