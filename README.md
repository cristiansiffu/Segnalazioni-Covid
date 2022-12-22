# Segnalazioni-Covid
Sviluppo di un applicazione per la gestione delle segnalazioni di casi Covid-19.
Lo sviluppo del back-end è basato su Web Service REST, Spring Boot e database PostgreSQL, che ci permette di inserire nuove segnalazioni sia in caso di positività sia gli aggiornamenti di fine malattia.

Il sistema richiede un'autenticazione, che prevede diversi ruoli: Dipendente oppure Medico. Una volta entrato come Dipendente verrà richiesto se si è un Manager oppure no.

## Contenuti
- [Entity] (#entity)
- [Gestione dati] (#gestione-dati)
- [Documentazione API] (#Documentazione-API)

## ENTITY
## Segnalazione
- id (chiave primaria)
- tipo di segnalazione (enum)
- codice percorso (chiave esterna)
- persona (chiave esterna)
- data segnalazione
- triage (enum)
- astensione (enum)
- sanificazione (enum)
- domanda 1
- domanda 2
- domanda 3
- domanda 4
- domanda 5 
- domanda 6
- domanda 7
- risposta 1
- risposta 2
- risposta 3
- risposta 4
- risposta 5
- risposta 6
- risposta 7
- nuova classificazione
- vecchia classificazione

## Persona
- id (chiave primaria)
- codice fiscale
- nome
- cognome
- data di nascita
- ruolo

## Percorso
- id
- risposta percorso (pdf?!?)

# Gestione Dati

#documentazione API

