package com.Segnalazioni.Covid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Segnalazioni.Covid.repository.PathRepository;
@Service
public class PathService {
	
	@Autowired
	private PathRepository pathRepo;
	

}
