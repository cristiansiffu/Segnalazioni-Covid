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

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepo;

	@Override
	public Person add(Person person) {
			return personRepo.save(person);
	}

	@Override
	public Page<Person> getAll(Pageable page) {
		return personRepo.findAll(page);
	}

	@Override
	public Person findById(Long id) {
		Optional<Person> person = personRepo.findById(id);
		if (person.isEmpty()) {
			throw new SegnalazioniException("Person not found.");
		}
		return person.get();
	}

	@Override
	public Optional<List<Person>> findBySurname(String surname) {
		Optional<List<Person>> personList = personRepo.findBySurname(surname);
		if (personList.isEmpty()) {
			throw new SegnalazioniException("Person not found.");
		}
		return personList;
	}

	@Override
	public Person findByFiscalCode(String fiscalCode) {
		Optional<Person> person = personRepo.findByFiscalCode(fiscalCode);
		if (person.isEmpty()) {
			throw new SegnalazioniException("Person not found.");
		}
		return person.get();
	}

}
