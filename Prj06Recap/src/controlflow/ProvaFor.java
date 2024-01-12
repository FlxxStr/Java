package controlflow;

import java.util.Iterator;

public class ProvaFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("ripetizione n. " + i);
		}
		int[] voti = {25, 24, 28, 27, 30, 22};
		int lunghezza = voti.length;
		double totale = 0;
		for (int i = 0; i < lunghezza; i++) {
			totale += voti[i];
			System.out.println(totale);
		}
		System.out.println("La media aritmetica: " + (totale / lunghezza));

		
		for (int voto : voti) {
			System.out.println(voto);
		}
	}

}
