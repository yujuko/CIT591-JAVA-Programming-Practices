
public class taxReturn {
		
		public static final int SINGLE = 1; 
		public static final int MARRIED = 2; 
		
		//private: only use within the class
		private static final double RATE1 = 0.10; 
		private static final double RATE2 = 0.25; 
		private static final double RATE1_SINGLE_LIMIT = 32000; 
		private static final double RATE1_MARRIED_LIMIT = 64000; 
		
		//instance variables
		private double income; 
		private int status; 
		
		/**  Constructs a TaxReturn object for a given income and marital status.  
		 * @param anIncome the taxpayer income 21 
		 * @param aStatus either SINGLE or MARRIED 22 
		 * */ 
		public taxReturn(double anIncome, int aStatus) { 
			income = anIncome; 
			status = aStatus;  
		}
		/**
		 * 
		 * @return the tax rate of the user
		 * if the user is single calculate income up to the single limit by the 
		 * RATE1_SINGLE_LIMIT. Calculate the remaining income by the RATE2_SINGLE_LIMIT.
		 * if user is married do the same with the MARRIED_LIMIT variables
		 */
		
		public double getTax() {
			
			int tax1 = 0;
			int tax2 = 0;
			
			if(status == 1) {
				if(income > RATE1_SINGLE_LIMIT) {
					tax1 = (int) (RATE1_SINGLE_LIMIT * 0.1);
					tax2 = (int)((income - RATE1_SINGLE_LIMIT) * 0.25);			
				}
				else{
					tax1 = (int) (income * 0.1);	
				}

			}
			
			if(status == 2) {
				if(income > RATE1_MARRIED_LIMIT) {
					tax1 = (int) (RATE1_MARRIED_LIMIT * 0.1);
					tax2 = (int)((income - RATE1_MARRIED_LIMIT) * 0.25);			
				}
				else {
					tax1 = (int) (income * 0.1);	
				}
			}
			
			return tax1 + tax2;
		}
	}

	
