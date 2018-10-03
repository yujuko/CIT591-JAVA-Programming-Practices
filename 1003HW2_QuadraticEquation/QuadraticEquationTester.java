package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquationTester {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//user specifies coefficients
		System.out.println("Enter coefficients a, b, and c in order: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		//construct a QuadraticEquationSolver with new QuadraticEquation(a,b,c)
		QuadraticEquationSolver qes = new QuadraticEquationSolver(new QuadraticEquation(a,b,c));	
		
		//If the discriminant is positive, there should be two solution. And solution1 should be the small one. solution2 should be the large one
		if (qes.getDiscriminant() > 0) {
			System.out.println("The roots of the equation are " + qes.getSolution1() + " and " + qes.getSolution2());
		}
		
		//If the discriminant is zero, there should be only one solution, discriminant would be zero.
		else if(qes.getDiscriminant() == 0) {
			System.out.println("The roots of the equation are equal : " + qes.getSolution1());
		}
		
		else {
			System.out.println("The equation has no roots.");
		}
	}

}
