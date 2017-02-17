package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		String s = sc.nextLine();
		
		System.out.print("Unesite karakter: ");
		boolean isCorrect = false;
		char ch = ' ';
		do {
			String str = sc.nextLine();
			if (str.length() != 1) System.out.println("Unesite jedan karakter");
			else {
				ch = str.charAt(0);
				isCorrect = true;
			}
		} while(!isCorrect);
		
		System.out.println("U stringu " + s + " ima " + count(s, ch) + " karaktera "
				+ ch);
		
		sc.close();
	
		
	}
	
	/**
	 * Method prebrojava sve karaktere proslijedjenog stringa str i vraca kao broj 
	 * @param str
	 * @param a
	 * @return
	 */
	public static int count(String str, char a) {
		
		int counter = 0;
		for (int i=0; i < str.length(); i++)
			if (str.charAt(i) == a) counter++;
		
		return counter;
	}

}
