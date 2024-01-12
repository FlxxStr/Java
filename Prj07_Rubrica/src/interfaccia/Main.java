package interfaccia;

import logica.Contatto;
import logica.Rubrica;

public class Main {

	public static void main(String[] args) {
	
		boolean gira = true;
		Rubrica r = new Rubrica(5);
		Scanner scanner = new Scanner (System.in);
		
		while (gira) {
			menu();
			
			String risposta= sc.nextLine();
			
			switch (risposta) {
			case "1":
				System.out.println("Nome?");
				String nome = sc.nextLine();
			System.out.println("Numero?");
			String numero = sc.nextLine();
				r.addContatto(nome,numero);
				
				break;
				
			case "2":
				for (Contatto c: r.contatti) {
					System.out.println(c.nome + ": " + c.numero);
				}
					break;
					
					
					case "0":
						System.out.println("Arrivederci");
						gira = false;
						System.out.println("");
						break;
						
					
				}

			default:
				System.out.println("Non ho capito!");
				break;
			}
		}

	}

	private static void menu() {
		System.out.println("**************");
		System.out.println("1- Aggiugni contatto");
		System.out.println("2- Vedi elenco contatti");
		System.out.println("3- Esci");
		System.out.println("**************");
		
	}

}
