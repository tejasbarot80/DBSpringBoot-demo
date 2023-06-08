package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class staffDao implements staffservice {

	@Autowired
	staffRepo sr;

	@Override
	public void register(staff s1) 
	{
		sr.save(s1);
		
	}
	

}
