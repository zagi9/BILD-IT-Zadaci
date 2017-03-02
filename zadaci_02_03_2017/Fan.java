package zadaci_02_03_2017;

/**
 * Klasa definise Fan objekat sa tri konstantne vrijednosti(SLOW, MEDIUM, FAST), 
 * no-arg konstruktor, koji dodjeljuje defaultne vrijednosti data field_ima,
 * accessor i mutator methode i overridden toString() method
 * @author Milan
 *
 */
public class Fan {
	
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color = "";
	
	public Fan() {
		
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		
		if(on)
			return "[speed: " + getSpeed() + ", color: " + getColor() + 
					", radius: " + getRadius() + "]";
		
		else
			return "[speed: " + getSpeed() + ", color: " + getColor() + 
					", radius: " + getRadius() + ", fan is off]";
	}
}
