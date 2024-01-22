package model;

public class Studente {
	//proprietà degli oggetti dello stampino (classe) studente
	private String nome;
	private String cognome;
	private int nMat;
	private static int contatore = 1; 
	//metodi
	
	//metodo costruttore
	public Studente(String nome, String cognome) { //alt+shift+S per creare costruttore dal menu a tendina
		this.nome = nome;
		this.cognome = cognome;
		this.nMat = contatore++;
	}
	//metodi getter & setter

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

	public int getnMat() {
		return nMat;
	}

	public void setnMat(int nMat) {
		this.nMat = nMat;
	}

	@Override
	public String toString() {
		return "Studente [\nnome = " + nome + "\ncognome = " + cognome + "\nnMat = " + nMat + "]";
	}
	
	//metodi custom
	
	//metodo toString
	
/*	public Studente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome.toUpperCase();
	}
	public void setNome(String nome) {
		this.nome = nome;
	}*/

}
