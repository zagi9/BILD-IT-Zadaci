package calendar;

import java.util.*;

/*
 * Klasa MyCalendar implementira method_e za ispis kalendara za mjesec koji "trazi" 
 * korisnik. 
 */
public class MyCalendar {
	
	private int year;
	private int month;
	private int day;
	private GregorianCalendar calendar;
	
	// Defaultni konctruktor
	public MyCalendar() {
		calendar = new GregorianCalendar();
	}
	
	// Parametizirani konstruktor
	public MyCalendar(int year, int month, int day) {
		this.year = year;
		this.month = month + 1;
		this.day = day;
		calendar = new GregorianCalendar(year, month, 1);
	}
	
	// Accessor method_i za year...
	public int getYear() {
		
		return year;
	}
	// ... month...
	public int getMonth() {
		
		return month;
	}
	// ... i day
	public int getDay() {
	
	return day;
}
	
	// Method ispisuje mjesecni kalendar
	public void displayCalendar() {

		displayHeader();
		displayBody();
	}
	
	// Method "pravi header za kalendar"
	private void displayHeader() {
		
		System.out.println();
		String mon = "";

		switch(month) {
			case 1: mon = "January"; break;
			case 2: mon = "February"; break;
			case 3: mon = "March"; break;
			case 4: mon = "April"; break;
			case 5: mon = "May"; break;
			case 6: mon = "Jun"; break;
			case 7: mon = "July"; break;
			case 8: mon = "August"; break;
			case 9: mon = "September"; break;
			case 10: mon = "October"; break;
			case 11: mon = "November"; break;
			case 12: mon = "December"; 
		}
		
		System.out.printf("%23s%5d\n", mon, year);
		System.out.println("   ---------------------------------------");
		System.out.printf("%6s%6s%6s%6s%6s%6s%6s\n",
				"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
	}
	
	// Method ispisuje body kalendara
	private void displayBody() {
	
		// Trenutni dan u sedmici 1-7 (sun-sat)
		int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		
		// Ukupan broj dana u mjesecu
		int totalDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		// Ispis praznih polja, prije prvog dana u mjesecu
		for (int i=1; i < weekDay; i++) System.out.printf("%6s", " ");
		
		// Numericki ispis dana u mjesecu 1-totalDays
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
