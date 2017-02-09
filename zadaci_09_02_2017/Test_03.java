package zadaci_09_02_2017;

import java.nio.file.*;
import java.io.*;

/*
 * Test_03 klasu koristim za pozivanje main() method_e Zadatak_03 klase
 */
public class Test_03 {
	public static void main(String[] args) {
		
		Path path = Paths.get("test.txt");
		 
		// Kreiram file i ispisujem dummy tekst
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			writer.write("Prva linija");
			writer.newLine();
			writer.write("Druga linija");
			writer.newLine();
			writer.write("Treca linija");
			writer.newLine();
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		// Pozivam main() method_u Zadatak_03 klase i prosljedjujem niz stringova
		// sa jednim elementom "test.txt"
		Zadatak_03.main(new String[]{"test.txt"});
	}

}
