package com.quinnox.Bankingapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.Bankingapp.dao.CustomerRepository;
import com.quinnox.Bankingapp.entities.Customer;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class CustomerController {

	@Autowired
	CustomerRepository customerrepo;


	@PostMapping("/addcustomer")

	public String addCustomer(@RequestBody Customer customer) {
		customerrepo.save(customer);
		return "Customer added successfully";
	}

	@GetMapping("/getallcustomers")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Customer> findAll(){
		return customerrepo.findAll();
	}

	@PutMapping("/updatecustomer")
	public String updateCustomer(@RequestBody Customer customer ) {
		customerrepo.save(customer);		
		return "Customer updated successfully";
	}

	@DeleteMapping("/deletecustomerbyid/{accountno}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String deletCustomerById(@PathVariable int accountno) {
		customerrepo.deleteById(accountno);
		return "Customer deleted successfully";
	}
	
	@GetMapping("/getCustomerById/{accountno}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Optional<Customer> getCustomerById(@PathVariable int accountno) {
		return customerrepo.findById(accountno);
		
}

//	@GetMapping("/transaction")
//	public Optional<Customer> getCustomerTransaction(int accountno,int openingbalance,int customerId) {
//		return customerrepo.findById(customerId);
//		
//		
//		
//	}

}
