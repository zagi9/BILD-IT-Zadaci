package zadaci_02_03_2017;

public class TestRegularPolygon {
	public static void main(String[] args) {
		
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Obim prvog poligona je " + polygon1.getPerimeter());
		System.out.println("Povrsina prvog poligona je " + polygon1.getArea());
		System.out.println();
		System.out.println("Obim drugog poligona je " + polygon2.getPerimeter());
		System.out.println("Povrsina drugog poligona je " + polygon2.getArea());
		System.out.println();
		System.out.println("Obim treceg poligona je " + polygon3.getPerimeter());
		System.out.println("Povrsina treceg poligona je " + polygon3.getArea());
	}

}
