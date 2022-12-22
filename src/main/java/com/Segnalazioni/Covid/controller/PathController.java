package com.Segnalazioni.Covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Segnalazioni.Covid.model.Path;
import com.Segnalazioni.Covid.service.Impl.PathServiceImpl;

@RestController
@RequestMapping("path")
public class PathController {

	@Autowired
	private PathServiceImpl pathServiceImpl;

	public ResponseEntity<Path> getByIdCustomer(@PathVariable Long id) {
		Path path = pathServiceImpl.findById(id);
		return new ResponseEntity<Path>(path, HttpStatus.OK);
	}

}
