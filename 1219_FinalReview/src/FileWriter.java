import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
	
	public void writeToFile(String fileName) throws FileNotFoundException {
		File f = new File(fileName);
		PrintWriter out = new PrintWriter(f);
		
		try {
			for(int i=0;i<5;i++) {
				out.print(i+",");
			}			
		} finally {
			out.close();
		}
		
	}

}
