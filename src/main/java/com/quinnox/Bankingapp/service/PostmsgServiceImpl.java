package com.quinnox.Bankingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.Bankingapp.dao.PostmsgRepository;
import com.quinnox.Bankingapp.entities.Postmsg;

@Service
public class PostmsgServiceImpl implements PostmsgService{

	@Autowired
	  PostmsgRepository msgrepo;

    public boolean addmsg(Postmsg dto) {
    	msgrepo.save(dto);
		return true;
    	
    }
	
	
}
