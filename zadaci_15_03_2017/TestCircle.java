package zadaci_15_03_2017;

public class TestCircle {
	public static void main(String[] args) {
		
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(3);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}

}
