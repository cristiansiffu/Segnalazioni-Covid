package com.Segnalazioni.Covid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Segnalazioni.Covid.repository.ReportRepository;

@Service
public class ReportService {
@Autowired
private ReportRepository reportRepo;
}