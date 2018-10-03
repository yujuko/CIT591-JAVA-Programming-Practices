package FactoringOfIntegers;
/**
 * A class that that asks the user for an integer and then prints out all its factors.
 * @author lucykuo
 *
 */
public class FactorGenerator {

	private int numberToFactor;
	private int currentFactor;
	
	/**
	 * Constructs a generator with a given number.
	 * @param numberToFactor The number being factored
	 */
	public FactorGenerator(int numberToFactor){
		this.numberToFactor = numberToFactor;
	}
	
	/**
	 * A method that prints out the next factor from the number being factored.
	 * @return Next factor of the number being factored
	 */
	public int nextFactor() {
		currentFactor += 1; 
		//we want to check from the next number since the current factor has been found and printed.
		
		while ( numberToFactor % currentFactor != 0) {
			currentFactor++; 
			// increase current number by one until we find another factor.
		}
		return currentFactor;			
	}
	/**
	 * A method that checks if the number has more factors.
	 * @return True if there are more possible factors. False if there isn't any possible factor.
	 */
	public boolean hasMoreFactors() {
		if ( currentFactor == numberToFactor) {
			return false;
			// If currentFactor is equal to the number that was typed by the user, there is no way for it to increase.
			//Which means all the possible factors (must be smaller than the number itself) have been checked.
		}
		return true;
	}

}
