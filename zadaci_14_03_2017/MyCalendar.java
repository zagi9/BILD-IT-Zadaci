package zadaci_14_03_2017;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		
		GregorianCalendar gc = new GregorianCalendar();
		int year = 0;
		int month = 0;
		if (args.length == 2) {
			year = Integer.parseInt(args[1]);
			month = Integer.parseInt(args[0])-1;
			gc = new GregorianCalendar(year, month, 1);
		}
		else if (args.length == 1) {
			year = gc.get(Calendar.YEAR);
			month = Integer.parseInt(args[0])-1;
			gc = new GregorianCalendar(year, month, 1);
			
		}
		else if (args.length == 0) {
			year = gc.get(Calendar.YEAR);
			month = gc.get(Calendar.MONTH);
			gc = new GregorianCalendar(year, month, 1);
		}
		
		displayHeader(year, month);
		displayBody(gc);
	}
	
	/**
	 * Method ispisuje header kalendara
	 * @param year
	 * @param month
	 */
	private static void displayHeader(int year, int month) {
		
		System.out.println();
		String[] months = {"January", "February", "March", "April", "May", 
				"Jun", "July", "August", "September", "October", "November", "December"};

		
		
		System.out.printf("%23s%5d\n", months[month], year);
		System.out.println("   ---------------------------------------");
		System.out.printf("%6s%6s%6s%6s%6s%6s%6s\n",
				"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
	}
	
	/**
	 * Method ispisuje tijelo kalendara
	 * @param calendar
	 */
	private static void displayBody(GregorianCalendar calendar) {
		
		int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		
		int totalDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		for (int i=1; i < weekDay; i++) System.out.printf("%6s", " ");
		
		for (int i=1; i <= totalDays; i++) {
			System.out.printf("%6d", i);
			if (weekDay % 7 == 0) {
				System.out.println();
				weekDay = 0;
			}
			weekDay++;
		}
		System.out.println();
	}

}
