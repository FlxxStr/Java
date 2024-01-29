package controller;

import java.util.ArrayList;

import model.Libro;

public class Libreria {

	
	private ArrayList<Libro> libri;
	private String nome;
	public Libreria(String nome) {
		this.nome = nome;
		this.libri = new ArrayList<Libro>();
	}
	
	public void addLibro(Libro l) { //metodo agg libro alla biblio
		this.libri.add(l);
	}
	public ArrayList<Libro> getLibri(){ //ritorna tutti i libri
		return this.libri;
	}
	public Libro getLibroByCollocazione(String collocazione) {
		Libro l = null; //dichiaro Libro l e lo inizializzo a nullo
		for (Libro libro : libri) { //per ogni libro della libreria
			if(libro.getCollocazione().equals(collocazione)) { //se la collocazione corrisponde alla stringa data in arg
				l = libro; //assegno il libro trovato a l
			}
		}
		return l; //in ogni caso ritorno l
	}
	public void updateLibro (Libro l) {
		int posLibroOriginale = this.libri.indexOf(l);
//		Libro originale = this.libri.get(posLibroOriginale);
		this.libri.add(posLibroOriginale, l); //sostituisce la posizione del libro originale
		
	}
	public void deleteLibro (Libro l) {
		this.libri.remove(l); //metodo per eliminare libro dalla lista
	}
	
}
