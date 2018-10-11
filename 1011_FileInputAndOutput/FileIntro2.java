
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIntro2 {
	
	//MostPopulatedCities.txt is formatted with the city name followed by a whitespace and the total population
	//eg. Beijing 21,240,000
	//if the city has more than one name double quotes appear around the name
	//eg. "New York" 18,604,000
	//this program reads the file, removes the double quotes and creates City objects with the data
	//Note: to read in a file properly, you must know the format of it
	public static void main(String[] args) {
		
		String file = "MostPopulatedCities.txt";
		final int LINES = 5;
		int count = 0;
		File inputFile = new File("/Users/lucykuo/eclipse-workspace/Class13Oct11/MostPopulatedCities.txt");
		File outputFile = new File("/Users/lucykuo/eclipse-workspace/Class13Oct11/MostPopulatedCitiesCommaDelimited.txt");
		
		
		try {
			Scanner scan = new Scanner(inputFile);
			PrintWriter out = new PrintWriter(outputFile);
			while(scan.hasNextLine()) {
				String cityName = scan.next();
				//if the first character is a double quote, we know we need the next token from
				//scanner to add to the city name. eg. "New York"
				if(cityName.charAt(0) == '\"') {
					String secondPart = scan.next();
					cityName += " "+secondPart;
					cityName = cityName.substring(1, cityName.length()-1);
					
				}
				int population = scan.nextInt();
				
				//create City objects
				City city = new City();
				city.setName(cityName);
				city.setPopulation(population);
				System.out.println(cityName+ " "+population);
				
				//Using the City object, write to a new comma delimited  file
				count++;
				out.print(city.getName());
				out.print(',');
				out.print(city.getPopulation());
				//don't end the file with a new line
				if (count!=LINES) out.println();
				
			}
			scan.close();
			out.close();
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
			fe.printStackTrace();
		}
		
	}


}
