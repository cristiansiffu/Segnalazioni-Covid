package com.Segnalazioni.Covid.model.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.Segnalazioni.Covid.model.Abstention;
import com.Segnalazioni.Covid.model.Disinfection;
import com.Segnalazioni.Covid.model.NewClassification;
import com.Segnalazioni.Covid.model.OldClassification;
import com.Segnalazioni.Covid.model.Triage;
import com.Segnalazioni.Covid.model.TypeOfReport;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

public class ReportDTO {
	
	@Enumerated(EnumType.STRING)
	private TypeOfReport typeOfReport;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	private Long person;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date reportingDate;
	@Enumerated(EnumType.STRING)
	private Triage triage;
	@Enumerated(EnumType.STRING)
	private Abstention abstention;
	@Enumerated(EnumType.STRING)
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
	@Enumerated(EnumType.STRING)
	private NewClassification newClassification;
	@Enumerated(EnumType.STRING)
	private OldClassification oldClassification;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date proposedAbstentionDate;
	
	public ReportDTO() {
		super();
	}

	public TypeOfReport getTypeOfReport() {
		return typeOfReport;
	}

	public void setTypeOfReport(TypeOfReport typeOfReport) {
		this.typeOfReport = typeOfReport;
	}

	public Long getPerson() {
		return person;
	}

	public void setPerson(Long person) {
		this.person = person;
	}

	public Date getReportingDate() {
		return reportingDate;
	}

	public void setReportingDate(Date reportingDate) {
		this.reportingDate = reportingDate;
	}

	public Triage getTriage() {
		return triage;
	}

	public void setTriage(Triage triage) {
		this.triage = triage;
	}

	public Abstention getAbstention() {
		return abstention;
	}

	public void setAbstention(Abstention abstention) {
		this.abstention = abstention;
	}

	public Disinfection getDisinfection() {
		return disinfection;
	}

	public void setDisinfection(Disinfection disinfection) {
		this.disinfection = disinfection;
	}

	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	public String getQuestion3() {
		return question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	public String getQuestion4() {
		return question4;
	}

	public void setQuestion4(String question4) {
		this.question4 = question4;
	}

	public String getQuestion5() {
		return question5;
	}

	public void setQuestion5(String question5) {
		this.question5 = question5;
	}

	public String getQuestion6() {
		return question6;
	}

	public void setQuestion6(String question6) {
		this.question6 = question6;
	}

	public String getQuestion7() {
		return question7;
	}

	public void setQuestion7(String question7) {
		this.question7 = question7;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getAnswer4() {
		return answer4;
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

	public String getAnswer5() {
		return answer5;
	}

	public void setAnswer5(String answer5) {
		this.answer5 = answer5;
	}

	public String getAnswer6() {
		return answer6;
	}

	public void setAnswer6(String answer6) {
		this.answer6 = answer6;
	}

	public String getAnswer7() {
		return answer7;
	}

	public void setAnswer7(String answer7) {
		this.answer7 = answer7;
	}

	public NewClassification getNewClassification() {
		return newClassification;
	}

	public void setNewClassification(NewClassification newClassification) {
		this.newClassification = newClassification;
	}

	public OldClassification getOldClassification() {
		return oldClassification;
	}

	public void setOldClassification(OldClassification oldClassification) {
		this.oldClassification = oldClassification;
	}

	public Date getProposedAbstentionDate() {
		return proposedAbstentionDate;
	}

	public void setProposedAbstentionDate(Date proposedAbstentionDate) {
		this.proposedAbstentionDate = proposedAbstentionDate;
	}

}
