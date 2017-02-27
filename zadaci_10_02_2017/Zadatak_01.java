package zadaci_10_02_2017;

import utils.Helper;

public class Zadatak_01 {
	public static void main(String[] args) {
	
		Helper help = new Helper();
		
		System.out.print("Unesite pocetni broj: ");
		int first = help.checkIntInput();	
		
		System.out.print("Unesite krajnji broj: ");
		int last = help.checkIntInput();
		
		System.out.print("Koliko zelite brojeva po liniji: ");
		int perLine = help.checkIntInput();
		
		// U slucaju da korisnik unese 0 ili negativni broj program trazi novi unos
		while (perLine <= 0) {
			System.out.println("Nevazeci unos, broj linija mora biti veci od 0");
			System.out.print("Unesite novu vrijednost: ");
			perLine = help.checkIntInput();
		}
		
		printPrimes(first, last, perLine);
	}
	
	/*
	 * Method ispisuje proste brojeve u rasponu argumenata first-last
	 * Sa po, perLine, brojeva po liniji
	 */
	public static void printPrimes (int first, int last, int perLine) {
		
		int counter = 1; 
		for (int i = first; i <= last; i++) {
			
			// Ako je i 0 ili 1 preskace se ispis jer ovo nisu prosti brojevi
			if (i == 0 || i == 1) continue;
			
			if (isPrime(i)) {
				if (counter % perLine == 0) System.out.printf("%5d\n", i);
				else System.out.printf("%5d", i);
				counter++;
			}
		}
		System.out.println("\n\nU navedenom rasponu imamo ukupno " + (counter-1) +
				" prostih brojeva");
	}
	
	/*
	 * Method provjerava da li je argument n prost broj
	 */
	public static boolean isPrime(int n) {
		for (int i=2; i <= n/2; i++) 
			if (n % i == 0) return false;
		return true;
	}

}
