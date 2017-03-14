package zadaci_14_03_2017;

public class TestColorable {
	public static void main(String[] args) {
		
		GeometricObject[] go = {new Circle(5), new Square(6), new Rectangle(2, 3),
				new Rectangle(4, 5), new Square(12)};
		
		for (int i=0; i < go.length; i++) {
			
			System.out.println("Povrsina elementa: " + go[i].getArea());
			go[i].howToColor();
			System.out.println();
		}
			
		
	}

}
