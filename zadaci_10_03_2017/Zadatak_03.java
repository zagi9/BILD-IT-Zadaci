package zadaci_10_03_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		String stringToRemove = null;;
		String filename = null;
		
		try {
			stringToRemove = args[0];
			filename = args[1];
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Entry point aplikacije je klasa Zadatak_03_Demo");
			System.exit(0);
		}
		
		File file = createFile(filename);
		readFile(file);
		System.out.println();
		file = changeFile(stringToRemove, filename);
		readFile(file);
	}
	
	/**
	 * Method cita file
	 * @param filename
	 */
	public static void readFile(File filename) {
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			
			String s = reader.readLine();
			while (s != null) {
				System.out.println(s);
				s = reader.readLine();
			}
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	/**
	 * Method kreira novi i vraca file
	 * @param filename
	 * @return
	 */
	public static File createFile(String filename) {
		
		File file = new File(filename);
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println("John, has to go!");
			pw.println("Why John, has to go?");
			pw.println("Because, John is no longer needed!");
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		return file;
	}
	
	/**
	 * Method mijenja i vraca izmijenjen file
	 * @param s
	 * @param filename
	 * @return
	 */
	public static File changeFile(String s, String filename) {
		
		File file = new File(filename);
		File file2 = new File("test2.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file));
			 PrintWriter writer = new PrintWriter(file2)) {
			
			String str = reader.readLine();
			while (str != null) {
				String st = removeUnwanted(str, s);
				writer.println(st);
				str = reader.readLine();
			}
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return file2;
	
	}
	
	/**
	 * Method izbacuje substring iz stringa
	 * @param s
	 * @param unwanted
	 * @return
	 */
	public static String removeUnwanted(String s, String unwanted) {
		
		StringBuilder sb = new StringBuilder(s);
		
		
		for (int i=0; i < s.length() - unwanted.length() + 1; i++) 
			if (s.substring(i, i + unwanted.length()).equals(unwanted))
				sb.delete(i, i + unwanted.length());
		
		return sb.toString();
				
	}

}
