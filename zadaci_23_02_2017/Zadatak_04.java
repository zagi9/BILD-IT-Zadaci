package zadaci_23_02_2017;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Zadatak_04 {
	public static void main(String[] args) {
	
		printDateAndTime();
	}
	
	/**
	 * Method ispisuje datum i tacno vrijeme
	 */
	public static void printDateAndTime() {
		
		GregorianCalendar gc = new GregorianCalendar();
		int year = gc.get(Calendar.YEAR);
		int month = gc.get(Calendar.MONTH);
		int day = gc.get(Calendar.DAY_OF_MONTH);
		int hour = gc.get(Calendar.HOUR);
		int minute = gc.get(Calendar.MINUTE);
		int second = gc.get(Calendar.SECOND);
		
		System.out.println("Datum: " + day + "." + (month+1) + "." + year);
		System.out.println("Tacno vrijeme: " + hour + ":" + minute + ":" + second);
	}

}
