package com.Segnalazioni.Covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Segnalazioni.Covid.model.Path;

public interface PathRepository extends JpaRepository<Path, Long> {

}
