package zadaci_24_02_2017;

import utils.Helper;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Unesite cijeli broj: ");
		int n = help.checkIntInput();
		
		System.out.print("Unesite zeljenu duzinu broja: ");
		int length;
		boolean isCorrect = false;
		
		do {
			length = help.checkIntInput();
			if (length >= 0) isCorrect = true;
			else {
				System.out.println("Format mora biti pozitivan cijeli broj ili 0");
				System.out.print("Ponovite unos: ");
			}
		}while(!isCorrect);
		
		System.out.print("Formatiran broj: ");
		System.out.println(format(n, length));
	}
	
	/**
	 * Method prihvata argumente number i width, i vraca, kao String, number 
	 * formatiran na broj cifri vrijednosti width dodajuci 0 ispred broja
	 * @param number
	 * @param width
	 * @return
	 */
	public static String format(int number, int width) {
		
		int n = Math.abs(number);
		String s = n + "";
		int stringLength = s.length();
		
		if (stringLength >= width) return s;
		
		for (int i=0; i < width - stringLength; i++)
			s = 0 + s;
		
		if (number < 0) return '-' + s;
		
		return s;
		
	}

}
