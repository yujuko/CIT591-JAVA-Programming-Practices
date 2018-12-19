import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFileIntoCityObject {
	/*
	 * Read in the MostPopulatedCitiesCommaDelimited.txt we just created and create City objects with it
	 * Notes: Look at the Scanner class for a method to use a delimiter other than whitespace
	 * The file is delimited by commas and by a carriage return
	 * You may have to trim the city String to get rid of any whitespace or new line feeds.
	 */
	public static void main(String[] args) {
		File inputFile = new File("MostPopulatedCitiesCommaDelimited.txt");			
				
		try {
			Scanner in = new Scanner(inputFile);
			in.useDelimiter(",|\n|\r");
								
		while (in.hasNext()) {
			String cityName = in.next();
			cityName=cityName.trim();
			System.out.print(cityName);
			int population = in.nextInt();		
			City city = new City();
			city.setName(cityName);
			city.setPopulation(population);
			if(in.hasNext())
     			in.next();
			
			System.out.println("city name: "+city.getName());
			System.out.println("Population: "+city.getPopulation());
		}
		in.close();			
		} catch(FileNotFoundException fe) {
			System.out.println("File not found");
			fe.printStackTrace();
		}
	}

}
