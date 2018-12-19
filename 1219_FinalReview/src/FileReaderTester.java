import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class FileReaderTester {
	
	public static void main(String[] args) {	
		
		
		
		FileReader fr = new FileReader();
				
		
		try {
			//fr.readFile("data.txt");
			fr.readFile("data2.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InputMismatchException e) {
		// TODO Auto-generated catch block
			System.out.println("File format issue");
		//e.printStackTrace();
		}  
	}

}
