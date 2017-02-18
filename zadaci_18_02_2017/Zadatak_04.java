package zadaci_18_02_2017;

import utils.Helper;

public class Zadatak_04 {

	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Unesite broj minuta: ");
		long minutes = help.checkLongInput();
		displayYearsAndMonths(minutes);
	}
	
	/**
	 * Method prihvata broj minuta kao long broj, izracunava broj godina i mjeseci
	 * i ispisuje
	 * @param n
	 */
	public static void displayYearsAndMonths(long n) {
		
		long minutes = n;
		
		final long MINUTES_IN_YEAR = 60 * 24 * 365;
		
		long totalYears = minutes / MINUTES_IN_YEAR;
		minutes %= MINUTES_IN_YEAR;
		long totalMonths = minutes / (MINUTES_IN_YEAR / 12);
		
		System.out.println("U " + n + " minuta ima " + totalYears + " godina i "
				+ totalMonths + " mjeseci");
	}

}
