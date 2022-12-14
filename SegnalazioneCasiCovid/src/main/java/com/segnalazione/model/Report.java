package com.segnalazione.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Report {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idReport;
	@ManyToOne
	private Person persons;
}
