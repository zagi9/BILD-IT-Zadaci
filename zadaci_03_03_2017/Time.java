package zadaci_03_03_2017;

// import java.util.GregorianCalendar;
// import java.util.Calendar;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	/**
	 * Konstruktor inicijalizira objekat na trenutno vrijeme
	 */
	public Time() {
		
		setTime(System.currentTimeMillis());
/*		
		Calendar gc = new GregorianCalendar();
		hour = gc.get(Calendar.HOUR_OF_DAY);
		minute = gc.get(Calendar.MINUTE);
		second = gc.get(Calendar.SECOND);
*/		
	}
	
	/**
	 * Konstruktor inicijalizira objekat na vrijeme u zavisnosti od proslijedjene
	 * varijable millis
	 * @param millis
	 */
	public Time(long millis) {
		
		setTime(millis);
/*		Calendar gc = new GregorianCalendar();
		gc.setTimeInMillis(millis);
		hour = gc.get(Calendar.HOUR_OF_DAY);
		minute = gc.get(Calendar.MINUTE);
		second = gc.get(Calendar.SECOND);
*/		
	}
	
	/**
	 * Konstruktor inicijalizira default_no vrijeme
	 * @param hour
	 * @param minute
	 * @param second
	 */
	public Time(int hour, int minute, int second) {
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	/**
	 * Method izracunava vrijeme u zavisnosti od proslijedjene elapsedTime
	 * varijable 
	 * @param elapsedTime
	 */
	private void setTime(long elapsedTime) {
		
		int totalHours = (int)(elapsedTime / (60 * 60 * 1000));
		hour = (totalHours+1) % 24;
		elapsedTime %= 60 * 60 * 1000;
		int totalMinutes = (int)(elapsedTime / (60 * 1000));
		minute = totalMinutes % 60;
		elapsedTime %= 60 * 1000;
		int totalSeconds = (int)(elapsedTime / 1000);
		second = totalSeconds % 60;
		
		
		
	}
	
	
}
