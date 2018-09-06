package objectPractice;

import java.awt.Rectangle;

public class RectangleMover {

	public static void main(String []args) {
		
		Rectangle r1 = new Rectangle();
		
		Rectangle r2 = new Rectangle(5,10,7,3);
		
		double height = r2.getHeight();
		
		
		Rectangle r3 = new Rectangle(5,5);
		
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		
		System.out.println("Expected: Height of rectangle is " + 3.0);
		System.out.println("Actual: Height of rectangle is " + height);
		System.out.println("Actual: Height of rectangle is " + r2.getHeight());
		
		
	}
}
