
package zadaci_20_02_2017;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		
		displayPrimes(0, 100_000);

	}
	
	/**
	 * Mthod provjerava da li je proslijedjeni broj prost. Ukoliko jeste vraca ga.
	 * A ako nije vraca 0 
	 * @param n
	 * @return
	 */
	public static int isPrime(int n) {
		
		for (int i=2; i <= n/2; i++) 
			if (n % i == 0) return 0;
		
		return n;
	}
	
	/*
	 * Method prihvaca dva cijela broja i ispisuje sve proste brojeve u to rasponu
	 */
	public static void displayPrimes(int n1, int n2) {
		
		if (n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		int counter = 0;
		System.out.println("Prosti brojevi od " + n1 + " do " + n2 + " su:\n");
		for (int i=n1; i <= n2; i++) {
			
			if (isPrime(i) == 1) continue;
			
			if (isPrime(i) != 0) {
				counter++;
				if (counter % 10 == 0) System.out.println(isPrime(i));
				else System.out.print(isPrime(i) + " ");
			}
		}
	}
}

