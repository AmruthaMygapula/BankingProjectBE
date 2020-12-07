package com.quinnox.Bankingapp.service;

import java.util.List;

import com.quinnox.Bankingapp.entities.Transactions;


public interface TransactionService {

	public boolean addTransaction(Transactions dto);
	
	public boolean deleteTransaction(int transactionId);
	
	public boolean updateTransaction(Transactions dto);
	
	public List<Transactions> getAllTransactions();
	
}
