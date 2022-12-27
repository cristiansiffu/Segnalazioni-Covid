package com.Segnalazioni.Covid.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Segnalazioni.Covid.model.Person;
import com.Segnalazioni.Covid.model.dto.PersonDTO;
import com.Segnalazioni.Covid.model.dto.converter.PersonDTOConverter;
import com.Segnalazioni.Covid.service.Impl.PersonServiceImpl;

@RestController
@RequestMapping("person")
public class PersonController {

	@Autowired
	private PersonDTOConverter personDTOConverter;

	@Autowired
	private PersonServiceImpl personServiceImpl;

	@GetMapping("/getById/{id}")
	public ResponseEntity<Person> getById(@PathVariable Long id) {
		Person person = personServiceImpl.findById(id);
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<Page<Person>> getAll(Pageable pageable) {
		Page<Person> persons = personServiceImpl.getAll(pageable);
		return new ResponseEntity<>(persons, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Person> add(@RequestBody PersonDTO personDTO) {
		Person person = personDTOConverter.convert(personDTO);
		return new ResponseEntity<>(personServiceImpl.post(person), HttpStatus.CREATED);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody PersonDTO personDTO) {
		Person person = personDTOConverter.convert(personDTO);
		return new ResponseEntity<>(personServiceImpl.put(id, person), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		personServiceImpl.delete(id);
		return new ResponseEntity<String>("Successfully deleted.", HttpStatus.OK);
	}

	@GetMapping("/getByFiscalCode/{fiscalCode}")
	public ResponseEntity<Person> getByFiscalCode(@PathVariable String fiscalCode) {
		Person person = personServiceImpl.findByFiscalCode(fiscalCode);
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}

	@GetMapping("/getByDateOfBirth")
	public ResponseEntity<Page<Person>> findByDateOfBirth(
			@RequestParam("dateOfBirth") @DateTimeFormat(pattern = "dd-MM-yyyy") Date dateOfBirth, Pageable pageable) {
		Page<Person> persons = personServiceImpl.findByDateOfBirth(dateOfBirth, pageable);
		return new ResponseEntity<Page<Person>>(persons, HttpStatus.OK);
	}

	@GetMapping("/getBySurname")
	public ResponseEntity<Page<Person>> getBySurname(@RequestParam String surname, Pageable pageable) {
		Page<Person> persons = personServiceImpl.findBySurname(surname, pageable);
		return new ResponseEntity<Page<Person>>(persons, HttpStatus.OK);
	}

}
