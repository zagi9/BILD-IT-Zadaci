package zadaci_23_02_2017;

import utils.Helper;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		System.out.print("Unesite pozitivan cijeli broj: ");
		int n;
		boolean isCorrect = false;
		do {
			n = help.checkIntInput();
			if (n > 0) isCorrect = true;
			else {
				System.out.println("Unos mora biti pozitivan cijeli broj");
				System.out.print("Pokusajte ponovo: ");
			}
		} while(!isCorrect);
		
		displayPyramid(n);
	}
	
	/**
	 * Method ispisuje piramidu cijelih brojeva u zavisnosti od proslijedjenog
	 * broja
	 * @param n
	 */
	public static void displayPyramid(int n) {
		
		for (int i=1; i <= n; i++) {
			for (int j=n; j >= 1; j--) {
				if (j <= i) System.out.printf("%3d", j);
				else System.out.printf("%3c", ' ');
			}
			for (int k=2; k <= n; k++) {
				if (k <= i) System.out.printf("%3d", k);
			}
			System.out.println();
		}
	}

}
