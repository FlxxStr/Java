package model;

import java.util.ArrayList;

public class Azienda {
private ArrayList<Impiegato> Impiegati;

public Azienda() {
	Impiegati = new ArrayList<Impiegato>();
	
}
public void addImpiegato(Impiegato i) {
	Impiegati.add(i);
}
public void deleteImpiegato(int pos) {
	
	if(Impiegati.get(pos)==null) {
		System.out.println("Impiegato non trovato.");
	}else {
		Impiegati.remove(Impiegati.get(pos));
			
				
			
		
	}
}
public void stipendiTOT() {
	
	double stipendiTOT = 0.0;
	for(int i=0;i<Impiegati.size();i++) {
		stipendiTOT += Impiegati.get(i).getStipendio();
	}
	System.out.println("Il totale degli stipendi è " + stipendiTOT + " PLEURI!!");
}
public void azz() {
	for(int i = 0; i < Impiegati.size();i++) {
		System.out.println(Impiegati.get(i).toString());
	}
} 
}
