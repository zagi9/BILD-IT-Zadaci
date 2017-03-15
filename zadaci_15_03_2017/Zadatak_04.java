package zadaci_15_03_2017;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		GeometricObject[] arr = {new Circle(5), new Circle(6), 
				new Rectangle(3, 4), new Rectangle(5, 6)};
		
		System.out.println("Zbir povrsina geometrijskih objekata niza je : "
				+ sumArea(arr));
	}
	
	/**
	 * Metod sabira povrsine GeometricObject
	 * @param a
	 * @return
	 */
	public static double sumArea(GeometricObject[] a) {
		
		double sum = 0;
		for (int i=0; i < a.length; i++) 
			sum += a[i].getArea();
		
		return sum;
		
	}

}
