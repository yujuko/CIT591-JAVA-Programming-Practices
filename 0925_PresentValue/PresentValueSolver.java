
public class PresentValueSolver {
	
	FutureCashFlow cashFlow;
	double presentValue;
	//construct a PresentValueSolver with a FutureCashFlow object
	
	public PresentValueSolver(FutureCashFlow fcf) {
		cashFlow = fcf;
		}
	
	public void calculatePresentValue() {
	//this is the present value formula
		
		presentValue= cashFlow.getFutureCash() / Math.pow(1 + cashFlow.getInterestRate(),cashFlow.getTime());
		}
	    //accessor or getter method
	
	public double getPresentValue() {
		return presentValue;}
	
}



