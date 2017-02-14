package zadaci_13_02_2017_bonus;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class TimeTravelling {
	public static void main(String[] args) {
				
		Helper help = new Helper();
		System.out.print("Unesite godinu: ");
		int year = help.checkIntInput();
		
		GregorianCalendar calendar = new GregorianCalendar();
		
		// Date object za unesenu godinu
		Date date = new  GregorianCalendar(year, 1, 1).getTime();
		// Danasnji datum
		Date date2 = new  GregorianCalendar().getTime();
		
		// broj milisekundi od Epoch do unesene godine
		long inYear = date.getTime();
		
		// broj milisekundi od Epoch do ovog trenutka
		long currentTime = date2.getTime();
		
		long timeToCalculate;
 
		timeToCalculate = Math.abs(currentTime - inYear);
	
		timeToDestination(timeToCalculate);
		walkBack(calendar.get(Calendar.YEAR), year);
		
	}
	
	/**
	 * Method izracunava ukupno sati, minuta i sekundi do unesene godine
	 * @param n
	 */
	public static void timeToDestination(long n) {
		
		long totalHours = n / (60 * 60 * 1000);
		n %= 60 * 60 * 1000;
		long totalMinutes = n / (60 * 1000);
		n %= 60 * 1000;
		long totalSeconds = n / 1000;
		System.out.println("Do izabrane godine ima: ");
		System.out.println(totalHours + " sati, " + totalMinutes + " minuta i "
				+ totalSeconds + " sekundi");
	}
	
	public static void walkBack(int nowYear, int pastYear) {
		
		final double STEP = 75;
		
		int lengthOfPath = Math.abs(nowYear - pastYear);
		
		double totalCms = STEP * lengthOfPath;
		double totalMeters = totalCms / 100;
		double totalKms = totalMeters / 1000;
		double totalFootballSt = totalMeters / 105;
		double aroundEarth = totalKms / 40075;
		
		System.out.println("Da bismo presli ovaj put treba preci: ");
		System.out.println(totalCms + " centimetara");
		System.out.println(totalMeters + " metara");
		System.out.println(totalKms + " kilometara");
		System.out.println(totalFootballSt + " fudbalskih terena");
		System.out.println(aroundEarth + " fudbalskih terena");
	}

}
