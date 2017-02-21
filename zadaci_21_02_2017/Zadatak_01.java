package zadaci_21_02_2017;

import utils.Helper;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		prompt();
	}
	
	/**
	 * Method trazi unose od korisnika
	 */
	public static void prompt() {
		
		Helper help = new Helper();
		
		System.out.print("Unesite iznos racuna: ");
		double bill = help.checkDoubleInput();
		
		System.out.print("Unesite procenat napojnice: ");
		double tip = help.checkDoubleInput();
		
		computeGratuity(bill, tip);
	}
	
	/**
	 * Method prihvata argumente iznos racuna(bill) i procenat napojnice(tip)
	 * Izracunava ukupan iznos racuna i napojnice i vraca kao obavjestenje
	 * @param bill
	 * @param tip
	 */
	public static void computeGratuity(double bill, double tip) {
		
		double gratuityAmount = (bill * tip) / 100;
		
		System.out.printf("Ukupan racun je %4.2f a iznos napojnice je %4.2f", 
				(bill + gratuityAmount), gratuityAmount);
	}

}
