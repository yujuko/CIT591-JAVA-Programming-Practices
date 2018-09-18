package dieClass;

import java.util.Scanner;

public class dieGame {

	public static void main(String[] args) {
		
		dice dice = new dice(6);
		int playerRoll = 0;
		
		while (dice.cast() != 2) {
			System.out.println("Would you like to roll the dice?");
			System.out.println("\"y\" to roll or \"q\" to quit");
			Scanner scan = new Scanner(System.in);
			String quit = scan.nextLine();
			if (quit.equals("q")) {
				break;
			}
			playerRoll = dice.cast();
			System.out.println("You rolled a: "+ playerRoll);
		}
		System.out.println("Game over");
		
		System.out.println("");	
		for ( int i=0; i<5 ; i++) {
			System.out.println("rolled: "+ dice.cast());
		}

		

	}

}
