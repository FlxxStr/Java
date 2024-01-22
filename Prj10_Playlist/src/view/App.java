package view;

import controller.CanzoneCtrl;
import model.Canzone;

public class App {

	public static void main(String[] args) {
		CanzoneCtrl database= new CanzoneCtrl();
		database.caricaCanzoniDaDB();
		Canzone[] tuttelecanzoni = database.canzoni;
		System.out.println("<ul>");
		for (Canzone canzone : tuttelecanzoni) {
			System.out.println("<li>"+canzone.stampa()+"/li");
		}
		System.out.println("</ul");
		
	
		
		

	}

}
