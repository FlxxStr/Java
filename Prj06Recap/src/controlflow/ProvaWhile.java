package controlflow;

public class ProvaWhile {

	public static void main(String[] args) {
		
		boolean gira = true;
		int giri = 0; //serve per sapere quanti giri
		while (gira) {
			System.out.println("gira " + giri++); //giri++ serve per stampare il numero di giri
			
			if (Math.random()< 0.005) {
				//break;  oppure posso usare
				//senza break o false il ciclo va avanti all'infinito
				gira = false;
			}
		}
		
		do {
			System.out.println("gira " + giri++);
			
			if (Math.random() < 0.5);
			gira = false;
		}

	while(gira);

   }
}

