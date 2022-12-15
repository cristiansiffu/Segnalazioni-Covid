package com.Segnalazioni.Covid.service.Impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.Segnalazioni.Covid.model.Report;
import com.Segnalazioni.Covid.model.TypeOfReport;
import com.Segnalazioni.Covid.service.ReportService;

public class ReportServiceImpl implements ReportService {

	@Override
	public Report add(Report report) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Report update(Report report) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Report> findAll(java.awt.print.Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Report> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<Report>> findByTypeOfReport(TypeOfReport type) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<Report>> findByReportingDate(Date reportingDate) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
}
