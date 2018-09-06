package objectPractice;

public class CalculatorTester {

	public static void main (String[]args) {
		
		SimpleCalculator calculator = new SimpleCalculator();
		//no need to import SimpleCalculator class since it's in the same package.
		
		int sum = calculator.add(5, 6);
		int diff = calculator.subtract(10,5);
		int quotient = calculator.divide(10,2);
		int remainder = calculator.getRemainder(12,5);
		
		System.out.println("Remainder is "+ remainder);
		System.out.println("Substract is "+ diff );		
		System.out.println("Divide is "+ quotient );
		System.out.println("Add is "+ sum );
	}
}
