package view;

import java.util.Scanner;

import model.Azienda;
import model.Impiegato;
import model.Segreteria;

public class DemoAlessioSpa {

	public static void main(String[] args) {
		 Azienda aleSpa = new Azienda();
		 Segreteria s1 = new Segreteria();
		 String nome, cognome;
		 int annoDiNascita, stipendio, scelta;
		 Scanner sc = new Scanner (System.in);
		 do {
			 System.out.println("1) Aggiungi impiegato");
		System.out.println("2) Elimina impiegato");
		System.out.println("3) Calcola stipendi");
		System.out.println("4) Stampa Azienda");
		System.out.println("0) Esci");
		scelta = sc.nextInt();
		switch (scelta) {
		case 1: {
			sc.nextLine();
			System.out.println("Inserire nome");
			nome = sc.nextLine();
			System.out.println("Inserire cognome");
			cognome = sc.nextLine();
			System.out.println("Inserire anno di nascita");
			annoDiNascita = sc.nextInt();
			System.out.println("Inserire stipendio");
			stipendio = sc.nextInt();
			Impiegato i = new Impiegato(nome, cognome, annoDiNascita, stipendio);
			i.setId(s1.creaId(nome, cognome, annoDiNascita));
			aleSpa.addImpiegato(i);
			
			break;
		}
		case 2: {
			int remove;
			System.out.println("Inserisci posizione impiegato.");
			remove=sc.nextInt();
			aleSpa.deleteImpiegato(remove);
			break;
		}
		case 3: {
			aleSpa.stipendiTOT();
			break;
		}
		case 4: {
			aleSpa.azz();
			break;
		}
		case 0: {
			System.out.println("THX 4 Playing");
		}
		default:
			System.out.println("Nope.");
		}
		 } while(scelta != 0);
			 
		 
		
		

	}

}
