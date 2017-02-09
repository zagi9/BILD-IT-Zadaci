package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite prvi broj: ");
		int n1 = sc.nextInt();
		
		System.out.print("Unesite drugi broj: ");
		int n2 = sc.nextInt();
		
		System.out.println("Najveci zajednicki djelilac brojeva " + n1 + " i "
				+ n2 + " je " + lcd(n1, n2));
		
		sc.close();
	}
	
	/*
	 * Method pronalazi najmanji zajednicki djelilac dva cijela broja
	 */

	public static int lcd(int num1, int num2) {
	
		// Uzimam apsolutne vrijednosti u slucaju negativnog unosa
		num1 = Math.abs(num1);
		num2 = Math.abs(num2);
		
		// n je manji od dva broja, koji ce biti startna vrijednost za provjeravanje
		// djeljivosti
		int n = num1 < num2 ? num1 : num2;
		
		for (int i=n; i > 1; i--) 
			if (num1 % i == 0 && num2 % i == 0) return i;
		return 1;
		
	}
}
