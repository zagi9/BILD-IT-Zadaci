package zadaci_11_02_2017;

import java.util.Scanner;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite cijeli broj: ");
		int n = sc.nextInt();
		
		printFactors(n);
		
		sc.close();
	}
	
	/*
	 * Method ispisuje faktore broja (argument n) u rastucem redosljedu
	 */
	public static void printFactors(int n) {
		
		// U slucaje da je unesen broj 1
		if (n == 1) {
			System.out.println(1);
			return;
		}
		
		// Kontrolna varijabla, kojom kroz petlju provjeravamo djeljivost broja
		// i inkrementiramo je kad prestaje biti djeljiva sa unesenim brojem
		int i = 2; 
		
		System.out.print("Najmanji faktori broja " + n + " u rasucem poretku su: ");
		while (i <= n) {
			if (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
			else i++;
		}
	}

}
