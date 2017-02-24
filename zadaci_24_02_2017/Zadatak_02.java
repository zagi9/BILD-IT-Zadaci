package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite karakter: ");
		String s;
		boolean isCorrect = false; 
		do {
			s = sc.nextLine();
			isCorrect = isCorrectCharInput(s);
		} while(!isCorrect);
		
		char c = s.charAt(0);
		System.out.println("Unicode za " + c + " je " + unicodeCharacter(c));
		
		sc.close();
	}
	
	/**
	 * Method prihvata karakter i vraca odgovarajuci unicode
	 * @param c
	 * @return
	 */
	public static int unicodeCharacter(char c) {
		
		return c;
	}
	
	public static boolean isCorrectCharInput(String s) {
		
		if (s.length() != 1) {
			System.out.print("Unos nije validan pokusajte ponovo: ");
			return false;
		}
		return true;
	}
}
