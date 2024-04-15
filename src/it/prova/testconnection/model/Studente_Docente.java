package it.prova.testconnection.model;

public class Studente_Docente {

	private int idStudente; 
	private int idDocenti;
	
	public Studente_Docente() {
		
	}
	
	public Studente_Docente(int idStudente, int idDocenti) {
		this.setIdStudente(idStudente);
		this.setIdDocenti(idDocenti);
	}

	public int getIdStudente() {
		return idStudente;
	}

	public void setIdStudente(int idStudente) {
		this.idStudente = idStudente;
	}

	public int getIdDocenti() {
		return idDocenti;
	}

	public void setIdDocenti(int idDocenti) {
		this.idDocenti = idDocenti;
	}

	@Override
	public String toString() {
		return "Studente_Docente [idStudente=" + idStudente + ", idDocenti=" + idDocenti + "]";
	}
	
	
}
