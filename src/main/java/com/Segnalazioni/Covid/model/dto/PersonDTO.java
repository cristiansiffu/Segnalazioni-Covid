package com.Segnalazioni.Covid.model.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.Segnalazioni.Covid.model.Roles;

public class PersonDTO {

	private Long idPerson;
	private String fiscalCode;
	private String name;
	private String surname;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	private Roles role;
	private List<ReportDTO> reportList;

	/***************CONSTRUCTOR*****************/
	
	public PersonDTO() {
		super();
	}

	/***************GETTER*****************/
	
	public Long getIdPerson() {
		return idPerson;
	}

	public String getFiscalCode() {
		return fiscalCode;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Roles getRole() {
		return role;
	}

	public List<ReportDTO> getReportList() {
		return reportList;
	}
	
	/***************SETTER*****************/

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	public void setReportList(List<ReportDTO> reportList) {
		this.reportList = reportList;
	}
	
	

	
}
