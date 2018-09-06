package objectPractice;


public class CalculatorTester {

	public static void main (String[]args) {
		
		SimpleCalculator calculator = new SimpleCalculator();
		//no need to import SimpleCalculator class since it's in the same package.
		
		calculator.add(20);
		System.out.println("Number is "+ calculator.getNumber() + " now! ");
		
		calculator.subtract(2);
		System.out.println("Number is "+ calculator.getNumber() + " now! ");
		
		calculator.divide(3);
		System.out.println("Number is "+ calculator.getNumber() + " now! ");
		
		calculator.getRemainder(2);
		System.out.println("Number is "+ calculator.getNumber() + " now! ");
	}
}
