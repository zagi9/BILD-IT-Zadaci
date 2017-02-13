package zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite prvi string");
		String s1 = sc.nextLine();
		
		System.out.println("Unesite drugi string");
		String s2 = sc.nextLine();
		
		System.out.println("Najveci zajednicki prefiks je " + commonPrefix(s1, s2));
		
		sc.close();

	}
	
	/**
	 * Method uporedjuje dva string i, ukoliko imaju zajednicki prefix, vracaju ga
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String commonPrefix(String s1, String s2) {
		
		String s = "";
		if (s1.charAt(0) != s2.charAt(0)) {
			System.out.println("Stringovi nemaju zajednickih prefiksa");
			System.exit(0);
		}
		
		// Trazim kraci string cija ce duzina biti krajnja vrijednost pri uporedjivanju
		int len = s1.length() < s2.length() ? s1.length() : s2.length();  
		
		for (int i=0; i < len; i++) {
		
			if (s1.charAt(i) == s2.charAt(i)) 
				s += s1.charAt(i);
			else return s;
		}
		
		return s;
	}

}

