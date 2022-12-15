package com.Segnalazioni.Covid.model.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.Segnalazioni.Covid.model.Roles;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class PersonDTO {

	private String fiscalCode;

	private String name;

	private String surname;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dateOfBirth;

	@Enumerated(EnumType.STRING)
	private Roles role;

	public PersonDTO() {
		super();
	}

	public String getFiscalCode() {
		return fiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

}
