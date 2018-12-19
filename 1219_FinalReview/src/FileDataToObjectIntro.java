import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDataToObjectIntro {

	public static void main(String[] args) {
		File inputFile = new File("MPCCommaDelimited.txt");
	
				
		try {
		Scanner in = new Scanner(inputFile);
		in.useDelimiter(",|\n|\r");
								
		while (in.hasNextLine()) {
			String cityName = in.next();
			String country = in.next();
			System.out.println(cityName);
			//System.out.println(in.next());
			int population = in.nextInt();			
			City city = new City();
			city.setName(cityName);
			city.setPopulation(population);
			
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
