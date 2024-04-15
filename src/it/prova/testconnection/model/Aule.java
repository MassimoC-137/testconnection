package it.prova.testconnection.model;

public class Aule {

	private int idAule;
	private int anno; 
	private String sezione; 
	private int numeroStudenti; 
	
	public Aule() {
		
	}
	
	public Aule(int anno, String sezione, int numeroStudenti) {
		this.setIdAule(idAule);
		this.setAnno(anno); 
		this.setSezione(sezione); 
		this.setNumeroStudenti(numeroStudenti); 
	}

	public int getIdAule() {
		return idAule;
	}

	public void setIdAule(int idAule) {
		this.idAule = idAule;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getSezione() {
		return sezione;
	}

	public void setSezione(String sezione) {
		this.sezione = sezione;
	}

	public int getNumeroStudenti() {
		return numeroStudenti;
	}

	public void setNumeroStudenti(int numeroStudenti) {
		this.numeroStudenti = numeroStudenti;
	}

	@Override
	public String toString() {
		return "Aule [idAule=" + idAule + ", anno=" + anno + ", sezione=" + sezione + ", numeroStudenti="
				+ numeroStudenti + "]";
	}
	
	
	
	
	
	
}
