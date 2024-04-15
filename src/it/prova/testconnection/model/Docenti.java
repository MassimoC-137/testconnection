package it.prova.testconnection.model;

public class Docenti {

	private int idDocenti;
	private String nome; 
	private String cognome; 
	private String materia; 
	private int inizioCarriera; 
	private boolean pensionato; 
	
	public Docenti() {
		
	}
	
	public Docenti(int idDocenti, String nome, String cognome, String materia, int inizioCarriera, boolean pensionato) {
		this.setIdDocenti(idDocenti);
		this.setNome(nome); 
		this.setCognome(cognome); 
		this.setMateria(materia); 
		this.setInizioCarriera(inizioCarriera); 
		this.setPensionato(pensionato); 
	}

	public int getIdDocenti() {
		return idDocenti;
	}

	public void setIdDocenti(int idDocenti) {
		this.idDocenti = idDocenti;
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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getInizioCarriera() {
		return inizioCarriera;
	}

	public void setInizioCarriera(int inizioCarriera) {
		this.inizioCarriera = inizioCarriera;
	}

	public boolean isPensionato() {
		return pensionato;
	}

	public void setPensionato(boolean pensionato) {
		this.pensionato = pensionato;
	}

	@Override
	public String toString() {
		return "Docenti [idDocenti=" + idDocenti + ", nome=" + nome + ", cognome=" + cognome + ", materia=" + materia
				+ ", inizioCarriera=" + inizioCarriera + ", pensionato=" + pensionato + "]";
	}
	
	
	
	
	
	
}
