package zadaci_24_02_2017;

import utils.Helper;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		System.out.print("Unesite short vrijednost: ");
		
		short n = help.checkShortInput();
			
		System.out.print("Broj " + n + " u binarnom obliku je ");
		printShortAsBinary(n);
	}
	
	/**
	 * Method ispisuje vrijednost proslijedjenog short broja u binarnom obliku
	 * @param n
	 */
	public static void printShortAsBinary(short n) {
		
		int mask = 1;
		for (int i=15; i >= 0; i--) {
			int temp = n >> i;
			System.out.print(temp & mask);
		}
	}

}
