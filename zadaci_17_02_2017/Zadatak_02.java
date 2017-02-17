package zadaci_17_02_2017;

public class Zadatak_02 {

	public static void main(String[] args) {

		displayTwinPrimes();
	}
	
	/**
	 * Method provjerava da li je proslijedjeni broj prost
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		
		for (int i=2; i <= n/2; i++) {
			
			if (n % i == 0) return false;
		}
		return true;
	}
	
	/**
	 * Method printa sve twin primes
	 */
	public static void displayTwinPrimes() {
		
		int counter = 0;
		
		System.out.println("Twin primes brojevi do broja 10000 su:\n");
		for (int i=2; i <= 10_000; i++) {
			if (isPrime(i) && isPrime(i+2)) {
				counter++;
				if (counter % 10 == 0) System.out.printf("%-14s\n", "(" + i + ", " + (i+2) + ")");
				else System.out.printf("%-14s", "(" + i + ", " + (i+2) + "), ");
			}
		}
	}
}
