# Segnalazioni-Covid
Sviluppo di un applicazione per la gestione delle segnalazioni di casi Covid-19.
Lo sviluppo del back-end è basato su Web Service REST, Spring Boot e database PostgreSQL, che ci permette di inserire nuove segnalazioni sia in caso di positività sia gli aggiornamenti di fine malattia.

Il sistema richiede un'autenticazione, che prevede diversi ruoli: Dipendente oppure Medico. Una volta entrato come Dipendente verrà richiesto se si è un Manager oppure no.

## Contenuti
- [Entity](#Entity)
- [Gestione dati](#gestione-dati)
- [Documentazione API](#Documentazione-API)
- [Test](#Test)

## Entity
#### Report
- idReport (primary key)
- person (secondary key - manyToOne)
- typeOfReport (enum)
- codice percorso (chiave esterna)
- reportingDate
- triage (enum)
- abstention (enum)
- disinfection (enum)
- question1
- question2
- question3
- question4
- question5
- question6
- question7
- question8
- question9
- answer1
- answer2
- answer3
- answer4
- answer5
- answer6
- answer7
- answer8
- answer9
- newClassification (enum)
- oldClassification (enum)
- proposedAbstentionDate
- path (secondary key - OneToOne)

#### Person
- idPerson (primary key)
- fiscalCode
- name
- surname
- dateOfBirth
- role (enum)
- reportList (List<Report> - OneToMany)

#### Path
- idPath
- description

## Gestione Dati
- Si è deciso che non si possibile eliminare o modificare i record di Person in quanto in questo progetto Person altro non è che un prototipo del DB fornito da \#People.
- Si è deciso che non sarà possibile modificare o eliminare dei Record. 
  
# Documentazione API
  
  - Chiamata per recuperare tutti i record presenti in Person
  ```
  http://localhost:8080/person/getAll
  ```
  

