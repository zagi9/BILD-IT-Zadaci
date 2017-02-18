package zadaci_18_02_2017;

public class Zadatak_02 {
	
	public static void main(String[] args) {
		
		displayPrimes(2, 1000);
	}
	
	/**
	 * Method prihvata broj i provjerava da li je prost
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		
		for (int i=2; i <= n/2; i++) 
			if (n % i == 0) return false;
		
		return true;
	}
	
	/**
	 * Method ispisuje sve proste brojeve u rasponu (first-last)
	 * @param first
	 * @param last
	 */
	public static void displayPrimes(int first, int last) {
		
		if (first > last) {
			int temp = first;
			first = last;
			last = temp;
		}
		
		System.out.println("Prosti brojevi od " + first + " do " + last + ":\n");
		int counter = 0;
		for (int i=first; i <= last; i++) {
			if (isPrime(i)) {
				counter++;
				if (counter % 8 == 0) System.out.println(i);
				else System.out.print(i + " ");
			}
		}
	}
}
