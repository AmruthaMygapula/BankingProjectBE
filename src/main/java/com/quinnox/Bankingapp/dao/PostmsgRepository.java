package com.quinnox.Bankingapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quinnox.Bankingapp.entities.Postmsg;

@Repository
public interface PostmsgRepository extends JpaRepository<Postmsg,Integer>
{
	

}
