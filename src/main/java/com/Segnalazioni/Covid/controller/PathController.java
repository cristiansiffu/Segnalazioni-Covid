package com.Segnalazioni.Covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Segnalazioni.Covid.service.Impl.PathServiceImpl;

@RestController
@RequestMapping("path")
public class PathController {

	@Autowired
	private PathServiceImpl pathServiceImpl;

}
