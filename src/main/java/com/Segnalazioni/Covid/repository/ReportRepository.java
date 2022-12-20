package com.Segnalazioni.Covid.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Segnalazioni.Covid.model.Report;
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
	
	public List<Report> findAllByReportingDate(Date reportingDate);
	public List<Report> findAllByReportingDateBetween(Date minDate, Date maxDate);

}
