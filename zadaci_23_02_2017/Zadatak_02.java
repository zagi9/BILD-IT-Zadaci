package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		String s = sc.nextLine();
		
		displayString(s);
		
		sc.close();
	}
	
	/**
	 * Method broji karaktere proslijedjenog stringa, trazi prvo slovo i ispisuje 
	 * rezultat
	 * @param s
	 */
	public static void displayString(String s) {
		
		int length = s.length();
		char firstLetter = '0';
		for (int i=0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) { 
				firstLetter = s.charAt(i);
				break;
			}	
		}
		
		System.out.println("String ima " + length + " karaktera");
		if (Character.isLetter(firstLetter))
			System.out.println("Prvo slovo stringa je " + firstLetter);
		else
			System.out.println("String nema slova");
	}

}
