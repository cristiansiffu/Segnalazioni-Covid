package com.Segnalazioni.Covid.util;

import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Segnalazioni.Covid.model.Person;
import com.opencsv.CSVReader;

public class MyPersonFileReader {

	public static List<Person> read(FileReader file) throws IOException, ParseException {
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
			person.setDateOfBirth(dateOfBirth);
			personList.add(person);
		}
		reader.close();
		return personList;
	}

}
