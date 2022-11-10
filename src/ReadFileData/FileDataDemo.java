package ReadFileData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileDataDemo {
	
	
	public static void main(String args[]) throws IOException
	{
		
	
		List<String> readData = Files.readAllLines(Paths.get("C:\\Users\\Musayyib Rao\\Desktop\\data.txt"));
	 
		 readData.forEach(System.out::println);
		
	}
	

}
