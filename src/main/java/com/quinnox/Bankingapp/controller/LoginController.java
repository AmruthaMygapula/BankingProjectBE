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

import com.quinnox.Bankingapp.dao.LoginRepository;
import com.quinnox.Bankingapp.entities.Login;

@RestController
@CrossOrigin(origins="*",allowedHeaders = "*")
public class LoginController {
	
	@Autowired
	LoginRepository loginrepo;
	
	
	@PostMapping("/addlogin")
	public String addLogin(@RequestBody Login login) {
		loginrepo.save(login);
		return "Login Added Successfully";
		
	}

	@PutMapping("/updatelogin")
	public String updateLogin(@RequestBody Login login) {
		loginrepo.save(login);
		return "Login Updated successfully";
		
	}
	
	@GetMapping("/getalllogins")
	public List<Login> getAllLogins() {
	return loginrepo.findAll();
	
	}
	
	@DeleteMapping("/deletelogin")
	public String deleteLogin(int loginId) {
		loginrepo.deleteById(loginId);
		return "Login deleted Successfully";
		
	}
}
