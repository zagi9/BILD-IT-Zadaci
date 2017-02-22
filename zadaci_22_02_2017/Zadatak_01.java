package zadaci_22_02_2017;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		int num = (int)(1 + Math.random() * (12));
		displayMonth(num);
		
	}
	
	/**
	 * Method, na osnovu proslijedjenog broja ispisuje odgovarajuci mjesec
	 * @param month
	 */
	public static void displayMonth(int month) {
		
		String s = "";
			
		String[] months = {"Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul",
				"Avgust", "Septembar", "Oktobar", "Novembar", "Decembar"};
			
		s = months[month-1];
			
		System.out.println(s);
	}
}
