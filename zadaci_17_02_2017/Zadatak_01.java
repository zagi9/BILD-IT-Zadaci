package zadaci_17_02_2017;

import utils.Helper;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Unesute pocetnu godinu: ");
		int startYear = help.checkIntInput();
		
		System.out.print("Unesute zavrsnu godinu: ");
		int endYear = help.checkIntInput();
		
		displayDaysOfYears(startYear, endYear);

	}
	
	/**
	 * Method vraca broj dana u proslijedjenoj godini
	 * @param year
	 * @return
	 */
	public static int numberOfDayInAYear(int year)  {
		
		return isLeap(year) ? 366 : 365;
	}
	
	/**
	 * Method provjerava da li je proslijedjena godina prestupna
	 * @param year
	 * @return
	 */
	public static boolean isLeap(int year) {
		
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}
	
	/**
	 * Method ispisuje broj dana za svaku godinu u rasponu proslijedjenih godina
	 * @param startYear
	 * @param endYear
	 */
	public static void displayDaysOfYears(int startYear, int endYear) {
		
		if (startYear > endYear) {
			
			int temp = startYear;
			startYear = endYear;
			endYear = temp;
		}
		
		
		for (int i = startYear; i <= endYear; i++) {
			
			int year = Math.abs(i);
			System.out.print(year + ". godina ");
			if (i < 0) System.out.print("BC");
			System.out.print(" ima " + numberOfDayInAYear(i));
			System.out.println(" dana.");
		}
	}

}
