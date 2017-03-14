package zadaci_14_03_2017;

public class ComparableCircle extends OtherCircle 
	implements Comparable<ComparableCircle> {

	public ComparableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public int compareTo(ComparableCircle o) {
		if (getArea() > o.getArea()) return 1;
		if (getArea() < o.getArea()) return -1;
		return 0;
	}

}
