package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		long first = (long)Math.sqrt(Long.MAX_VALUE);
		String s = Long.toString(first);
		BigInteger n = new BigInteger(s);
	
		squareNumbers(n);
		
	}
	
	/**
	 * Method izracunava i ispisuje kvadratne brojeve vece od Long.MAX_VALUE
	 * @param n
	 */
	public static void squareNumbers(BigInteger n) {
		
		for (int i=0; i < 10; i++) {
			
			n = n.add(BigInteger.ONE);
			System.out.println(n.pow(2));
		}	
	}
}
