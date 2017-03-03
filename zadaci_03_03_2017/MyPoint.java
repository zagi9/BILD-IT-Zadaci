package zadaci_03_03_2017;

public class MyPoint {

	private double x;
	private double y;
	
	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	/**
	 * Method izracunava razdaljinu izmedju proslijedjenog objekta MyPoint
	 * i this.MyPoint
	 * @param point
	 * @return
	 */
	public double distance(MyPoint point) {
		
		return distance(point.getX(), point.getY());
	}
	
	/**
	 * Method izracunava razdaljinu izmedju tacke odredjene sa (x, y) i 
	 * this.MyPoint
	 * @param x
	 * @param y
	 * @return
	 */
	public double distance(double x, double y) {
		
		return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow(this.y - y, 2));
	}
}
