package collezioni;

import java.util.ArrayList;

public class ListeDemo {

	public static void main(String[] args) {
		
		ArrayList<String> citta = new ArrayList <String>();
		
		citta.add("torino");
		citta.add("milano");
		citta.add("roma");
		citta.add("napoli");
		citta.add("bari");
		
		int numeroCitta = citta.size();
		System.out.println(numeroCitta);
		
		citta.remove(2);
		
		for(String comune:citta) {
			System.out.println(comune);
		}
System.out.println(citta.size());
	}

}
