package com.Segnalazioni.Covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Segnalazioni.Covid.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	
	

}
