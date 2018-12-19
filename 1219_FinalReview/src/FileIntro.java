import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIntro {
	
	//Read input file, MCITCourseNumbers.txt to get the MCIT course numbers
	//Output to a new file called MCITCourseNames.txt, the prefix, "CIT-" 
	//plus the course numbers 
	
	public static void main(String[] args) {
		//1. create a File object
		File inputFile = new File("MCITCourseNumbers.txt");
		File outputFile = new File("MCITCourseNames.txt");
		
		//Scanner is created with the File object instead of System.in
		//Scanner will read input from the file NOT the console like we've been doing
		//if the file does not exist, a FileNotFoundException is thrown
		//we must handle that exception - use try catch block
		//more on that after the midterm
		try {
			//Scanner does a nice job of parsing a file
			//By default it uses whitespace as the delimiter
			//You can set the delimiter with the useDelimiter method (see Javadocs)
			Scanner in = new Scanner(inputFile);
			
			//Create a PrintWriter object to write to a file
			PrintWriter out = new PrintWriter(outputFile);
					
			while (in.hasNextLine()) {
				String courseNum = in.nextLine();
				String courseName = "CIT-"+courseNum;	
				System.out.println("Printing to file the MCIT course: " + courseName);
				out.println(courseName);
			}
			in.close();
			//make sure you close the output stream or the file is not complete
			//or can be completely empty
			out.close();
			
		} catch(FileNotFoundException fe) {
			System.out.println("File not found");
			fe.printStackTrace();
		}
	}

}
