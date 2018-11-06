/**
 * A card object, the basis for players' hands
 * @author lucykuo
 *
 */
public class Card {
	
	private int suit;
	private int number;
	/**
	 * Constructs a card with its suit and number.
	 * @param suit the suit of the card
	 * @param number the number of the card
	 */
	//constructor
	public Card(int suit, int number){
		this.suit = suit;
		this.number = number;
	}
	/**
	 * get the number of the card
	 * @return the number of the card
	 */
	public int getNumber(){
		return number;
	}
	/**
	 * get the suit of the card
	 * @return the suit of the card
	 */
	public int getSuit(){
		return suit;
	}

	/* Assign values to each card in the deck.
	 * Aces=11, Face cards = 10, numeric cards = their value
	 */
	/**
	 * get the value of the card
	 * @return the value of the card
	 */
	public int getValue(){				
		if (number ==1) return 11;	//Ace
		else if(number>10) return 10;   //Jack, Queen, King
		else return number;	//2-9		
	}
}
