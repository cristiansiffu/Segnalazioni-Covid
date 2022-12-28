package com.Segnalazioni.Covid.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Segnalazioni.Covid.model.Report;
import com.Segnalazioni.Covid.model.TypeOfReport;
import com.Segnalazioni.Covid.model.dto.ReportDTO;
import com.Segnalazioni.Covid.model.dto.converter.ReportDTOConverter;
import com.Segnalazioni.Covid.service.Impl.ReportServiceImpl;

@RestController
@RequestMapping("/report")
public class ReportController {

	@Autowired
	private ReportDTOConverter reportDTOConverter;

	@Autowired
	private ReportServiceImpl reportServiceImpl;

	@GetMapping("/getById/{id}")
	public ResponseEntity<Report> getById(@PathVariable Long id) {
		Report report = reportServiceImpl.findById(id);
		return new ResponseEntity<Report>(report, HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<Page<Report>> getAllReport(Pageable pageable) {
		Page<Report> report = reportServiceImpl.getAll(pageable);
		return new ResponseEntity<>(report, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Report> add(@RequestBody ReportDTO reportDTO) {
		Report report = reportDTOConverter.convert(reportDTO);
		return new ResponseEntity<>(reportServiceImpl.post(report), HttpStatus.CREATED);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Report> update(@PathVariable Long id, @RequestBody ReportDTO reportDTO) {
		Report report = reportDTOConverter.convert(reportDTO);
		return new ResponseEntity<>(reportServiceImpl.put(id, report), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		reportServiceImpl.delete(id);
		return new ResponseEntity<String>("Successfully deleted.", HttpStatus.OK);
	}

	@GetMapping("/getByFiscalCode/{fiscalCode}")
	public ResponseEntity<Page<Report>> findByFiscalCode(@PathVariable String fiscalCode, Pageable pageable) {
		Page<Report> reports = reportServiceImpl.findByFiscalCode(fiscalCode, pageable);
		return new ResponseEntity<Page<Report>>(reports, HttpStatus.OK);
	}

	@GetMapping("/getByTypeOfReport/{typeOfReport}")
	public ResponseEntity<Page<Report>> findByTypeOfReport(@PathVariable TypeOfReport typeOfReport, Pageable pageable) {
		Page<Report> reports = reportServiceImpl.findByTypeOfReport(typeOfReport, pageable);
		return new ResponseEntity<Page<Report>>(reports, HttpStatus.OK);
	}

	@GetMapping("/getByReportingDate")
	public ResponseEntity<Page<Report>> findByReportingDate(
			@RequestParam("reportingDate") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate reportingDate,
			Pageable pageable) {
		Page<Report> reports = reportServiceImpl.findByReportingDate(reportingDate, pageable);
		return new ResponseEntity<Page<Report>>(reports, HttpStatus.OK);
	}

	@GetMapping("/getByDateBetween")
	public ResponseEntity<Page<Report>> findByDateBetween(
			@RequestParam("start") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate start,
			@RequestParam("end") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate end, Pageable pageable) {
		Page<Report> reports = reportServiceImpl.findAllByReportingDateBetween(start, end, pageable);
		return new ResponseEntity<Page<Report>>(reports, HttpStatus.OK);
	}

}
