package zadaci_16_03_2017;

import java.math.BigInteger;

public class BigRational extends Number implements Comparable<BigRational> {
	// Data fields for numerator and denominator
	private BigInteger[] r = new BigInteger[2]; 

	/** Construct a rational with default properties */
	public BigRational() {
		this.r[0] = new BigInteger("0");
		this.r[1] = new BigInteger("1");
	}
	
	public BigRational(BigInteger n) {
		r[0] = n;
		r[1] = BigInteger.ONE;
	}

	/** Construct a rational with specified numerator and denominator */
	public BigRational(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		this.r[0] = (denominator.compareTo(BigInteger.ZERO) > 0) ? 
				BigInteger.ONE : new BigInteger("-1").multiply(numerator.divide(gcd));
		this.r[1] = denominator.abs().divide(gcd);
	}

	/** Find GCD of two numbers */
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = new BigInteger("1");
		
		BigInteger k = new BigInteger("1");

		for ( ; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k.add(new BigInteger("1"))) {
			if (n1.remainder(k).equals(new BigInteger("0")) && 
					n2.remainder(k).equals(new BigInteger("0")))
				gcd = k;
		}

		return gcd;
	}

	/** Return numerator */
	public BigInteger getNumerator() {
		return r[0];
	}
		
	/** Return denominator */
	public BigInteger getDenominator() {
		return r[1];
	}
	
	/** Add a rational number to this rational */
	public BigRational add(BigRational secondRational) {
		BigInteger n = r[0].multiply(secondRational.getDenominator()).add(r[1].multiply(secondRational.getNumerator()));
		BigInteger d = r[1].multiply(secondRational.getDenominator());
		return new BigRational(n, d);
	}
	
	/** Subtract a rational number from this rational */
	public BigRational subtract(BigRational secondRational) {
		BigInteger n = r[0].multiply(secondRational.getDenominator()).divide(r[1].multiply(secondRational.getNumerator()));
		BigInteger d = r[1].multiply(secondRational.getDenominator());
		return new BigRational(n, d);
	}
	
	/** Multiply a rational number by this rational */
	public BigRational multiply(BigRational secondRational) {
		BigInteger n = r[0].multiply(secondRational.getNumerator());
		BigInteger d = r[1].multiply(secondRational.getDenominator());
		return new BigRational(n, d);
	}
	
	/** Divide a rational number by this rational */
	public BigRational divide(BigRational secondRational) {
		BigInteger n = r[0].multiply(secondRational.getDenominator());
		BigInteger d = r[1].multiply(secondRational.r[0]);
		return new BigRational(n, d);
	}
	
	@Override
	public String toString() {
		if (r[1].equals(BigInteger.ONE))
			return r[0] + "";
		else
			return r[0] + "/" + r[1];
	}
	
	@Override // Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((BigRational)(other))).getNumerator().equals(BigInteger.ZERO))
			return true;
		else	
			return false;
	}
	
	@Override // Implement the abstract intValue method in Number
	public int intValue() {	
		return (int)doubleValue();
	}
		
	@Override // Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float)doubleValue();
	}
		
	@Override // Implement the doubleValue method in Number
	public double doubleValue() {
		return r[0].divide(r[1]).doubleValue();
	}
		
	@Override // Implement the abstract longValue method in Number
	public long longValue() {
		return (long)doubleValue();
	}
	
	@Override // Implement the compareTo method in Comparable
	public int compareTo(BigRational o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
			return -1;
		else
			return 0;
	}	
}
