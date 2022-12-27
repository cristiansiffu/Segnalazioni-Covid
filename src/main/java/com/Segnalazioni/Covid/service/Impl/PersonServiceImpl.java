package com.Segnalazioni.Covid.service.Impl;

import java.time.LocalDate;
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
	private PersonRepository personRepository;

	@Override
	public Person findById(Long id) {
		Optional<Person> person = personRepository.findById(id);
		if (person.isEmpty()) {
			throw new SegnalazioniException("Person not found.");
		}
		return person.get();
	}

	@Override
	public Page<Person> getAll(Pageable pageable) {
		return personRepository.findAll(pageable);
	}

	@Override
	public Person post(Person person) {
		return personRepository.save(person);
	}

	@Override
	public Person put(Long id, Person person) {
		Optional<Person> update = personRepository.findById(id);
		if (update.isEmpty()) {
			throw new SegnalazioniException("Person not found.");
		}
		update.get().setFiscalCode(person.getFiscalCode());
		update.get().setName(person.getName());
		update.get().setSurname(person.getSurname());
		update.get().setRole(person.getRole());
		personRepository.save(update.get());
		return update.get();
	}

	@Override
	public void delete(Long id) {
		Optional<Person> person = personRepository.findById(id);
		if (person.isEmpty()) {
			throw new SegnalazioniException("Person not found.");
		}
		personRepository.deleteById(id);
	}

	@Override
	public Person findByFiscalCode(String fiscalCode) {
		Optional<Person> person = personRepository.findByFiscalCode(fiscalCode);
		if (person.isEmpty()) {
			throw new SegnalazioniException("Person not found.");
		}
		return person.get();
	}

	@Override
	public Page<Person> findByDateOfBirth(LocalDate dateOfBirth, Pageable pageable) {
		return personRepository.findAllByDateOfBirth(dateOfBirth, pageable);
	}

	@Override
	public Page<Person> findBySurname(String surname, Pageable pageable) {
		return personRepository.findBySurname(surname, pageable);
	}

}
