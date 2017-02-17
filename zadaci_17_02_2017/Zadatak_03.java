package zadaci_17_02_2017;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		displayCombinations(1, 7);
	}
	
	/**
	 * Method printa sve kombinacije proslijedjenih brojeva
	 * @param n1
	 * @param n2
	 */
	public static void displayCombinations(int n1, int n2) {
		
		int counter = 0;
		for (int i=n1; i <= n2; i++)
			for (int j=i+1; j <= n2; j++) {
				System.out.println(i + ", " + j);
				counter++;
			}	
		System.out.println("Broj kombinacija: " + counter);
	}

}
