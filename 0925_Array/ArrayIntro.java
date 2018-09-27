package Array;

import java.util.Scanner;

public class ArrayIntro {
	
	public static void main(String[] args) {
		
		double hw1 = 98;
		double hw2 = 88;
		double hw3 = 93;
		double hw4 = 97;
		double hw5 = 98;
		
		double[] homeworks = new double[5];
		//declare an array with # of items
		
		double[] array= {1.0,2.0,3.0};
		//declare an array with known items
		
		
		System.out.println("Homework at index place 0 is "+homeworks[0]);
		homeworks[0]=98;
		//assign a number to an item in the array
		
		System.out.println("Homework at index place 0 is "+homeworks[0]);

		for(int i=0 ; i<homeworks.length ; i++) {
			System.out.println(homeworks[i]);
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter up to 5 scores or any letter to quit: ");
		
		int currentSize = 0;
		while(scan.hasNextDouble()) {
			if(currentSize < homeworks.length) {
			homeworks[currentSize] =scan.nextDouble();
			currentSize ++;
		    }else {
				break;
			}
		}
		System.out.println("You entered "+currentSize+" scores.");
		
}
}