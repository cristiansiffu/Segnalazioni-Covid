package com.Segnalazioni.Covid.util;

import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.BeanDefinitionDsl.Role;

import com.Segnalazioni.Covid.model.Person;
import com.Segnalazioni.Covid.model.Roles;
import com.opencsv.CSVReader;

public class MyPersonFileReader {

	public static List<Person> read(FileReader file) throws IOException, ParseException {
		Roles dipendente= Roles.DIPENDENTE;
		Roles manager= Roles.MANAGER;
		
		CSVReader reader = new CSVReader(file, ',', '\'');
		List<Person> personList = new ArrayList<>();
		String[] record = null;
		while ((record = reader.readNext()) != null) {
			DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			Date dateOfBirth;
			Person person = new Person();
			person.setFiscalCode(record[0]);
			person.setName(record[1]);
			person.setSurname(record[2]);
			dateOfBirth = formatter.parse(record[3]);
			if (record[4]=="DIPENDENTE")
				person.setRole(dipendente);
			else if (record [4]=="MANAGER")
				person.setRole(manager);
			else
				person.setRole(null);
			person.setDateOfBirth(dateOfBirth);
			personList.add(person);
		}
		reader.close();
		return personList;
	}

}
