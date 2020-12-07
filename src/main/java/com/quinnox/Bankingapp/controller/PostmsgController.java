package com.quinnox.Bankingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.Bankingapp.entities.Postmsg;
import com.quinnox.Bankingapp.service.PostmsgService;

@RestController
@CrossOrigin(origins="*",allowedHeaders = "*")

public class PostmsgController {

	@Autowired
	PostmsgService msgservice;
	
	@PostMapping("/postmsg")
	public String addPost(Postmsg dto) {
		msgservice.addmsg(dto);
		return "message added successfully";
	}
}
