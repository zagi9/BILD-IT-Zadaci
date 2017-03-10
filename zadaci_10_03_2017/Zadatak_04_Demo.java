package zadaci_10_03_2017;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zadatak_04_Demo {
	public static void main(String[] args) {
		
		Path path = Paths.get("test.txt");
		 
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			
			writer.write("Some text on first line");
			writer.newLine();
			writer.write("Another on second");
			writer.newLine();
			writer.write("and little more");
			writer.newLine();
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		Zadatak_04.main(new String[]{"test.txt"});
	}

}
