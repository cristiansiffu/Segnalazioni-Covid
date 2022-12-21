package com.Segnalazioni.Covid.util;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.Segnalazioni.Covid.model.Person;
import com.opencsv.CSVReader;

public class MyPersonFileReader {
	
	public static List<Person> read (FileReader file) throws IOException{
		CSVReader reader = new CSVReader(file,',','\'');
		List<Person> personList= new ArrayList<>();
		String[] record= null;
		while((record= reader.readNext())!=null) {
			Person person = new Person();
			//person.setDateOfBirth(LocalDate.parse(record[3]));
			person.setFiscalCode(record[0]);
			person.setName(record[1]);
			person.setSurname(record[2]);
			personList.add(person);
		}
		reader.close();
		return personList;
	}

}
