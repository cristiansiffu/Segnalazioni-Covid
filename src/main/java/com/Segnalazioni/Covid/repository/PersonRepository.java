package com.Segnalazioni.Covid.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Segnalazioni.Covid.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	public Optional<Person> findById(Long id);

	public Optional<Person> findByFiscalCode(String fiscalCode);

	public Page<Person> findAllByDateOfBirth(Date dateOfBirth, Pageable pageable);

	public Page<Person> findBySurname(String surname, Pageable pageable);

}
