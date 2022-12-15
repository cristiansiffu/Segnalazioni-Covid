package com.Segnalazioni.Covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Segnalazioni.Covid.model.Report;
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

}
