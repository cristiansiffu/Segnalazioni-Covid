package com.Segnalazioni.Covid.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReport;
	private TypeOfReport typeOfReport;
	@ManyToOne(fetch = FetchType.EAGER, cascade =CascadeType.MERGE)
	private Person person;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date reportingDate;
	private Triage triage;
	private Abstention abstention;
	private Disinfection disinfection;
	private String question1;
	private String question2;
	private String question3;
	private String question4;
	private String question5;
	private String question6;
	private String question7;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String answer5;
	private String answer6;
	private String answer7;
	private NewClassification newClassification;
	private OldClassification oldClassification;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date proposedAbstentionDate;
	
	
	
	

}
