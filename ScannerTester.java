import java.util.Scanner;

public class ScannerTester {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Enter an int:");
		 
//		 int num = scan.nextInt();
		 
		 while(scan.hasNextInt()) {
			 System.out.println("You entered "+scan.nextInt());
			 System.out.println("Enter an integer: ");
		 }
		 
		 System.out.println("You entered "+scan.next());
		 //scan.next : scan whatever you entered
	}

}
