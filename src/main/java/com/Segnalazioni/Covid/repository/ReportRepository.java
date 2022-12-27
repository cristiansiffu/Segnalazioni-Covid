package com.Segnalazioni.Covid.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Segnalazioni.Covid.model.Person;
import com.Segnalazioni.Covid.model.Report;
import com.Segnalazioni.Covid.model.TypeOfReport;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

	public Optional<Report> findById(Long id);

	public Page<Report> findByPerson(Person fiscalCode, Pageable pageable);

	public Page<Report> findByTypeOfReport(TypeOfReport typeOfReport, Pageable pageable);

	public Page<Report> findAllByReportingDate(LocalDate reportingDate, Pageable pageable);

}
