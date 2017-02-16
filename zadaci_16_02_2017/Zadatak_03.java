package zadaci_16_02_2017;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		dispNums(100, 1000);
	}
	
	/**
	 * Method prihvata dva cijela broja kao argumente i provjerava sve brojeve
	 * u tom rasponu da li su djeljivi sa 5 i 6. Ako jesu ispisuje ih, 10 po
	 * liniji
	 * @param n1
	 * @param n2
	 */
	public static void dispNums(int n1, int n2) {
		
		if (n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println("Brojevi od " + n1 + " do " + n2 + 
				" djeljivi sa 5 i 6 su:\n");
		
		int counter = 0;
		for (int i = n1; i <= n2; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				counter++;
				if (counter % 10 == 0) System.out.println(i);
				else System.out.print(i + " ");
			}
		}
	}

}
