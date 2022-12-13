package com.Segnalazioni.Covid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Segnalazioni.Covid.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepo;

}
