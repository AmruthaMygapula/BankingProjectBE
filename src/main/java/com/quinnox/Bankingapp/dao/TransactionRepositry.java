package com.quinnox.Bankingapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quinnox.Bankingapp.entities.Transactions;

@Repository
public interface TransactionRepositry  extends JpaRepository<Transactions, Integer>{

}
