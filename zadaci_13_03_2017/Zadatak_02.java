package zadaci_13_03_2017;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		createDummyFile("test.txt"); 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite ime file_a: ");
		String fileName = sc.nextLine();
		
		File file = new File(fileName);
	
		sc.close();
		countLetters(file);	
	}
	
	public static void createDummyFile(String s) {
		
		File file = new File(s);
		try (PrintWriter pw = new PrintWriter(file);) {
			pw.println("dfsfsfGJGUJGGGG");
			pw.println("FFTFjgjgjygKUUGGJGJGJ");
			pw.println("GJGJGGjgyugyugyugyugug");
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	} 
	
	public static void countLetters(File file) {
		
		
		int[] countLower = new int[26];
		int[] countUpper = new int[26];
		
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			int n;
			while((n = br.read()) != -1) {
				if (n >= 'a' && n <= 'z') countLower[n - 'a']++;
				if (n >= 'A' && n <= 'Z') countUpper[n - 'A']++;
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("File nije pronadjen");
			System.exit(1);
		} catch(IOException e) {
			e.printStackTrace();
		}
			
		for (int i=0; i < countLower.length; i++) {
			char letter = (char) (i + 'a');
			System.out.println("Ukupan broj slova " + letter + " je: " + countLower[i]);
		}
		System.out.println();
		
		for (int i=0; i < countUpper.length; i++) {
			char letter = (char) (i + 'A');
			System.out.println("Ukupan broj slova " + letter + " je: " + countUpper[i]);
		}
	}
}
