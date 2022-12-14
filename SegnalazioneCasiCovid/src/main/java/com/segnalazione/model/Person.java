package com.segnalazione.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPerson;
	private String fiscalCode;
	private String name;
	private String surname;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dateOfBirth;
	@Enumerated(EnumType.STRING)
	private Roles role;
	@OneToMany(mappedBy = "person")
	private List<Report> reports = new ArrayList<>();
}
