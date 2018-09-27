
public class PresentValueTester {

	public static void main(String[] args) {
		
		FutureCashFlow fut = new FutureCashFlow(100, .1, 10);
		PresentValueSolver pvs = new PresentValueSolver(fut);
		
		pvs.calculatePresentValue();
		System.out.printf("The present value of receiving $100 in 10 years " 
		 + "is $%.2f \n",pvs.getPresentValue());

	}

}
