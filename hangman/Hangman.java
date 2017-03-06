package hangman;

import java.util.Scanner;

public class Hangman {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char playAgain = 'y';
		
		String[] words = {"Ljuljana", "Maribor", "Zagreb", "Split", "Sarajevo", "Banjaluka", "Beograd", "Kraljevo",
				"Budva", "Podgorica", "Skopje", "Ohrid"};
		
		while (playAgain == 'y') {
			
			String word = generateWord(words);
			 
			char[] chArray = new char[word.length()];
			
			for (int i = 0; i < chArray.length; i++)
				chArray[i] = '*';
		
			int missed = 0;
	
			do {
				displayQuestion(chArray);
			
				char guess = Character.toLowerCase(input.next().charAt(0));
				
				missed = checkGuess(word, chArray, guess, missed);
				
			} while(!isFull(chArray));
			
			System.out.print("Rijec je ");
			for (char c : chArray)
				System.out.print(c);
			System.out.println(" pogrijesili ste " + missed + " puta");
		
			do {
				System.out.print("Zelite li pogadjati sljedecu rijec? " + 
						"Unesite y or n> ");
		
				playAgain = input.next().charAt(0);
				
				
				if (playAgain != 'y' && playAgain != 'n')
					System.out.println("Pogresan unos");
				
			} while (playAgain != 'y' && playAgain != 'n');	
			
		};
		
		input.close();
	}
	
	/**
	 * Metod generise rijec, koju pogadjamo, iz string niza  
	 * @param s
	 * @return
	 */
	 
	public static String generateWord(String[] s) {
		return s[(int)(Math.random() * s.length)].toLowerCase();
	}
	
	/**
	 * Metod ispisuje prompt korisniku za unos karaktera i ispisuje
	 * vec pogodjene karaktere, odnosno, '*', gdje nema pogotka
	 * @param ch
	 */
	public static void displayQuestion(char[] ch) {
		System.out.print("(Pogadjajte) Unesite slovo ");
		for (int i = 0; i < ch.length; i++) 
			System.out.print(ch[i]);
		System.out.print(" > ");	
	}
	
	/**
	 * Metod provjerava, postoji li u rijeci uneseni karakter 
	 * @param s
	 * @param ch
	 * @return
	 */
	public static boolean isContaining(String s, char ch) {
		for (int i = 0; i < s.length(); i++) 
			if (s.charAt(i) == ch) return true;
		
		return false;
	}
	
	/**
	 * Metod provjerava da li je vec ranije unesen karakter koji unese korisnik
	 * @param chArray
	 * @param ch
	 * @return
	 */
	public static boolean isAlreadyGuessed(char[] chArray, char ch) {
		for (int i = 0; i < chArray.length; i++)
			if (chArray[i] == ch) return true;
		
		return false;
	}
	
	/** Metod provjerava da li su pogodjeni svi karakteri */
	public static boolean isFull(char[] ch) {
		for (char i : ch)
			if (i == '*') return false;
		return true;
	}
	
	/**
	 * Metod kontrolise unos korisnika i u slucaju pogresnog pokusaja, broj promasaja
	 * uvecava za jedan
	 * @param s
	 * @param chArr
	 * @param ch
	 * @param n
	 * @return
	 */
	public static int checkGuess(String s, char[] chArr, char ch, int n) {
		
		if (isAlreadyGuessed(chArr, ch))
			System.out.println(ch + " je vec upisano");
		else if (!isContaining(s, ch)) {
			System.out.println(ch + " nije u rijeci");
			return ++n;
		}	
		else {
			for (int i = 0; i < chArr.length; i++) {
				if (s.charAt(i) == ch) {
					if (i == 0) 
						chArr[i] = Character.toUpperCase(ch);
					else
						chArr[i] = ch;
				}
			}
		}
		return n;
	}
}
