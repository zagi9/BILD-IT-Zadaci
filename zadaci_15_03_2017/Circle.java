package zadaci_15_03_2017;


public class Circle extends GeometricObject 
	implements Comparable<Circle> {
	
	private double radius;
	
	public Circle() {
	}
		
	public Circle(double radius) {	
		this.radius = radius;
	}
	
	
	public Circle(double radius,
			String color, boolean filled) {
		this.radius = radius;
	setColor(color);
	setFilled(filled);
	
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Metod izracunava povrsinu
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * Metod izracunava precnil
	 * @return
	 */
	public double getDiameter() {
		return 2 * radius;
	}
	
	/**
	 * Metod izracunava obim
	 */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	/**
	 * Overiding howToColor() metod
	 */
	public void howToColor() {
		System.out.println("Color the rim");
	}
	
	/**
	 * Circle info
	 */
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() +
			" and the radius is " + radius);
	}

	@Override
	public int compareTo(Circle c) {
		
		if (radius > c.getRadius()) return 1;
		else if (getRadius() < c.getRadius()) return -1;
		else return 0;
	}
	
	@Override
	public boolean equals(Object o) {
		return this.compareTo((Circle)o) == 0;
	}
}
