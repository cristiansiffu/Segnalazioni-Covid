package com.Segnalazioni.Covid.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Segnalazioni.Covid.exception.SegnalazioniException;
import com.Segnalazioni.Covid.model.Path;
import com.Segnalazioni.Covid.repository.PathRepository;
import com.Segnalazioni.Covid.service.PathService;
@Service
public class PathServiceImpl implements PathService {
@Autowired
private PathRepository pathRepo;
	@Override
	public Path findById(Long id) {
		Optional <Path> path= pathRepo.findById(id);
		if(path.isEmpty())
			throw new SegnalazioniException("Percorso nnon trovato");
		return path.get();
	}

}
