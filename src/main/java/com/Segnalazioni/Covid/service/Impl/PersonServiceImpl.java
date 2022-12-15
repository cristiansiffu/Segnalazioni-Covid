package com.Segnalazioni.Covid.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.Segnalazioni.Covid.exception.SegnalazioniException;

import com.Segnalazioni.Covid.model.Person;
import com.Segnalazioni.Covid.repository.PersonRepository;
import com.Segnalazioni.Covid.service.PersonService;

public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepo;

	@Override
	public Person add(Person person) {
		Optional<Person> newPerson= personRepo.findById(person.getIdPerson());
		if(!newPerson.isPresent())
			return personRepo.save(person);
		else
			throw new SegnalazioniException("Dipendente gia' esistente");
	}

	@Override
	public void delete(Long Id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person update(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findAll() {
		return personRepo.findAll();
	}

	@Override
	public Optional<Person> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<Person>> findBySurname(String surname) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Person> findByFiscalCode(String fiscalCode) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
}
