package com.Segnalazioni.Covid.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Path {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReport;
	private String description;

}
