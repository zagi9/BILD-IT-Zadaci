package zadaci_15_02_2017;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Unesite godinu: ");
		int year = help.checkIntInput();
		System.out.print("Unesite mjesec kao broj: ");
		boolean isCorrectMonth = false;
		int month;
		do {
			month = help.checkIntInput();
			if (month < 1 || month > 12)
				System.out.print("Pogresan unos mjeseca, unesite ponovo: ");
			else 
				isCorrectMonth = true;
		} while (!isCorrectMonth);
		
		System.out.print(monthName(month) + " "); 
		checkYear(year);
		System.out.println(" imao je " + totalDays(year, month) + " dana");
	}
	
	/**
	 * Method ispisuje broj dana odredjenog mjeseca u godini
	 * @param year
	 * @param month
	 */
	public static int totalDays(int year, int month) {
		
		// Kreiram GregorianCalendar object za uneseni mjesec i godinu
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, 1);
				
		// getActualMaximum(Calendar.DAY_OF_MONTH) broj dana u mjesecu
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * Method prihvata mjesec kao broj, pretvara ga u ime mjeseca i vraca
	 * kao string
	 * @param n
	 * @return
	 */
	public static String monthName(int n) {
		String s = "";
		switch(n) {
			case 1: s = "Januar"; break;
			case 2: s = "Februar"; break;
			case 3: s = "Mart"; break;
			case 4: s = "April"; break;
			case 5: s = "Maj"; break;
			case 6: s = "Jun"; break;
			case 7: s = "Jul"; break;
			case 8: s = "Avgust"; break;
			case 9: s = "Septembar"; break;
			case 10: s = "Oktobar"; break;
			case 11: s = "Novembar"; break;
			case 12: s = "Decembar";
		}
		return s;
	}
	
	public static void checkYear(int year) {
		if (year < 0) 
			System.out.print(Math.abs(year) + ". godine PNE");
		else
			System.out.print(year + ". godine");
	}	
}