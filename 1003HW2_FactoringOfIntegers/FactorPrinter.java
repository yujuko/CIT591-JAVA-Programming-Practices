package FactoringOfIntegers;

import java.util.Scanner;
/**
 * A class with a main method that reads a user input, constructs a FactorGenerator object, and prints the factors.
 * @author lucykuo
 *
 */
public class FactorPrinter {

	public static void main(String[] args) {
		
		System.out.print("Type an integer: ");
		
		Scanner scan = new Scanner(System.in);
		int numberInput = scan.nextInt(); 
		//ask the user to input a number.
		
		FactorGenerator fgTest = new FactorGenerator(numberInput); 
		//construct a FactorGenerator with the number that the user typed.
		
		while(fgTest.hasMoreFactors()) {
			System.out.print(fgTest.nextFactor()+" ");
		}
		//print factors out while there are more factors, until the hasMoreFactors return false.

	}
}
