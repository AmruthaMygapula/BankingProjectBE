package com.quinnox.Bankingapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quinnox.Bankingapp.entities.Beneficiary;


public interface BeneficiaryRepository  extends JpaRepository<Beneficiary, Integer>{

	
}
