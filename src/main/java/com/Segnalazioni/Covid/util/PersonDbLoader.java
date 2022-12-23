package com.Segnalazioni.Covid.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Segnalazioni.Covid.model.Person;
import com.Segnalazioni.Covid.service.Impl.PersonServiceImpl;

@Component
public class PersonDbLoader implements CommandLineRunner {
	@Autowired
	private PersonServiceImpl personServiceImpl;
	@Value("${segnalazioni.personpath}")
	private String personPath;

	@Override
	public void run(String... args) throws Exception {
		FileReader fileReader = new FileReader(personPath);
		try {
			List<Person> personList = new ArrayList<>();
			personList = MyPersonFileReader.read(fileReader);
			for (Person p : personList)
				personServiceImpl.post(p);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
