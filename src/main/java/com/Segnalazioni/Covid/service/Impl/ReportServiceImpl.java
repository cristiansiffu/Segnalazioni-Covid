package com.Segnalazioni.Covid.service.Impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.Segnalazioni.Covid.exception.SegnalazioniException;
import com.Segnalazioni.Covid.model.Report;

import com.Segnalazioni.Covid.repository.ReportRepository;
import com.Segnalazioni.Covid.service.ReportService;
@Service
public class ReportServiceImpl implements ReportService {
@Autowired
private ReportRepository reportRepo;
	@Override
	public Report add(Report report) {
		return reportRepo.save(report);
	}

	@Override
	public Report findById(Long id) {
		Optional<Report> report= reportRepo.findById(id);
		if(report.isEmpty())
			throw new SegnalazioniException("Report not found.");
		return report.get();
	}


	@Override
	public List<Report> findByReportingDate(Date reportingDate) {
		return reportRepo.findAllByReportingDate(reportingDate);
	}


	@Override
	public Page<Report> getAll(Pageable page) {
		return reportRepo.findAll(page);
	}

	@Override
	public List<Report> findAllByDateBetween(Date dateMin, Date dateMax) {
		return reportRepo.findAllByReportingDateBetween(dateMin, dateMax);
	}

	
}
