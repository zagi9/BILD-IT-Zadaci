package zadaci_16_03_2017;

import java.math.BigInteger;

public class TestBigRational {
	public static void main(String[] args) {
		
		BigRational r1 = new BigRational(new BigInteger("1"), new BigInteger("123456789"));
		BigRational r2 = new BigRational(new BigInteger("1"), new BigInteger("123456789"));
		BigRational r3 = new BigRational(new BigInteger("1"), new BigInteger("123456789"));
		
		System.out.println("r1 * r2 * r3 is " + 
				r1.multiply(r2.multiply(r3)));
	}

}
