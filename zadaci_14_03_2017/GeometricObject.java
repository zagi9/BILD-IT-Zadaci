package zadaci_14_03_2017;

public abstract class GeometricObject 
	implements Comparable<GeometricObject>, Colorable {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	/**
	 * Method vraca veci od dva GeometricObject
	 * @param o
	 * @param t
	 * @return
	 */
	public static GeometricObject max(GeometricObject o, GeometricObject t) {
		if (o.compareTo(t) > 1) return o;
		else return t;
	}
	
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
			" and filled: " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public abstract void howToColor();
}
