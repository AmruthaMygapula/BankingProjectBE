package com.quinnox.Bankingapp.service;

import java.util.List;
import java.util.Optional;

import com.quinnox.Bankingapp.entities.Beneficiary;

public interface BeneficiaryService {

	public boolean addBeneficiary(Beneficiary dto);
	
	public boolean updateBeneficiary(Beneficiary dto);
	
	public List<Beneficiary> getAllBeneficiary();
	
	public boolean deleteBeneficiary(int accountNo);
	
	public Optional<Beneficiary> getBeneficiaryById( int accountno) ;

}
