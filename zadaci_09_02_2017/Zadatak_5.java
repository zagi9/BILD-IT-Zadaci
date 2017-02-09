package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Koliko puta zelite baciti novcic: ");
		int n = sc.nextInt();
		coinToss(n);
		sc.close();
	}
	
	/*
	 * Method simulira bacanje novcica, tako da nasumicno bira 0 ili 1 i inkrementira
	 * vrijednosti heads ukoliko je 0 a tails u suprotnom slucaju. Argument n je broj
	 * "bacanja" novcica.
	 * I na kraju ispisuje koliko puta je okrenuta glava a koliko pismo
	 */
	public static void coinToss(int n) {
		// Inicijalne vrijednosti
		int heads = 0;
		int tails = 0;
		for (int i=0; i < n; i++) {
			// Provjera nasumicnog broja i uvecavanje heads ili tails
			if ((int)(Math.random() * 2) == 0) heads++;
			else tails++;
		}
		System.out.println("Novcic je " + heads + " puta pokazao glavu a " +
				tails + " puta, pismo.");
	}

}
