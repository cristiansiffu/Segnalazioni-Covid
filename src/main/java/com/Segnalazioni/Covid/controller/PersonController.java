package com.Segnalazioni.Covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Segnalazioni.Covid.model.Person;
import com.Segnalazioni.Covid.model.dto.PersonDTO;
import com.Segnalazioni.Covid.model.dto.converter.PersonDTOConverter;
import com.Segnalazioni.Covid.service.Impl.PersonServiceImpl;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonDTOConverter personDTOConverter;

	@Autowired
	private PersonServiceImpl personServiceImpl;

	@GetMapping("/getAllPersons")
	public ResponseEntity<Page<Person>> getAllPersons(Pageable pageable) {
		Page<Person> persons = personServiceImpl.getAll(pageable);
		return new ResponseEntity<>(persons, HttpStatus.OK);
	}

	@PostMapping("/addPerson")
	public ResponseEntity<Person> addPerson(@RequestBody PersonDTO personDTO) {
		Person person = personDTOConverter.convert(personDTO);
		return new ResponseEntity<>(personServiceImpl.add(person), HttpStatus.CREATED);
	}

}
