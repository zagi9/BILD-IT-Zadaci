package zadaci_20_02_2017;

import utils.Helper;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		System.out.println("Unesite dva cijela pozitivna broja: ");
		
		System.out.print("Unesite prvi broj: ");
		int n1 = promptUser();
		
		System.out.print("Unesite drugi broj: ");
		int n2 = promptUser();
		
		displayGcdAndScd(n1, n2);
	}
	
	/**
	 * Method pronalazi i ispisuje najveci i najmanji zajednicki djelilac 
	 * proslijedjenih brojeva
	 * @param n1
	 * @param n2
	 */
	public static void displayGcdAndScd(int n1, int n2) {
		
		int gcd = 1;
		int scd = 1;
		boolean foundScd = false;
		boolean foundGcd = false;
		
		int lim = n1 < n2 ? n1 : n2;
		
		for (int i=2, j=lim; i <= lim; i++, j--) {
			if ((n1 % i == 0) && (n2 % i == 0) && !foundScd) {
				scd = i;
				foundScd = true;
			}
			if ((n1 % j == 0) && (n2 % j == 0) && !foundGcd) {
				gcd = j;
				foundGcd = true;
			}
		}
		
		System.out.println("Najveci zajednicki djelilac brojeva " + 
				n1 + " i " + n2 + " je " + gcd);
		
		System.out.println("Najmanji zajednicki djelilac brojeva " + 
				n1 + " i " + n2 + " je " + scd);
	}
	
	/**
	 * Method trazi unos od korisnika provjerava validnost unosa i vraca
	 * @return
	 */
	public static int promptUser() {
		
		Helper help = new Helper();
		int n;
		boolean isCorrect = false;
		do {
			n = help.checkIntInput();
			if (n > 0) isCorrect = true;
			else System.out.print("Uneseni broj nije pozitivan pokusajte ponovo: ");
		} while(!isCorrect);
		
		return n;
	}

}
