package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		String s = sc.nextLine();
		
		System.out.println("Karakteri na neparnim pozicijama unesenog stringa su:");
		printOddChars(s);
		
		sc.close();

	}
	
	/**
	 * Method prihvata string kao argument i ispisuje karaktere na neparnim 
	 * pozicijama u stringu
	 * @param s
	 */
	public static void printOddChars(String s) {
		for (int i=0; i < s.length(); i++) 
			if (i % 2 == 0) System.out.print(s.charAt(i));
	}

}
