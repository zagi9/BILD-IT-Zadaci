package zadaci_02_03_2017;

public class TestFan {
	public static void main(String[] args) {
	
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		fan2.setSpeed(fan1.MEDIUM);
		
		System.out.println(fan1);
		System.out.println(fan2);
	}

}
