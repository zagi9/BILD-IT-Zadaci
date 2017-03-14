package zadaci_14_03_2017;

public class TestComparableCircle {
	public static void main(String[] args) {
		
		ComparableCircle cc1 = new ComparableCircle(3);
		ComparableCircle cc2 = new ComparableCircle(4);
		
		System.out.println(cc1.compareTo(cc2));
	}

}
