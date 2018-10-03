package QuadraticEquation;
/**
 * A class whose constructor receives an object of type QuadraticEquation. 
 * Supply methods that get the solutions and method to print them out.
 * @author lucykuo
 *
 */
public class QuadraticEquationSolver {
	
	QuadraticEquation quadraticEquation;

	/**
	 * construct a QuadraticEquationSolver with an object of type QuadraticEquation.
	 * @param quadraticEquation an object of type QuadraticEquation
	 * 
	 */
	QuadraticEquationSolver (QuadraticEquation quadraticEquation){
		this.quadraticEquation= quadraticEquation;
	};
	
	/**
	 * A method that returns the discriminant of the equation
	 * @return discriminant: b * b - (4 * a * c)
	 */
	public double getDiscriminant() {
		return (Math.pow(quadraticEquation.getB(), 2) - 4 * quadraticEquation.getA() * quadraticEquation.getC());
	}
	
	/**
	 * A method that use the quadratic formula to calculate one solution 
	 * @return a smaller solution of quadratic formula
	 */
	public double getSolution1() {
		return ((-quadraticEquation.getB() - Math.sqrt(getDiscriminant())) / (2 * quadraticEquation.getA()));
	}	
	
	/**
	 * A method that use the quadratic formula to calculate one solution 
	 * @return a larger solution of quadratic formula
	 */	
	public double getSolution2() {
		return ((-quadraticEquation.getB() + Math.sqrt(getDiscriminant())) / (2 * quadraticEquation.getA()));
	}
	
	/**
	 * A setter of quadraticEquation
	 * @param quadraticEquation
	 */
	public void setQuadraticEquation(QuadraticEquation quadraticEquation) {
		this.quadraticEquation = quadraticEquation;
	}

}
