package zadaci_14_03_2017;

public class TestGeometricObject {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(7);
		
		Rectangle r1 = new Rectangle(2, 3);
		Rectangle r2 = new Rectangle(3, 4);
		
		GeometricObject largerCircle = GeometricObject.max(c1, c2);
		GeometricObject largerRectangle = GeometricObject.max(r1, r2);
		
		System.out.println(largerCircle.getArea());
		System.out.println(largerRectangle.getArea());

	}

}
