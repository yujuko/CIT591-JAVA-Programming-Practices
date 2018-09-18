package dieClass;
import java.util.Random;
public class dice {

	/**
	   This class models a die that, when cast, lands on a random
	   face.
	*/
	
	   private Random generator;
	   private int sides;

	   /**
	      Constructs a die with a given number of sides.
	      @param s the number of sides, e.g. 6 for a normal die
	   */
	   public dice(int s){
	      sides = s;
	      generator = new Random(); // generate a random number
	   }

	   /**
	      Simulates a throw of the die
	      @return the face of the die 
	   */
	   public int cast(){
	      return 1 + generator.nextInt(sides); 
	   }
}
