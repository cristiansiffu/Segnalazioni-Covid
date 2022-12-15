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
import com.Segnalazioni.Covid.model.TypeOfReport;
import com.Segnalazioni.Covid.repository.ReportRepository;
import com.Segnalazioni.Covid.service.ReportService;
@Service
public class ReportServiceImpl implements ReportService {
@Autowired
private ReportRepository reportRepo;
	@Override
	public Report add(Report report) {
		Optional<Report> newReport = reportRepo.findById(report.getIdReport());
		if(!newReport.isPresent())
			return reportRepo.save(report);
		else
			throw new SegnalazioniException("report gia' esistente");
	}

	@Override
	public void delete(Long id) {
		Optional<Report> reportResult= reportRepo.findById(id);
		if(reportResult.isPresent())
			reportRepo.deleteById(id);
		else
			throw new SegnalazioniException("Impossibile eliminare il report");
		
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
