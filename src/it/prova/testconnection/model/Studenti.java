package it.prova.testconnection.model;

import java.sql.Date;

public class Studenti {

	private int idStudente; 
	private String nome; 
	private String cognome; 
	private String matricola; 
	private Date dataDiNascita; 
	private String indirizzo; 
	private boolean diplomato; 
	private int annoCorso; 
	private int idAula; 
	
	public Studenti() {
		
	}
	
	public Studenti(int idStudente, String nome, String cognome, String matricola, Date dataDiNascita, String indirizzo, boolean diplomato, int annoCorso, int idAula) {
		this.setIdStudente(idStudente);
		this.setNome(nome); 
		this.setCognome(cognome); 
		this.setMatricola(matricola); 
		this.setDataDiNascita(dataDiNascita); 
		this.setIndirizzo(indirizzo); 
		this.setDiplomato(diplomato); 
		this.setAnnoCorso(annoCorso); 
		this.setIdAula(idAula);
	}

	public int getIdStudente() {
		return idStudente;
	}

	public void setIdStudente(int idStudente) {
		this.idStudente = idStudente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public boolean isDiplomato() {
		return diplomato;
	}

	public void setDiplomato(boolean diplomato) {
		this.diplomato = diplomato;
	}

	public int getAnnoCorso() {
		return annoCorso;
	}

	public void setAnnoCorso(int annoCorso) {
		this.annoCorso = annoCorso;
	}

	public int getIdAula() {
		return idAula;
	}

	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}

	@Override
	public String toString() {
		return "Studenti [idStudente=" + idStudente + ", nome=" + nome + ", cognome=" + cognome + ", matricola="
				+ matricola + ", dataDiNascita=" + dataDiNascita + ", indirizzo=" + indirizzo + ", diplomato="
				+ diplomato + ", annoCorso=" + annoCorso + ", idAula=" + idAula + "]";
	}
	
	
	
	
	
}
