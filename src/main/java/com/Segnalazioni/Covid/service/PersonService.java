package com.Segnalazioni.Covid.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.Segnalazioni.Covid.model.Person;

public interface PersonService {
	
	/***************** CRUD *****************/
	public Person add(Person person);
	public void delete (Long Id);
	public Person update (Person person);
	public List<Person> findAll();
	
	/***************** FILTRI RICERCA *****************/
	
	public Optional<Person> findById (Long id);
	public Optional<List<Person>> findBySurname(String surname);
	public Optional<Person> findByFiscalCode (String fiscalCode);
	
	
}
