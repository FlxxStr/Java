package controller;

public class Todo {

	public String descrizione;
	public boolean completo;
	public Todo(String desc) {
		descrizione = desc;
		completo = false;
		System.out.println("Creato nuovo oggetto di tipo Todo");
	}
	public void completa() {
		completo=true;
	}
	public String stampa() {
		return"----------------------\n"
	+"Descrizione: \n "
				+ descrizione 
				+ "Completo \n"
				+ completo
		+"\n --------------------------";
	}

	}


