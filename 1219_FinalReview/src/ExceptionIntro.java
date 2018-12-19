import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionIntro {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt();
		//if user enters something other than an int, a InputMismatchException will occur
		//this is called an unchecked exception - you the programmer can and should handle these
		//2 ways to handle an unchecked exception
		//1. check for the condition that could cause the exception 
		//in your code and make sure it doesn't happen (recommended)
		//2. put try catch block around statement (not recommended)
		
		System.out.println("Enter another number");
		if(scan.hasNextInt()) {
			num=scan.nextInt();
		} else {
			System.out.println(scan.next()+ " is not a valid number");
		}
		
		//A checked exception is something different
		//We must handle that exception. Our code won't compile without it
		
		File f = new File("data.txt");
		try {
			Scanner fileScan = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
