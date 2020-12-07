package com.quinnox.Bankingapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quinnox.Bankingapp.dao.BeneficiaryRepository;
import com.quinnox.Bankingapp.entities.Beneficiary;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService{

	@Autowired
	BeneficiaryRepository benrepo;

	
	public boolean addBeneficiary(Beneficiary dto) {
		benrepo.save(dto);
		return true;
	}

	public boolean updateBeneficiary(Beneficiary dto) {
		benrepo.save(dto);
		return true;
	}


	public List<Beneficiary> getAllBeneficiary() {
		return benrepo.findAll();
	}


	public boolean deleteBeneficiary(int accountno) {
		benrepo.deleteById(accountno);
		return true;
	}

	
	public Optional<Beneficiary> getBeneficiaryById(int accountno) {
		return benrepo.findById(accountno);
	}

	
}
