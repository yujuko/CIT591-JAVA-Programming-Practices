/**
 * This class models the Buffon Needle Experiment that, 
 * when a needle of length 1 inch is dropped onto paper that is ruled with lines 2 inches apart. 
 * There is a tries/hits approximates p.
 * @author lucykuo
 */
public class BuffonNeedleExperiment {

	public static void main(String[] args) {
	 
		Double yLow ;
		Double angle ;
		int hitCount = 0; 
		
		/** Simulates throwing a needle for 10000 times, each time with 
		 * a random lower point and a random angle. 
		 * The higher point is calculated by the formula yHigh = yLow + angle.
		 * If yHigh >=2 ,it is a hit.
		 */
		for (int i = 0 ; i< 10000 ; i++) {
			//The Math.random() function returns a floating-point, pseudo-random number 
			//in the range 0–1 (inclusive of 0, but not 1) with approximately uniform distribution over that range.
			
			yLow = Math.random() * 2;  
			//we need a random number between 0.0-2.0
			
			angle = Math.sin(Math.random()*180); 
			//we need a random number between 0.0-180.0
			
			if ( yLow + angle >= 2) {
				hitCount++; 
				//If yHigh >=2 ,it is a hit.
			}
		}
		/**
		 * Calculate the approximates tries/hits p through dividing the hitCount by 10000.
		 */
		System.out.println("Tries/hits approximates = "+ (double)hitCount/10000);
		
		

	}

}
