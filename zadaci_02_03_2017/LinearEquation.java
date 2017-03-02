package zadaci_02_03_2017;

/**
 * Klasa izracunava linearnu jednadzbu
 * @author Milan
 *
 */
public class LinearEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation(double a, double b, double c, 
			double d, double e, double f) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	/**
	 * Method provjerava da li jednadzba ima rjesenje
	 * @return
	 */
	public boolean isSolvable() {
		return a * d - b * c != 0;
	}
	
	/**
	 * Method izracunava x
	 * @return
	 */
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}
	
	/**
	 * Method izracunava y
	 * @return
	 */
	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}
