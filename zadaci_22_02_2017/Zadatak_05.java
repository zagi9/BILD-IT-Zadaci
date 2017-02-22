package zadaci_22_02_2017;

import utils.Helper;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		System.out.print("Unesite n dimenziju kvadratne matrice: ");
		
		int n;
		boolean isCorrectInput = false;
		do {
			n = help.checkIntInput();
			if (n > 1) isCorrectInput = true;
			else System.out.print("Unos nije validan unesite pozitivan "
					+ "cijeli broj veci od 1: ");
		} while(!isCorrectInput);
		
		displayMatrix(n);
		
	}
	
	/**
	 * Method prihvata cijeli broj n i ispisuje kvadratnu matricu(nxn) sa 0 i 1
	 * @param n
	 */
	public static void displayMatrix(int n) {
		
		for (int i=0; i < n; i++) {
			for (int j=0; j < n; j++) {
				System.out.print(generate() + " ");
			}
			System.out.println();
		}
	}
	
	public static int generate() {
		return (int)(Math.random() * 2);
	}
}
