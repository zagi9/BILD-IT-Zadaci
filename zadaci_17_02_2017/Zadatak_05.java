package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite prvi string: ");
		String s1 = sc.nextLine();
		
		System.out.print("Unesite drugi string: ");
		String s2 = sc.nextLine();
		
		if (isSubstring(s1, s2)) 
			System.out.println(s2 + " je substring stringa " + s1);
		else
			System.out.println(s2 + " nije substring stringa " + s1);

		sc.close();
	}
	
	/**
	 * Method prihvata dva stringa kao argumente i provjerava da li je drugi
	 * substring prvog i vraca boolean
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isSubstring(String s1, String s2) {
		
		return s1.contains(new StringBuilder(s2));
	}

}
