
public class MathCalculateTester {

	public static void main(String[] args) {
		MathCalculator abc = new MathCalculator();
		
		int facResult = abc.calculateFactorial(5);
		System.out.println(facResult);
		
		int perResult = abc.calculatePermutation(5, 3);
		System.out.println(perResult);
		
		int comResult = abc.calculateCombination(4, 2);
		System.out.println(comResult);
	}

}
