package zadaci_15_03_2017;

public class TestOctagon {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Octagon o = new Octagon(5);
		System.out.println("Povrsina osmougla: " + o.getArea());
		System.out.println("Obim osmougla: " + o.getPerimeter());
		
		Octagon o2 = (Octagon)o.clone();
		
		System.out.println(o.compareTo(o2));
	}

}
