package zadaci_11_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		System.out.print("Unesite cijeli broj: ");
		int n = checkInput();
		
		printFactors(n);
	}
	
	/*
	 * Method ispisuje faktore broja (argument n) u rastucem redosljedu
	 */
	public static void printFactors(int n) {
		
		// U slucaje da je unesen broj 1
		if (n == 1) {
			System.out.println("Faktor broja 1 je " + 1);
			return;
		}
		
		// Kontrolna varijabla, kojom kroz petlju provjeravamo djeljivost broja
		// i inkrementiramo je kad prestaje biti djeljiva sa unesenim brojem
		int i = 2;
		int num = Math.abs(n);
		
		System.out.print("Najmanji faktori broja " + n + " u rasucem poretku su: ");
		while (i <= num) {
			if (num % i == 0) {
				System.out.print(i + " ");
				num /= i;
			}
			else i++;
		}
	}
	public static int checkInput() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean isException = true;
		
		do {
			try {
				num =sc.nextInt();
				isException = false;
			} catch (InputMismatchException ime) {
				System.out.print("Unos mora biti cijeli broj ponovite unos: ");
				sc.nextLine();
			}
		} while (isException);
		
		return num;
	}

}
