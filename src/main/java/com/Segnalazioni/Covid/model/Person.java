package com.Segnalazioni.Covid.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fiscalCode;
	private String name;
	private String surname;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dateOfBirth;
	private Roles role;
	@ManyToOne(fetch = FetchType.EAGER, cascade =CascadeType.MERGE)
	private List<Report> reportList;
	

}
