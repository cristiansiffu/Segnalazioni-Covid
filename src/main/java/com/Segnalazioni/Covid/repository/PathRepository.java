package com.Segnalazioni.Covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Segnalazioni.Covid.model.Path;
@Repository
public interface PathRepository extends JpaRepository<Path, Long> {

}
