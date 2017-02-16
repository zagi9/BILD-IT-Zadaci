package zadaci_16_02_2017;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		System.out.println(convertMillis(100_000));
	}
	
	/**
	 * Method, kao argument prihvata, milisekunde, pretvara ih u sate, minute
	 * i sekunde i vraca kao String
	 * @param millis
	 * @return
	 */
	public static String convertMillis(long millis) {
		
		long hours = millis / (60 * 60 * 1000);
		millis %= 60 * 60 * 1000;
		int minutes = (int) (millis / (60 * 1000));
		millis %= 60 * 1000;
		int seconds = (int) (millis / 1000);
		
		return hours + ":" + minutes + ":" + seconds;
	}

}
