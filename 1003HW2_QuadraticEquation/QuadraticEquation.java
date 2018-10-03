package QuadraticEquation;
/**
 * A class whose constructor receives the coefficients a, b, c of the quadratic equation. 
 * And a evaluate method that evaluates the value of the quadratic equation given a specific x.
 * @author lucykuo
 *
 */
public class QuadraticEquation {
	
	private int a;
	private int b;
	private int c;
	
	/**
	 * constructs a Quadratic Equation without arguments
	 */
	//initialize the values of coefficients as zero
	QuadraticEquation() {
		a = 0;
		b = 0;
		c = 0;
	}
	/**
	 * constructs a Quadratic Equation with coefficients a, b and c
	 * @param newA coefficients a of ax^2 + bx + c = 0
	 * @param newB coefficients b of ax^2 + bx + c = 0
	 * @param newC coefficients c of ax^2 + bx + c = 0
	 */
	//user specifies coefficients
	QuadraticEquation(int newA, int newB, int newC) {
		a = newA;
		b = newB;
		c = newC;
	}
	/**
	 * A method that gets coefficients a
	 * @return coefficients a
	 */
	public int getA() {
		return a;
	}
	/**
	 * A method that gets coefficients b
	 * @return coefficients b
	 */
	public int getB() {
		return b;
	}
	/**
	 * A method that gets coefficients c
	 * @return coefficients c
	 */
	public int getC() {
		return c;
	}
	/**
	 * A method that evaluates the value of the quadratic equation given a specific x.
	 * @param x A specific value of x being used to claculate the value of the quadratic equation
	 * @return the value of the quadratic equation
	 */
	public double evaluate(double x) {
		return a*x*x + b*x + c;
	}	
	
	}
