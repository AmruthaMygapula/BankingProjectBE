package com.quinnox.Bankingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.Bankingapp.entities.Transactions;
import com.quinnox.Bankingapp.service.TransactionService;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")

public class TransactionsController {

	@Autowired
	TransactionService transervice;
	
	@PostMapping("/transaction")
	public String addTransaction(@RequestBody Transactions dto) {
		transervice.addTransaction(dto);
		return "Transaction addded successfully";
	}
	
	@PutMapping("/transaction")
	public String updateTransaction(@RequestBody Transactions dto) {
		transervice.updateTransaction(dto);
		return "Transaction updated successfully";
	}
	
	@DeleteMapping("/transaction")
	public String deleteTransaction(int transactionId) {
	transervice.deleteTransaction(transactionId);
		return "Transaction deleted Successfully";
	}
	
	@GetMapping("/getalltransactions")
	public List<Transactions> getAllTransactions() {
		return transervice.getAllTransactions();
		
	}
	
	

	
	
	
	
}
