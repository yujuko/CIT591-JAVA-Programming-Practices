import java.util.ArrayList;

/**
 * A deck object which manage 52 cards
 * @author lucykuo
 *
 */
public class Deck {
	//Deck is an array of 52 numbers, 0-51
	ArrayList<Integer> myDeck = new ArrayList<Integer>();
	/**
	 * construct a deck by adding 0-51 in the ArrayList.
	 */
	public Deck(){
		for(int i=0;i<52;i++){
			myDeck.add(i);
		}		
	}
	/**
	 * display the deck of cards
	 */
	// Displays all cards remaining in the deck
	public void displayCards(){
		for(int i=0 ; i<myDeck.size(); i++) {
			System.out.print(String.valueOf(i)+" ");
		}
		
		System.out.println("");
	}

	public void shuffle(){
	for (int i = 0; i <52; i++) {
        int r = i + (int) (Math.random() * (52-i));
        Integer temp = myDeck.get(r);
        myDeck.set(r,myDeck.get(i)) ;
        myDeck.set(i,temp);
    }
    }
}
