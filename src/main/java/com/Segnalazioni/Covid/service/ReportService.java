package com.Segnalazioni.Covid.service;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.Segnalazioni.Covid.model.Report;
import com.Segnalazioni.Covid.model.TypeOfReport;

public interface ReportService {
	
	/***************** CRUD *****************/
	public Report add(Report report);
	public void delete(Long id);
	public Report update (Report report);
	public Page<Report> findAll(Pageable page);
	
	/***************** FILTRI RICERCA *****************/
	public Optional<Report> findById(Long id);
	public Optional<List<Report>> findByTypeOfReport(TypeOfReport type);
	public Optional <List<Report>> findByReportingDate(Date reportingDate);

}
