package com.Segnalazioni.Covid.model.dto.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.Segnalazioni.Covid.model.Person;
import com.Segnalazioni.Covid.model.dto.PersonDTO;

@Component
public class PersonDTOConverter implements Converter<PersonDTO, Person> {

	@Override
	public Person convert(PersonDTO source) {
		Person person = new Person();
		person.setIdPerson(source.getIdPerson());
		person.setDateOfBirth(source.getDateOfBirth());
		person.setFiscalCode(source.getFiscalCode());
		person.setName(source.getName());
		person.setRole(source.getRole());
		person.setSurname(source.getSurname());
		return person;
	}

}
