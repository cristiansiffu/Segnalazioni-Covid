package com.Segnalazioni.Covid.model.dto;

import java.time.LocalDate;

import com.Segnalazioni.Covid.model.NewClassification;
import com.Segnalazioni.Covid.model.OldClassification;
import com.Segnalazioni.Covid.model.Path;
import com.Segnalazioni.Covid.model.TypeOfReport;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class ReportDTO {

	private Long idReport;
	@Enumerated(EnumType.STRING)
	private TypeOfReport typeOfReport;
	private Long idPerson;
	@Temporal(TemporalType.DATE)
//	@JsonFormat(pattern = "dd-MM-yyyy")
//	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate reportingDate;	
	private Boolean triage;	
	private Boolean abstention;	
	private Boolean disinfection;
	private String question1;
	private String question2;
	private String question3;
	private String question4;
	private String question5;
	private String question6;
	private String question7;
	private String question8;
	
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String answer5;
	private String answer6;
	private String answer7;
	private String answer8;
	
	@Enumerated(EnumType.STRING)
	private NewClassification newClassification;
	@Enumerated(EnumType.STRING)
	private OldClassification oldClassification;
	@Temporal(TemporalType.DATE)
//	@JsonFormat(pattern = "dd-MM-yyyy")
//	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate proposedAbstentionDate;
	@Enumerated(EnumType.STRING)
	private Path path;

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	public ReportDTO() {
		super();
	}

	public Long getIdReport() {
		return idReport;
	}

	public void setIdReport(Long idReport) {
		this.idReport = idReport;
	}

	public TypeOfReport getTypeOfReport() {
		return typeOfReport;
	}

	public void setTypeOfReport(TypeOfReport typeOfReport) {
		this.typeOfReport = typeOfReport;
	}

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public LocalDate getReportingDate() {
		return reportingDate;
	}

	public void setReportingDate(LocalDate reportingDate) {
		this.reportingDate = reportingDate;
	}

	public Boolean getTriage() {
		return triage;
	}

	public void setTriage(Boolean triage) {
		this.triage = triage;
	}

	public Boolean getAbstention() {
		return abstention;
	}

	public void setAbstention(Boolean abstention) {
		this.abstention = abstention;
	}

	public Boolean getDisinfection() {
		return disinfection;
	}

	public void setDisinfection(Boolean disinfection) {
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

	public String getQuestion8() {
		return question8;
	}

	public void setQuestion8(String question8) {
		this.question8 = question8;
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

	public String getAnswer8() {
		return answer8;
	}

	public void setAnswer8(String answer8) {
		this.answer8 = answer8;
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

	public LocalDate getProposedAbstentionDate() {
		return proposedAbstentionDate;
	}

	public void setProposedAbstentionDate(LocalDate proposedAbstentionDate) {
		this.proposedAbstentionDate = proposedAbstentionDate;
	}

	@Override
	public String toString() {
		return "ReportDTO [idReport=" + idReport + ", typeOfReport=" + typeOfReport + ", idPerson=" + idPerson
				+ ", reportingDate=" + reportingDate + ", triage=" + triage + ", abstention=" + abstention
				+ ", disinfection=" + disinfection + ", question1=" + question1 + ", question2=" + question2
				+ ", question3=" + question3 + ", question4=" + question4 + ", question5=" + question5 + ", question6="
				+ question6 + ", question7=" + question7 + ", question8=" + question8 + ", answer1=" + answer1
				+ ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", answer5=" + answer5
				+ ", answer6=" + answer6 + ", answer7=" + answer7 + ", answer8=" + answer8 + ", newClassification="
				+ newClassification + ", oldClassification=" + oldClassification + ", proposedAbstentionDate="
				+ proposedAbstentionDate + "]";
	}
	
	

}
