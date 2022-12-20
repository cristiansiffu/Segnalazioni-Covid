package com.Segnalazioni.Covid.service;

import java.util.Optional;

import com.Segnalazioni.Covid.model.Path;

public interface PathService {
	
	public Optional<Path> findById(Long id);
	
	
	

}
