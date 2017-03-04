package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		displayMersennePrimes();
	}
	
	/**
	 * Method ispisuje mersenne primes
	 */
	public static void displayMersennePrimes() {
		
		BigInteger mp;
		BigInteger n = new BigInteger("2");
		
		System.out.println("p       p^2 - 1");
		System.out.println();
		
		for (int i=2; i <= 10; i++) {
			
			mp = n.pow(i).subtract(BigInteger.ONE);
			if(Zadatak_03.isPrime(mp)) {
				System.out.print(i + "           ");
				System.out.println(mp);
			}
				
		}
	}

}
