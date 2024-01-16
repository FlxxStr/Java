package gioco;

import java.util.Scanner;

public class GiocoDellOca {
	
	public static int player1=0;
	public static int player2=0;
     
	public static void main(String[] args) {
		System.out.println("Welcome to QuackQuack game!!!");
		System.out.println("Players enter any input to roll your die.");
		int newPos=0;
		int newPos2=0;
		while(newPos<50 || newPos2<50) {
			int dado = 0;
			Scanner sc = new Scanner(System.in);
			 if(sc.next()!=null) {
				 dado = Dice();
				 System.out.println("P1's die roll is: " + dado);
				  newPos += dado;//equivalente a :  newpos = newpos + dado 
				  if(newPos==50) {
					  System.out.println("P1 WINS!!!");
				  }
				  else if(newPos%7==0){
					  
					  newPos-=3;
					  System.out.println("Oh no you got a cursed number, you go back to 3 spaces behind!Your new space is n°"+newPos);
				  }else if (newPos%10==0) {
					 
					 newPos+=5;
					 System.out.println("How lucky! You jump 5 spaces ahead! Your new space is n°"+newPos);
				 }else if (newPos>50){
					 newPos=(50-(dado-(50-newPos)));
					 System.out.println("P1 almost there, just need a lucky roll!!");
					 System.out.println("P1 your new space is n°" + newPos);
				 }else {
			         System.out.println("P1 your new space is n°"+newPos);
			 }
				  if(sc.next()!=null) {
						 dado = Dice();
						 System.out.println("P2's die roll is: " + dado);
						  newPos2 += dado;//equivalente a :  newpos = newpos + dado 
						  if(newPos2==50) {
							  System.out.println("P2 WINS!!!");
						  }
						  else if(newPos2%7==0){
							  
							  newPos2-=3;
							  System.out.println("Oh no you got a cursed number, you go back to 3 spaces behind!Your new space is n°"+newPos2);
						  }else if (newPos2%10==0) {
							 
							 newPos2+=5;
							 System.out.println("How lucky! You jump 5 spaces ahead! Your new space is n°"+newPos2);
						 }else if (newPos2>50){
							 newPos2=(50-(dado-(50-newPos2)));
							 System.out.println("P2 almost there, just need a lucky roll!!");
							 System.out.println("P2 your new place is n°" + newPos2);
						 }else  {
					         System.out.println("P2 your new space is n°"+newPos2);
					 }
						  
				  }else {
				    System.out.println("Java Police Motherfuckers!!1!!11!!");
			 }
			 
			 
			 
		}
			 }

	}
public static int Dice() {
	double lancio= Math.ceil(Math.random()*6);
	
return (int)lancio;}

}
