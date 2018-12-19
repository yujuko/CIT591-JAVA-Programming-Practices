import java.io.FileNotFoundException;

public class FileWriterTester {

	public static void main(String[] args) {
		FileWriter fr = new FileWriter();
		try {
			fr.writeToFile("out_data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
