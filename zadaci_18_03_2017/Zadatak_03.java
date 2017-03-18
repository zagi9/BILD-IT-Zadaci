package zadaci_18_03_2017;

import java.util.Scanner;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String str = sc.nextLine();
		System.out.print("Unesite karakter: ");
		char ch = sc.next().charAt(0);
		System.out.print("Karakter " + ch + " ponavlja se ");
		System.out.println(count(str, ch) + " puta");
		sc.close();
	}
	
	/**
	 * Metod vraca broj karaktera u stringu
	 * @param str
	 * @param a
	 * @return
	 */
	public static int count(String str, char a) {
		
		int counter = 0;

		if (str.length() == 0) return counter;

		if (str.charAt(str.length() -1) == a)
			return count((str.substring(0, str.length() - 1)), a) + 1;
		else
			return count((str.substring(0, str.length() - 1)), a);
	}

}
