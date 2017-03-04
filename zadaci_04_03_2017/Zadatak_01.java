package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		BigInteger n = BigInteger.TEN;
		n = n.pow(49);
		
		displayDivisible(n);
	}
	
	/**
	 * Method ispisuje prvih 10 brojeva sa 50 decimalnih cifri djeljivih sa 2 ili 3
	 * @param n
	 */
	public static void displayDivisible(BigInteger n) {
		
		int counter = 0;
		
		while(counter < 10) {
			
			if(n.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
			   n.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
				
				System.out.println(n);
				counter++;
			}
			
			n = n.add(BigInteger.ONE);	
		}	
	}
}
