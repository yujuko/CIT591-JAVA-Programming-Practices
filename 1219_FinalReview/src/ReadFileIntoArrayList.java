import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFileIntoArrayList {

	public static void main(String[] args) {
		File inputFile = new File("MostPopulatedCitiesCommaDelimited.txt");
		ArrayList<String> lines = new ArrayList<>();
				
		try {
		Scanner in = new Scanner(inputFile);
								
		while (in.hasNextLine()) {
			String line = in.nextLine();
			lines.add(line);
		}
		in.close();			
		} catch(FileNotFoundException fe) {
			System.out.println("File not found");
			fe.printStackTrace();
		}
		for(String s: lines)
			System.out.println(s);
		System.out.println("size is "+lines.size());
	}
}
