import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PassengerReaderDebugger {
		
		File fileName;	
		ArrayList<Passenger> passengers;	
		
		/**
		 * 
		 * @param fileName the titanic csv file
		 */
		PassengerReaderDebugger(String fileName) {
		
			this.fileName = new File(fileName);
			passengers = new ArrayList<>();	
					
		}
		
		private String processString(Scanner scan, String token) {
			
			if(!token.isEmpty() && token.charAt(0)=='\"') {
				token+=scan.next();
			}
			return token;
		}
		
		/**
		 * Reads and parses titanic csv file
		 * Creates Passenger objects 
		 * @return ArrayList of Passenger objects
		 * @throws FileNotFoundException 
		 */
		
		
		public ArrayList<Passenger> readTitanicFile() throws FileNotFoundException {	
			
			Scanner scan= new Scanner(this.fileName);
			//use , and \n (new line) as delimiters
			//delimiter is the character used to separate data in a file
			scan.useDelimiter(",|\n");
			//read in first line with column headers
			scan.nextLine();			
			String token=null;
			while (scan.hasNext()) {	
				token = scan.next();
				token.trim();
				token=processString(scan, token);
				System.out.print(token + ",");
 				
			}
			scan.close();
			return passengers;
		}
}
