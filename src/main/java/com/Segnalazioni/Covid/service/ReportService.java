package com.Segnalazioni.Covid.service;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Segnalazioni.Covid.model.Report;
import com.Segnalazioni.Covid.model.TypeOfReport;

public interface ReportService {

	/***************** CRUD *****************/
	public Report findById(Long id);

	public Page<Report> getAll(Pageable pageable);

	public Report post(Report report);

	public Report put(Long id, Report report);

	public void delete(Long id);

	/***************** FILTRI RICERCA *****************/
	public Page<Report> findByFiscalCode(String fiscalCode, Pageable pageable);

	public Page<Report> findByTypeOfReport(TypeOfReport typeOfReport, Pageable pageable);

	public Page<Report> findByReportingDate(LocalDate reportingDate, Pageable pageable);

}
