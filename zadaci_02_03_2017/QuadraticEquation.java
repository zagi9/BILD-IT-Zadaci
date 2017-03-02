package zadaci_02_03_2017;

/**
 * Klasa izracunava kvadratnu jednadzbu 
 * @author Milan
 *
 */
public class QuadraticEquation {

	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
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
	
	/**
	 * Method izracunava i vraca diskriminantu kvadratne jednadzbe
	 * @return
	 */
	public double getDiscriminant() {
		return b * b - 4 * a * c;
	}
	
	/**
	 * Method izracunava i vraca prvi korijen jednadzbe
	 * @return
	 */
	public double getRoot1() {
		
		if(getDiscriminant() < 0) return 0;
		
		return (-b + Math.sqrt(getDiscriminant())) / (2 * a); 
	}
	
	/**
	 * Method izracunava i vraca drugi korijen jednadzbe
	 * @return
	 */
	public double getRoot2() {
		
		if(getDiscriminant() < 0) return 0;
		
		return (-b - Math.sqrt(getDiscriminant())) / (2 * a); 
	}
}
