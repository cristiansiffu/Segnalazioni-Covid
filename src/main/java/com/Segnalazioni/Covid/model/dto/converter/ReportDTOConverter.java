package com.Segnalazioni.Covid.model.dto.converter;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.Segnalazioni.Covid.model.Report;
import com.Segnalazioni.Covid.model.dto.ReportDTO;
import com.Segnalazioni.Covid.repository.PersonRepository;

@Component
public class ReportDTOConverter implements Converter<ReportDTO, Report>{

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Report convert(ReportDTO source) {
		LocalDate localDate = LocalDate.now();
		Report report = new Report();
		report.setIdReport(source.getIdReport());
		report.setTypeOfReport(source.getTypeOfReport());
		report.setPerson(personRepository.findById(source.getIdPerson()).get());
		report.setReportingDate(localDate);
		report.setTriage(source.getTriage());
		report.setAbstention(source.getAbstention());
		report.setDisinfection(source.getDisinfection());
		report.setQuestion1(source.getQuestion1());
		report.setQuestion2(source.getQuestion2());
		report.setQuestion3(source.getQuestion3());
		report.setQuestion4(source.getQuestion4());
		report.setQuestion5(source.getQuestion5());
		report.setQuestion6(source.getQuestion6());
		report.setQuestion7(source.getQuestion7());
		report.setAnswer1(source.getAnswer1());
		report.setAnswer2(source.getAnswer2());
		report.setAnswer3(source.getAnswer3());
		report.setAnswer4(source.getAnswer4());
		report.setAnswer5(source.getAnswer5());
		report.setAnswer6(source.getAnswer6());
		report.setAnswer7(source.getAnswer7());
		report.setNewClassification(source.getNewClassification());
		report.setOldClassification(source.getOldClassification());
		report.setProposedAbstentionDate(source.getProposedAbstentionDate());
		return report;
	}

}
