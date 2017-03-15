package zadaci_15_03_2017;

public class Octagon extends GeometricObject 
	implements Comparable<Octagon>, Cloneable{

	private double side;
	
	public Octagon() {
		side = 1;
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public Octagon(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}
	
	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea()) return 1;
		if (getArea() < o.getArea()) return -1;
		return 0;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
