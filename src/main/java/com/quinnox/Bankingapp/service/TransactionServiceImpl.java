package com.quinnox.Bankingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.Bankingapp.dao.TransactionRepositry;
import com.quinnox.Bankingapp.entities.Transactions;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	TransactionRepositry transrepo;
	
	@Override
	public boolean addTransaction(Transactions dto) {
		transrepo.save(dto);
		return true;
	}

	@Override
	public boolean deleteTransaction(int transactionId) {
		transrepo.deleteById(transactionId);
		return true;
	}

	@Override
	public boolean updateTransaction(Transactions dto) {
		transrepo.save(dto);
		return true;
	}

	@Override
	public List<Transactions> getAllTransactions() {
		
		
		return transrepo.findAll();
	}

}
