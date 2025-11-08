package FileHandlingExample;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

	public static void main(String[] args) {
		try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hello Murali! This is file handling in Java.");
            writer.close();
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
