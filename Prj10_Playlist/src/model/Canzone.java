package model;

public class Canzone {
	
	public String titolo;//proprietà dell'oggetto di tipo Canzone
	public String cantante;
	
	public Canzone(String titolo, String cantante) {//new Canzone ("Mediterranea", "Irama") per una nuova canzone, nelle parentesi le caratteristiche che voglio specificare 
		this.titolo = titolo;//potrei anche indicare con titolo=title per evitare il conflitto, per renderlo in manierra corretta dovrei indicare come title anche la parentesi tonda del public Canzone
		this.cantante=cantante;
	
	}
	public void suona() {
		System.out.println("Sto cantando la canzone "+titolo);
	}

	public String stampa() {
		return this.cantante +" - " + this.titolo;
	}

}
