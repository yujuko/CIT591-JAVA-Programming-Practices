import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample {
	
	public static void main(String[] args) {
		
		//unchecked exception
		//programmer is responsible for catching these
		int[] array = new int[5];
		System.out.println(array[10]);
		
		
		File file = new File("fileDoesNotExist.txt");
		//checked exception - out of the programmer's control
		//scope applies to try catch blocks
		//if you declare a variable in the block, the scope is the block
		//ie. you can only use that variable in the try catch block.
		try {
			Scanner in = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
