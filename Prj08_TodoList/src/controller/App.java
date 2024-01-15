package controller;

import java.awt.Menu;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
 
 
 boolean gira = true;
 TodoController ctrl = new TodoController();
 while(gira) {
	 System.out.println(menu());
	 
	 int risposta = domanda("Quale opzione scegli");
	 
	 if(risposta==0) {
		 gira=false;
	 }
	 System.out.println("L'utente a scelto l'opzione "+risposta);
	 if (risposta==1) {
		 System.out.println("Vuoi aggiungere un nuovo Todo!");
		 String desc = chiediString("Descrizione della nota");
		 int pos = domanda("In quale posizione vuoi inserire il todo?");
		 ctrl.addTodo(desc, pos);
	 }
	 if (risposta==2) {
		 System.out.println("Puoi stampare i Todo! ");
		 Todo[] listaTodo = ctrl.lista;
		 for (Todo todo : listaTodo) {
			 if (todo!=null)
			 System.out.println(todo.descrizione);
		 }
	 }
	 
	}
 System.out.println("Grazie per aver utilizzato i nostri software :) ");
	}
	
	private static String chiediString(String domanda) {
		System.out.println(domanda);
		Scanner epson = new Scanner (System.in);
		
		return epson.nextLine();
	}

	private static int domanda(String question) {
		System.out.println(question);
		int answer = 0;
		
		Scanner canon = new Scanner (System.in);
		answer=canon.nextInt();
		//canon.nextLine();
		//canon.close();
		return answer;
	}

	private static String menu() {
		String s = "";
		s= s.concat("****************\n");
		 s += "1)add todo\n";
		 s=s.concat("2) print all\n");
		 s=s.concat("0) exit\n");
		 s=s.concat("****************\n");
		
		 return s;
		
	}

}
