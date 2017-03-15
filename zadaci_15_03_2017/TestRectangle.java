package zadaci_15_03_2017;

public class TestRectangle {
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(4, 5);
		Rectangle r3 = new Rectangle(2, 6);
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
	}

}
