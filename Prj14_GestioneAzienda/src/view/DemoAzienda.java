package view;

import controller.LibroMatricola;
import model.Dipendente;
import model.Fattorino;
import model.Impiegato;
import model.Magazziniere;

public class DemoAzienda {

	public static void main(String[] args) {
		
		LibroMatricola libro1 = new LibroMatricola("apple");
		LibroMatricola libro2 = new LibroMatricola("samsung");
		
		libro1.addDipendente("giuseppe", "verdi", "Impiegato");
		libro1.addDipendente("aldo", "garibaldi", "Magazziniere");
		libro1.addDipendente("marco", "mazzini", "Fattorino");
		
		System.out.println(libro1.getNomeAzienda());
		System.out.println("Dipendenti");
		for(Dipendente d : libro1.getDipendenti()) {
			System.out.println(d);
		}
		System.out.println(libro2.getNomeAzienda());
			
		
		
//		Dipendente d = new Dipendente();
//		Fattorino f = new Fattorino();
//		f.setNumConsegne(10);
//		f.calcolaStipendio();
//		Impiegato i = new Impiegato();
//		Magazziniere m = new Magazziniere("roberto", "bianchi");
//
//		
//		System.out.println(d);
//		System.out.println(f);
//		System.out.println(i);
//		System.out.println(m);
	}

}
