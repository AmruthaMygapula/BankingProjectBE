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

import com.quinnox.Bankingapp.entities.Beneficiary;
import com.quinnox.Bankingapp.entities.Customer;
import com.quinnox.Bankingapp.service.BeneficiaryService;

@RestController
@CrossOrigin(origins="*",allowedHeaders = "*")
public class BeneficiaryController {
	
	
	@Autowired
	BeneficiaryService service;
	
	@PostMapping("/addbeneficiary")
	public String addBeneficiary(@RequestBody Beneficiary dto) {
	service.addBeneficiary(dto);
		return "beneficiary added successfully";
	}

	@PutMapping("/updatebeneficiary")
	public String updateBeneficiary(@RequestBody Beneficiary dto) {
		service.updateBeneficiary(dto);
		return "beneficiary updated successfully";
	}
	
	@DeleteMapping("/deletebeneficiary/{accountno}")
//	@CrossOrigin(origins = "http://localhost:4200")
	public String deleteBeneficiary(@PathVariable int accountno) {
		service.deleteBeneficiary(accountno);
		return "beneficiary deleted successfully";
	}
	
	@GetMapping("/getallbeneficiary")
	public List<Beneficiary> getAllBeneficiary() {
	return service.getAllBeneficiary();
	}
	
	@GetMapping("/getBeneficiaryById/{accountno}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Optional<Beneficiary> getCustomerById(@PathVariable int accountno) {
		return service.getBeneficiaryById(accountno);
		
}
	
}
