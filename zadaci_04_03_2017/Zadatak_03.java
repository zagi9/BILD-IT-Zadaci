package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		BigInteger n = new BigInteger(Long.toString(Long.MAX_VALUE));
		
		dispalayPrimes(n);
		
	}
	
	/**
	 * Method ispisuje 5 BigInteger primes vecih od n 
	 * @param n
	 */
	public static void dispalayPrimes(BigInteger n) {
		
		int count = 0;
		while(count < 5) {
			
			n = n.add(BigInteger.ONE);
			
			if (isPrime(n)) {
				System.out.println(n);
				count++;
			}
		}
	}
	
	/**
	 * Method provjerava da li je BigInteger prime
	 * @param n
	 * @return
	 */
	public static boolean isPrime(BigInteger n) {
		
		BigInteger i = new BigInteger("2");
		
		for ( ; i.compareTo(n.divide(new BigInteger("2"))) <= 0; i = i.add(BigInteger.ONE)) {
			
			if (n.remainder(i).equals(BigInteger.ZERO)) return false;
			
		}
		return true;
	}

}
