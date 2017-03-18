package zadaci_18_03_2017;

import java.util.Scanner;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String value = sc.nextLine();
		reverseDisplay(value);
		sc.close();
	}
	
	public static void reverseDisplay(String value) {
		
		if (value.length() == 0) return;
		System.out.print(value.charAt(value.length() - 1));
		reverseDisplay(value.substring(0, value.length() - 1));
	}

}
