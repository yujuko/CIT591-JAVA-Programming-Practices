import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	
	ArrayList<Integer> list;
	
	FileReader() {
		
		list=new ArrayList<Integer>();
		
	}
	
	public void readFile(String file) throws FileNotFoundException {
		
		File f = new File(file);
		Scanner scan = new Scanner(f);
		
		while(scan.hasNext()) {
			int val = scan.nextInt();
			list.add(val);
		}
		scan.close();
	}

}
