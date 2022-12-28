package com.Segnalazioni.Covid.util;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.Segnalazioni.Covid.model.Person;
import com.Segnalazioni.Covid.model.Roles;
import com.opencsv.CSVReader;

public class MyPersonFileReader {

	public static List<Person> read(FileReader file) throws IOException, ParseException {

		CSVReader reader = new CSVReader(file, ',', '\'');
		List<Person> personList = new ArrayList<>();
		String[] record = null;
		while ((record = reader.readNext()) != null) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate dateOfBirth = LocalDate.parse(record[3], formatter);
			Person person = new Person();
			person.setFiscalCode(record[0]);
			person.setName(record[1]);
			person.setSurname(record[2]);
			person.setDateOfBirth(dateOfBirth);
			if (record[4].equalsIgnoreCase("DIPENDENTE"))
				person.setRole(Roles.DIPENDENTE);
			if (record[4].equalsIgnoreCase("MANAGER"))
				person.setRole(Roles.MANAGER);
			personList.add(person);
		}
		reader.close();
		return personList;
	}

}
