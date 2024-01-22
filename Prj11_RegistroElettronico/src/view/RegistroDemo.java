package view;

import java.util.Iterator;

import model.Registro;
import model.Studente;
public class RegistroDemo {

	public static void main(String[] args) {
		Registro tss2024 = new Registro ("Corso TSS 2024");
		
		Studente s1 = new Studente ("Surya", "Ghirardi");
		Studente s2 = new Studente ("Caio", "Rossi");
		Studente s3 = new Studente ("Tizio", "Verdi");
		//la dicitura può anche essere 'tss2024.aggiungiStudente(new Studente("Surya", "Ghirardi"));'
		tss2024.aggiungiStudente(s1);
		tss2024.aggiungiStudente(s3);
		tss2024.aggiungiStudente(s2);
		for(Studente s: tss2024.getAllStudents()){
			System.out.println(s);
		}

	}

}
