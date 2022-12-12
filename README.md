# Segnalazioni-Covid

# ENTITY
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

