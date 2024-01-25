package model;



public class Segreteria {
	
public static String creaId (String nome , String cognome , int annoDiNascita) {
	char [] listaNome = nome.toCharArray();
	char [] listaCognome = cognome.toCharArray();
	String id = "";
	for (int i=0;i<2;i++) {
		id += listaNome[i];
	}
	for (int i=0;i<2;i++) {
		id += listaCognome[i];
	}
	id += annoDiNascita;
	
	return id;
}

}
