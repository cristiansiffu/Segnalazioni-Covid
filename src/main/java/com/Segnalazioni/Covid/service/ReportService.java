package com.Segnalazioni.Covid.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Segnalazioni.Covid.model.Report;
import com.Segnalazioni.Covid.model.TypeOfReport;

public interface ReportService {
	
	/***************** CRUD *****************/
	public Report add(Report report);
	public Page<Report> getAll(Pageable page);
	
	/***************** FILTRI RICERCA *****************/
	public Report findById(Long id);
	public List<Report> findByReportingDate(Date reportingDate);
	public List<Report> findAllByDateBetween(Date dateMin, Date dateMax);


}
