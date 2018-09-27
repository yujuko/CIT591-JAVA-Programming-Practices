
public class MathCalculator {
	
	public int calculateFactorial(int n) {
		
		int factorial = 1;
		for(int i = n; i > 0; i--) {
//			System.out.println("Fac is "+factorial);
//			System.out.println("i is "+ i);
//			System.out.println("n is "+ n);
			factorial *= i;
		}
		return factorial;
	}

	public int calculatePermutation(int n, int k) {
		return calculateFactorial(n)/calculateFactorial(n-k);
	}
	
	public int  calculateCombination(int n, int k) {
		return calculateFactorial(n)/(calculateFactorial(k)*calculateFactorial(n-k));
	}
}
