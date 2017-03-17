package zadaci_16_03_2017;

public class Complex implements Cloneable {

	private double a;
	private double b;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public Complex(double a) {
		this.a = a;
	}
	
	public Complex() {
		
	}
	
	public double getRealPart() {
		return a;
	}
	
	public double getImaginaryPart() {
		return b;
	}
	
	/**
	 * Sabiranje kompleksnih brojeva
	 * @param c
	 * @return
	 */
	public Complex add(Complex c) {
	
		double resA = getRealPart() + c.getRealPart();
		double resB = getImaginaryPart() + c.getImaginaryPart();
		return new Complex(resA, resB);
	}
	
	/**
	 * Oduzimanje
	 * @param c
	 * @return
	 */
	public Complex subtract(Complex c) {
		
		double resA = getRealPart() - c.getRealPart();
		double resB = getImaginaryPart() - c.getImaginaryPart();
		return new Complex(resA, resB);
	}
	
	/**
	 * Mnozenje
	 * @param c
	 * @return
	 */
	public Complex multiply(Complex c) {
		
		double resA = getRealPart() * c.getRealPart() - 
				getImaginaryPart() * c.getImaginaryPart();
		double resB = getImaginaryPart() * c.getRealPart() +
				getRealPart() * c.getImaginaryPart();
		return new Complex(resA, resB);
	}
	
	/**
	 * Dijeljenje
	 * @param c
	 * @return
	 */
	public Complex divide(Complex c) {
		
		double resA = (getRealPart() * c.getRealPart() + 
				getImaginaryPart() * c.getImaginaryPart()) /
				(Math.pow(c.getRealPart(), 2) + Math.pow(c.getImaginaryPart(), 2));
		double resB = (getImaginaryPart() * c.getRealPart() - 
				getRealPart() * c.getImaginaryPart()) / 
				(Math.pow(c.getRealPart(), 2) + Math.pow(c.getImaginaryPart(), 2));
		return new Complex(resA, resB);
	}
	
	/**
	 * Apsolutna vrijednost
	 * @return
	 */
	public double abs() {
		
		return Math.sqrt(Math.pow(getRealPart(), 2) + 
				Math.pow(getImaginaryPart(), 2));
	}
	
	public String toString() {
		if (b == 0) return "" + a;
		return a + " + " + b + "i";
	}
	
	public Object clone() {
		
		try {
			return super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}

