package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite SSD u formatu DDD-DD-DDDD(D su cifre): ");
		
		String s;
		boolean isCorrect = false;
		do {
			s = sc.nextLine();
			if (isCorrectSSD(s)) isCorrect = true;
			else System.out.print("Unos nije validan, pokusajte ponovo: ");
		} while (!isCorrect);
		
		System.out.println("Unos je prihvacen");
		
		sc.close();

	}
	
	/**
	 * Method provjerava proslijedjeni string, da li je pravilno formatiran
	 * kao SSD (DDD-DD-DDDD) i vraca boolean
	 * @param s
	 * @return
	 */
	public static boolean isCorrectSSD(String s) {
		
		if (s.length() != 11) return false;
		if (s.charAt(3) != '-' || s.charAt(6) != '-') return false;
		
		for (int i=0; i < s.length(); i++) 
			if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != '-')
				return false;
		
		return true;
	}

}
