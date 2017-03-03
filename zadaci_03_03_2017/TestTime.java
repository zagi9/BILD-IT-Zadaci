package zadaci_03_03_2017;

public class TestTime {
	public static void main(String[] args) {
		
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		Time t3 = new Time(10, 3, 7);
		Time[] t = {t1, t2, t3};
		
		for (int i=0; i < t.length; i++) {
			System.out.print("t" + (i+1) + " ");
			System.out.print(t[i].getHour() + ":");
			System.out.print(t[i].getMinute() + ":");
			System.out.println(t[i].getSecond());
			System.out.println();
		}
	}
}
