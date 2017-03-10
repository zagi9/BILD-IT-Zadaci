package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Path path = null;
		
		try {
			path = Paths.get(args[0]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Zadatak_04_Demo je entry point aplikacije");
			System.exit(0);
		}
		
		int characters = 0;
		int words = 0;
		int lines = 0;
		
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			
			String line = reader.readLine();
			while (line != null) {
				
				lines++;
				
				characters += line.length();
			
				String[] str = line.split(" ");
				words += str.length;
				line = reader.readLine();
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("File ima " + lines + " linija, " + words + " rijeci i "
				+ characters + " karaktera, ukljucujuci i space");
	}

}
