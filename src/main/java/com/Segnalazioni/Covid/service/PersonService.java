package com.Segnalazioni.Covid.service;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Segnalazioni.Covid.model.Person;

public interface PersonService {
	
	/***************** CRUD *****************/
	public Person add(Person person);
	public Page<Person> getAll(Pageable page);
	
	/***************** FILTRI RICERCA *****************/
	
	public Person findById (Long id);
	public Optional<List<Person>>  findBySurname(String surname);
	public Person findByFiscalCode (String fiscalCode);
	
	
}
