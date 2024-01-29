package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import controller.Libreria;
import model.Libro;

public class App {

	public static void main(String[] args) {
		
		Libreria libreria = new Libreria("scaffale1");
		File file = new File ("Biblioteca.csv");//passo file
		File destinazione = new File ("biblioteca.html");
		try {
			Scanner sc = new Scanner(file);//scanner del file
			while(sc.hasNextLine()) { //continua a ripetere finche ci sono righe
				String riga = sc.nextLine();
				//System.out.println(riga);
				String[] parole = riga.split(",");
				String autore = parole[1];
				String titolo = parole[2];
				libreria.addLibro(new Libro(autore, titolo));
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		Libro libro1 = new Libro("manzoni", "i promessi sposi");
//		Libro libro2 = new Libro("asimov", "io robot");
//		Libro libro3 = new Libro("verga", "i malavoglia");
//		Libro libro4 = new Libro("calvino", "visconte dimezzato");
//		Libro libro5 = new Libro("tolkien", "il signore degli anelli");
//
//		libreria.addLibro(libro1);
//		libreria.addLibro(libro2);
//		libreria.addLibro(libro3);
//		libreria.addLibro(libro4);
//		libreria.addLibro(libro5);
		
		ArrayList<Libro> libri = libreria.getLibri();//alt+shift+L 
		System.out.println("<h1>la libreria contiene: "+libri.size()+" libri</h1>");
//		System.out.println(libri);
		
		Libro l = libreria.getLibroByCollocazione("mani p16");
		//System.out.println(l);
		
		if(l!=null) 
		l.setDisponibile(false);
		//System.out.println(l);
		
		libreria.deleteLibro(l);
		
		try {
			PrintWriter pw = new PrintWriter(destinazione); //pw sostituisce system.out
			pw.println("<ul>");//creo lista libri
			for(Libro book : libreria.getLibri()) {
				pw.println("<li>" + book.getTitolo() + "</li>");
			}
			pw.println("</ul>");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
