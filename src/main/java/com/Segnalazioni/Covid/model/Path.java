package com.Segnalazioni.Covid.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Path {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPath;
	private String description;

	public Path() {
		super();
	}

	public Long getIdPath() {
		return idPath;
	}

	public void setIdPath(Long idPath) {
		this.idPath = idPath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
