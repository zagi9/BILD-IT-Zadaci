package zadaci_20_02_2017;

public class Zadatak_01 {
	public static void main(String[] args) {
	
		System.out.println("Nasumicno generisana tablica: " + generatePlate());
	}
	
	/**
	 * Method nasumicno generise tri velika slova i cetiri cifre, razdvojene '-'
	 * i vraca kao String
	 * 
	 * @return
	 */
	public static String generatePlate() {
		
		String s = "";
		
		for (int i=0; i < 3; i++)
			s += generateLetter();
		
		s += '-';
		
		for (int i=0; i < 4; i++)
			s += generateDigit();
		
		return s;
	}
	
	/**
	 * Method, nasumicno, generise i vraca veliko slovo 
	 * @return
	 */
	public static char generateLetter() {
		
		return (char)((int)('A' + Math.random() * ('Z' - 'A' + 1)));
	}
	
	/**
	 * Method, nasumicno, generise i vraca cifru  
	 * @return
	 */
	public static int generateDigit() {
		
		return (int)(Math.random() * 10);
	}

}
