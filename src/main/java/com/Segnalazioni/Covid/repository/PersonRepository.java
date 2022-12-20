package com.Segnalazioni.Covid.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Segnalazioni.Covid.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	public Optional<List<Person>> findBySurname(String surname);

	public Optional<Person> findByFiscalCode(String fiscalCode);

}
