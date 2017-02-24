package zadaci_24_02_2017;

import utils.Helper;

public class Zadatak_01 {

	public static void main(String[] args) {
	
		Helper help = new Helper();
		
		System.out.print("Unesite cijeli broj 0-127: ");
		int n;
		boolean isCorrect = false;;
		do {
			n = help.checkIntInput();
			if (n >= 0 && n <= 127) isCorrect = true;
			else System.out.println("Uneseni broj mora biti u rasponu 0-127");
		} while (!isCorrect);
		
		printChar(n);
	}
	
	/**
	 * Method proslijedjeni cijeli broj mijenja u ASCII simbol i ispisuje
	 * @param n
	 */
	public static void printChar(int n) {
		
		char c =(char) n;
		System.out.print("Broj " + n + " kao ASCII karakter je " + c);
		if (n == 32) System.out.println("space");
	}

}
