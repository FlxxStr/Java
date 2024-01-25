package model;

public class Impiegato {
	
	private String nome, cognome, id;
	private int annoDiNascita, stipendio;
	
	public Impiegato(String nome, String cognome, int annoDiNascita, int stipendio) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.annoDiNascita = annoDiNascita;
		this.stipendio = stipendio;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAnnoDiNascita() {
		return annoDiNascita;
	}
	public void setAnnoDiNascita(int annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	@Override
	public String toString() {
		return "Impiegato [nome=" + nome + ", cognome=" + cognome + ", id=" + id + ", annoDiNascita=" + annoDiNascita
				+ ", stipendio=" + stipendio + "]";
	}
	
	
	
	
	
	

}
