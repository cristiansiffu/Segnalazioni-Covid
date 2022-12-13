package com.Segnalazioni.Covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Segnalazioni.Covid.model.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {

}
