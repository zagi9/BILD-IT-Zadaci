package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = "";
		
		do {
			System.out.print("Unesite 9_cifreni broj (za izracunavanje ISBN-10): ");
			s = sc.next();
		} while (!isValid(s));
		
		System.out.print("ISBN-10 broj je ");
		displayChecksum(s);
		
		sc.close();
		
	}
	
	// Method izracunava checksum i ispisuje cijeli ISBN-10 broj 
	public static void displayChecksum(String s) {
		
		int sum = 0;
		
		for (int i=1; i <= s.length(); i++) {
			
			// Unos je string pa sve karaktere transformisemo u cijele brojeve
			int n = (s.charAt(i-1) - '0') * i;
			sum += n;
		}
		if (sum % 11 == 10) System.out.println(s + "X");
		else System.out.println(s + (sum % 11));
	}
	
	// Method provjerav validnost unosa
	public static boolean isValid(String s) {
		
		// Provjera da li je unos tacno devet karakter
		if (s.length() != 9) {
			System.out.println("Pogresan unos, unesite 9 cifreni broj");
			return false;
		}
		
		// provjera da li je unos numericki
		if (!isNumeric(s)) {
			System.out.println("Unos nije numericki");
			return false;
		}
		return true;
	}
	
	// Method provjerav da li je unos numericki
	public static boolean isNumeric(String s) {
		
		for (int i=0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)))
				return false;
		}
		return true;
	}

}
