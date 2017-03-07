package zadaci_07_03_2017;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class MyDate {

	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		
		GregorianCalendar gc = new GregorianCalendar();
		year = gc.get(Calendar.YEAR);
		month = gc.get(Calendar.MONTH) + 1;
		day = gc.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(long millis) {
		
		Date date = new Date(millis);
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		year = gc.get(Calendar.YEAR);
		month = gc.get(Calendar.MONTH) + 1;
		day = gc.get(Calendar.DAY_OF_MONTH);
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public MyDate setDate(long elapsedTime) {
		
		return new MyDate(elapsedTime);
	}
}
