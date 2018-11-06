import java.util.ArrayList;

/**
 * A class represents a player's hand, deal 2 cards initially, 
 * deal additional cards with hitMe() method
 * @author lucykuo
 *
 */
public class Hand {
	
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	Deck newDeck = null;
	/**
	 * A method that give cards to player and dealer.
	 * @param deck a deck of card
	 * @return the card being given out
	 */
	public Card giveCard(Deck deck){
		
		int rand = (int) (Math.random()*deck.myDeck.size()); //pulls a random card from those remaining in the deck
		int card = deck.myDeck.get(rand); //use the random index to get the value of the card
		
		int suit = (int)( (card/13)+1); //there are 4 suits , each with 13 ranks, so divided by 13 and round it up	
		int number = card % 13 +1; // count the rank of the card	
		
		Card newCard = new Card(suit, number);//the card being given		
		
		deck.myDeck.remove(rand); //remove the card from the deck once it's been dealt
		
		return newCard;
	}
	/**
	 * Constructs a hand with a deck of cards and initially deal 2 cards to both the player and dealer
	 * @param deck the deck of cards
	 */
	public Hand(Deck deck){
		this.newDeck = deck;
		hand.add(giveCard(deck));
		hand.add(giveCard(deck));
	}
	
	/**
	 * A method to return the hand
	 * @return the ArrayList of hand
	 */
	public ArrayList<Card> getHand(){
		return hand;
	}
	/**
	 * A method that calculate the value of the hand.
	 * @return total score
	 */
	public int score(){ 		
		int totalScore=0;
		int numAces=0;
		
		//count how many Aces are there is a hand
		for(Card o: hand){
			totalScore += o.getValue();
			if(o.getNumber()==1) numAces++;
		}
		//If the player's score is greater than 21 and their hand has at least one Ace,
		//convert each Ace from 11 to 1 until their score is less than 21, or they
		//run out of Aces in their hand
		while(totalScore>21 && numAces>0){			
			numAces--;
			totalScore -= 10; 
		}
		return totalScore;
	}
	
	/**
	 * A method that deal a card
	 */
	public void hitMe(){
		hand.add(giveCard(newDeck));
	}
	/**
	 * A method that print out the cards in the player's hand
	 * @return
	 */
	public String printHand(){
		String rank="";
		String suit="";
		String stringHand="";
		for(Card o: hand){
			switch(o.getNumber()){
				case 1: rank = "Ace";
				break;
				case 11: rank = "Jack";
				break;
				case 12: rank = "Queen";
				break;
				case 13: rank = "King";
				break;
				case 2: rank = "2";
				break;
				case 3: rank = "3";
				break;
				case 4: rank = "4";
				break;
				case 5: rank = "5";
				break;
				case 6: rank = "6";
				break;
				case 7: rank = "7";
				break;
				case 8: rank = "8";
				break;
				case 9: rank = "9";
				break;
				case 10: rank = "10";
				break;

			}
			switch(o.getSuit()){
				case 1: suit = "Spades";
				break;
				case 2: suit = "Clubs";
				break;
				case 3: suit = "Hearts";
				break;
				case 4: suit = "Diamonds";
				break;
			}
			stringHand=stringHand+rank+" of "+suit+". ";
		}
		return stringHand;
	}
	

	

}

