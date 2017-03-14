package zadaci_14_03_2017;

public class Square extends GeometricObject implements Colorable {

	private double side;
	
	public Square() {
		side = 1;
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}
	
	public double getArea() {
		return side * side;
	}
	
	public double getPerimeter() {
		return 4 * side;
	}
	
	public void howToColor() {
		System.out.println("Color all four sides");
	}
	
	public int compareTo(GeometricObject o) {
		if (getArea() > o.getArea()) return 1;
		if (getArea() < o.getArea()) return -1;
		return 0;
	}
}
