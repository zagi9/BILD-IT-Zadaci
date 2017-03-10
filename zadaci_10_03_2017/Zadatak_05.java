package zadaci_10_03_2017;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		File file = createFile();
		processScores(file);
	}
	
	/**
	 * Method kreira file, ispisuje rezultate i vraca File
	 * @return
	 */
	public static File createFile() {
		
		File file = new File("test.txt");
		
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println("12 2 34 54 32 1 23 6 45 3 2 67 8 9 9 5");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return file;
	}
	
	/**
	 * Method cita file i racuna ukupan skor iprosijek
	 * @param file
	 */
	public static void processScores(File file) {
		
		int total = 0;
		int count = 0;
		
		try (Scanner sc = new Scanner(file)) {
			
			 while(sc.hasNext()) {
				 total += sc.nextInt();
				 count++;
			 }
			
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println("Ukupan skor je: " + total);
		System.out.println("Prosijek je: " + (1.0 * total / count));
	}

}
