package gioco;

import java.util.Scanner;

public class GiocoOca {

	public static void main(String[] args, Scanner NextInt) {
		int player1=0;
		int player2=0;
		int caselle=50;
		int facceDado=6;
		
		
		double roll = Math.random();
		int result = (int)(roll*facceDado)+1;
		
		int newSpace = caselle - (caselle-result);
		
		if (player1<caselle) {
			System.out.println("P1 roll your dice");
		Scanner sc = new Scanner(System.in);
		sc = NextInt;
		
		player1=newSpace;
		System.out.println("P1, your new space is n°" + newSpace);
		
		
		}else {
			System.out.println("P1 WINS!!");
		}
				
		

	}

}
