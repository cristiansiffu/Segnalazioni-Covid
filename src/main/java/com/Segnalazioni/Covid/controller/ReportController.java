package com.Segnalazioni.Covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Segnalazioni.Covid.model.Report;
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
	
	@GetMapping("/getAllReport")
	public ResponseEntity<Page<Report>> getAllReport(Pageable pageable){
		Page<Report> report=reportServiceImpl.getAll(pageable);
		return new ResponseEntity<>(report, HttpStatus.OK);
	}
	
	@PostMapping("/addReport")
	public ResponseEntity<Report> addReport(@RequestBody ReportDTO reportDTO){
			Report report = reportDTOConverter.convert(reportDTO);
			return new ResponseEntity<Report>(reportServiceImpl.add(report), HttpStatus.CREATED);
	}
	}


