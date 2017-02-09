package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s = sc.nextLine();
		
		countLetters(s);
		
		sc.close();
	}
	
	/*
	 * Method "broji" samoglasnike i suglasnike u stringu
	 */
	public static void countLetters(String s) {
		
		// Inicijalne vrijednosti za broj samoglasnika i suglasnika
		int vovels = 0;
		int consonants = 0;
		for (int i=0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			
			// Ukoliko je karakter samoglasnik, uvecavam broj samoglasnika
			if (isVovel(currentChar)) vovels++;
			
			// Provjeravam da li je karakter slovo,
			// ukoliko jeste, uvecavam broj suglasnika
			else if (Character.isLetter(currentChar)) consonants++;
		}
		System.out.println("Broj samoglasnika u unesenom stringu je " + vovels);
		System.out.println("Broj suglasnika u unesenom stringu je " + consonants);
	}
	
	/*
	 * Method provjerava da li je karakter samoglasnik 
	 */
	public static boolean isVovel(char ch) {
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
			ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		return false;
	}

}
