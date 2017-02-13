package zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak_05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite string");
		String s = sc.nextLine();
		System.out.println("Uneseni string ima " + countLetters(s) + " slova");
		sc.close();
	}
	
	/**
	 * Method prebrojava broj slova u stringu i vraca kao cijeli broj
	 * @param s
	 * @return
	 */
	public static int countLetters(String s) {
		int count = 0;
		
		for (int i=0; i < s.length(); i++)
			if (Character.isLetter(s.charAt(i))) count++;
		
		return count;		
	}

}

