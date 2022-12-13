package com.Segnalazioni.Covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Segnalazioni.Covid.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
