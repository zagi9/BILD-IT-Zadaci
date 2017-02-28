package zadaci_28_02_2017;

import utils.Helper;

public class TestLocation {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		System.out.print("Unesite broj redova matrice: ");
		int rows = checkInput();
		System.out.print("Unesite broj kolona matrice: ");
		int cols = checkInput();
		
		System.out.println("Unesite matricu " + rows + "x" + cols + ":");
		double[][] m = new double[rows][cols];
		boolean isCorrect = false;
		do {
			m = help.checkArrayInput(rows, cols);
			if (m.length != 0) isCorrect = true;
			else System.out.println("Ponovite unos:");
		}while (!isCorrect);
		
		Location loc = Location.locateLargest(m);
		System.out.print("Lokacija najveceg element " + loc.maxValue + " je ");
		System.out.println("(" + loc.row + ", " + loc.column + ")");
		

	}
	
	/**
	 * Method provjerava unos cijelog broja i vraca, ukoliko je ispravan unos
	 * @return
	 */
	public static int checkInput() {
		
		Helper help = new Helper();
		int n;
		boolean isCorrect = false;
		do {
			n = help.checkIntInput();
			if (n > 1) isCorrect = true;
			else System.out.println("Unos nije validan, pokusajte ponovo: ");
		}while(!isCorrect);
		return n;
	}

}
