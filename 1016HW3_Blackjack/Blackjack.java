import java.util.Scanner;

/**
 * The Blackjack class runs the game by creating a deck, creating dealer's hand and player's hand.
 * When dealer's point is less then 17, call hit. Also ask the user if he wants to hit or stay.
 * Finally compare the dealer and the player's score, declare if the player win or not, and print out his cards.
 * @author lucykuo
 *
 */
public class Blackjack {
	
	public static void main(String[] args) {
		
		
		//playgame! Create deck of 52 cards
		Deck gameDeck = new Deck();


		//Deal hands to the player and then the dealer
		//Create hand for the dealer, stop at 17
		Hand dealerHand = new Hand(gameDeck);
		while(dealerHand.score()<17){
			dealerHand.hitMe();
		}
		
		//Create hand for the player, prompt for cards
		Hand playerHand = new Hand(gameDeck);
		boolean playerAction = true;
		boolean bust = true;
		
		Scanner scan = new Scanner(System.in);
		
		//Ask users if they want to hit, if yes, keep running the loop
		while(playerAction && bust){
			System.out.print("You now have "+playerHand.score()+" points, hit or stay? ( You got: "+playerHand.printHand()+")");
			
			String input = scan.nextLine();
			if(input.equalsIgnoreCase("hit")) {playerAction=true;
			playerHand.hitMe();
			if (playerHand.score() > 21) bust = false;} //check if it busts (>21) or not
			else if (input.equalsIgnoreCase("stay")) playerAction= false;
			else System.out.println("Please type \"hit\" or \"stay\"");
			}


		//Print out final scores and hands
		int userScore = playerHand.score();
		int dealerScore = dealerHand.score();
		if(userScore>21 && dealerScore>21) System.out.println("You both bust!");
		else if(userScore>21 && dealerScore<=21) System.out.println("Dealer win!");
		else if(userScore<=21 && dealerScore>21) System.out.println("You win!");
		else{
			if(userScore>dealerScore) System.out.println( "You win!");
			else if(userScore<dealerScore) System.out.println("Dealer win!");
			else System.out.println("It's a push!");}
			
		System.out.println("Your points: "+playerHand.score() +" - "+playerHand.printHand());
		System.out.println("Dealer's points: "+dealerHand.score()+" - "+dealerHand.printHand());
		}
}


