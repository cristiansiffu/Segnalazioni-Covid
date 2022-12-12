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
public class Segnalazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private TipoDiSegnalazione tipoDiSegnalazione;
	@OneToOne(cascade = { CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.PERSIST }, fetch = FetchType.EAGER)
	private Percorso percorso;
	@ManyToOne(fetch = FetchType.EAGER, cascade =CascadeType.MERGE)
	private Persona persona;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dataSegnalazione;
	private Triage triage;
	private Astensione astensione;
	private Sanificazione sanificazione;
	private String domanda1;
	private String domanda2;
	private String domanda3;
	private String domanda4;
	private String domanda5;
	private String domanda6;
	private String domanda7;
	private String risposta1;
	private String risposta2;
	private String risposta3;
	private String risposta4;
	private String risposta5;
	private String risposta6;
	private String risposta7;
	private NuovaClassificazione nuovaClassificazione;
	private VecchiaClassificazione vecchiaClassificazione;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dataAstensioneProposta;
	
	
	
	

}
