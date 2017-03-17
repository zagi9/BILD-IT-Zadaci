package zadaci_17_03_2017;

public class Zadatak_04 {
	public static void main(String[] args) {
	    
		for (int i = 1; i <= 10; i++)
	      System.out.println(m(i));
	}

	public static double m(int i) {

		if (i == 1) return 1.0 / 3;
	    return m(i - 1) + (i / (2.0 * i + 1));
	}

}
