package com.Segnalazioni.Covid.service;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Segnalazioni.Covid.model.Person;

public interface PersonService {

	/***************** CRUD *****************/
	public Person findById(Long id);

	public Page<Person> getAll(Pageable pageable);

	public Person post(Person person);

	public Person put(Long id, Person person);

	public void delete(Long id);

	/***************** FILTRI RICERCA *****************/
	public Person findByFiscalCode(String fiscalCode);

	public Page<Person> findByDateOfBirth(Date dateOfBirth, Pageable pageable);

	public Page<Person> findBySurname(String surname, Pageable pageable);

}
