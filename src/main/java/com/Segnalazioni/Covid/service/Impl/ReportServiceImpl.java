package com.Segnalazioni.Covid.service.Impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Segnalazioni.Covid.exception.SegnalazioniException;
import com.Segnalazioni.Covid.model.Report;
import com.Segnalazioni.Covid.model.TypeOfReport;
import com.Segnalazioni.Covid.repository.PersonRepository;
import com.Segnalazioni.Covid.repository.ReportRepository;
import com.Segnalazioni.Covid.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository reportRepository;

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Report findById(Long id) {
		Optional<Report> report = reportRepository.findById(id);
		if (report.isEmpty()) {
			throw new SegnalazioniException("Report not found.");
		}
		return report.get();
	}

	@Override
	public Page<Report> getAll(Pageable pageable) {
		Page<Report> reports = reportRepository.findAll(pageable);
		for (Report r : reports) {
			r.getPerson().setReportList(null);
		}
		return reports;
	}

	@Override
	public Report post(Report report) {
		return reportRepository.save(report);
	}

	@Override
	public Report put(Long id, Report report) {
		Optional<Report> update = reportRepository.findById(id);
		if (update.isEmpty()) {
			throw new SegnalazioniException("Report not found.");
		}
		update.get().setTypeOfReport(report.getTypeOfReport());
		reportRepository.save(update.get());
		return update.get();
	}

	@Override
	public void delete(Long id) {
		Optional<Report> report = reportRepository.findById(id);
		if (report.isEmpty()) {
			throw new SegnalazioniException("Report not found.");
		}
		reportRepository.deleteById(id);
	}

	@Override
	public Page<Report> findByFiscalCode(String fiscalCode, Pageable pageable) {
		Page<Report> reports = reportRepository.findByPerson(personRepository.findByFiscalCode(fiscalCode).get(),
				pageable);
		for (Report r : reports) {
			r.getPerson().setReportList(null);
		}
		return reports;
	}

	@Override
	public Page<Report> findByTypeOfReport(TypeOfReport typeOfReport, Pageable pageable) {
		return reportRepository.findByTypeOfReport(typeOfReport, pageable);
	}

	@Override
	public Page<Report> findByReportingDate(Date reportingDate, Pageable pageable) {
		return reportRepository.findByReportingDateOrderByReportingDate(reportingDate, pageable);
	}

}
