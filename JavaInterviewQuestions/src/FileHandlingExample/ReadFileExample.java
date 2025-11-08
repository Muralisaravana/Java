package FileHandlingExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

	public static void main(String[] args) {
		 try {
	            FileReader reader = new FileReader("data.txt");
	            BufferedReader br = new BufferedReader(reader);
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	            br.close();
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	}

}
