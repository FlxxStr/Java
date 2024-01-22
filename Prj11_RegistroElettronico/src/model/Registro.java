package model;

import java.util.ArrayList;

public class Registro {
	
	private String nomeCorso;
	private ArrayList<Studente> studenti;
	
	/**
	 * Costruttore del registro dei corsi
	 * @param nomeCorso inserire il nome del corso
	 */
	public Registro(String nomeCorso) {
		super();
		this.nomeCorso = nomeCorso;
		this.studenti = new ArrayList<Studente>();
	}
public String getNomeCorso() {
	return nomeCorso;
}	
public ArrayList<Studente> getAllStudents() {
	return this.studenti;
}
public Studente getStudentById (int id) {
	return this.studenti.get(id);
}
public Studente getStudenteByNumeroMatricola(int nMat) {
	for (Studente studente : studenti) {
		if(studente.getnMat()==nMat) {
			return studente;
		}
	}
	return null;
}
//al posto di 's' posso scrivere qualunque cosa, è il nome dell'oggetto
public void aggiungiStudente (Studente s) {
	this.studenti.add(s);
}

}
