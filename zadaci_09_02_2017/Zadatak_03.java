package zadaci_09_02_2017;

import java.nio.file.*;
import java.io.*;

/*
 * Program prebrojava i ispisuje broj linija rijeci i karaktera u file_u
 * POZVATI IZ Test_03 klase
 */
public class Zadatak_03 {
	public static void main(String[] args) {
		
		// Path kreiramo tako da get() metodu prosljedjujemo String "test.txt"
		// pozivajuci main() method iz klase Test_03
		Path path = Paths.get(args[0]);
		
		int characters = 0;
		int words = 0;
		int lines = 0;
		
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			
			String line = reader.readLine();
			while (line != null) {
				// line se inkrementira u svakom prolasku kroz petlju
				lines++;
				// character se uvecava dodavanjem duzine stringa line u svakom 
				// prolasku kroz petlju
				characters += line.length();
				// String niz kreiram pozivajuci split() method za String line
				// word se uvecava prebrojavanjem elemenata stringa str u svakom 
				// prolasku kroz petlju
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
