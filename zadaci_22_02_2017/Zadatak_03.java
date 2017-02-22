package zadaci_22_02_2017;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		System.out.print("1/3 + 3/5 + 5/7 + ... + 97/99 = ");
		System.out.println(sum());
	}
	
	/**
	 * Method izracunava seriju brojeva 1/3 + 3/5 + 5/7 + ... + 97/99
	 * i vraca rezultat kao decimalni broj
	 * @return
	 */
	public static double sum() {
		
		double s = 0;
		
		for (int i=1, j=3; i <= 97; i += 2, j += 2) 
			s += 1.0 * i/j;
		
		return s;
	}
}
