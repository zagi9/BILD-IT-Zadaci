package zadaci_21_02_2017;

import utils.Helper;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		prompt();
	}
	
	/**
	 * Method trazi unos od korisnika
	 */
	public static void prompt() {
		
		Helper help = new Helper();
		System.out.print("Unesite tezinu prvog pakovanja: ");
		double weight1 = help.checkDoubleInput();
		System.out.print("Unesite cijenu prvog pakovanja: ");
		double price1 = help.checkDoubleInput();
		
		System.out.print("Unesite tezinu drugog pakovanja: ");
		double weight2 = help.checkDoubleInput();
		System.out.print("Unesite cijenu drugog pakovanja: ");
		double price2 = help.checkDoubleInput();
		
		comparePrices(weight1, price1, weight2, price2);
	}
	
	/**
	 * Method uporedjuje kolicinu i cijenu dva paketa i vraca obavjestenje koji 
	 * je isplativiji
	 * @param w1
	 * @param p1
	 * @param w2
	 * @param p2
	 */
	public static void comparePrices(double w1, double p1, double w2, double p2) {
		
		if ((w1 / p1) > (w2 / p2)) 
			System.out.println("Isplativiji je prvi paket");
		
		else if ((w1 / p1) == (w2 / p2))
			System.out.println("Isplativost je jednaka");
		
		else
			System.out.println("Isplativiji je drugi paket");
	}

}
