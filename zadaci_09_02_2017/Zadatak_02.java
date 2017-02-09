package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak_02 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Koliko pitanja zelite: ");
		int num = sc.nextInt();
		test(num);
	}

	/*
	 * Method kroz petlju, koja ima iteracija u zavisnosti od korisnikovog unosa (n),
	 * generise dva cijela broja, ispisuje korisniku da unese razliku, provjerava i
	 * inkrementira tacne ili netacne odgovore i ispisuje broj tacnih i netacnih.
	 */
	public static void test(int n) {
		
		int correct = 0;
		int wrong = 0;
		
		for (int i=0; i < n; i++) {

			int num1 = (int)(Math.random() * 10);
			int num2 = (int)(Math.random() * 10);
			
			System.out.println();
			System.out.print("Koliko je " + num1 + " - " + num2 + ": ");
			int answer = sc.nextInt();
			
			if (answer == num1 - num2) {
				System.out.print("Odgovor je tacan");
				correct++;
			}
			else {
				System.out.print("Tacan odgovor je " + (num1 - num2));
				wrong++;
			}
		}
		System.out.println();
		System.out.println("Imate " + correct + " tacnih odgovora");
		System.out.println("Imate " + wrong + " pogresnih odgovora");

	}
}	
