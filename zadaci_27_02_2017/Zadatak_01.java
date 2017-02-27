package zadaci_27_02_2017;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		int[][] hours = {{2, 4, 3, 4, 5, 8, 8},
				         {7, 3, 4, 3, 3, 4, 4},
				         {3, 3, 4, 3, 3, 2, 2},
				         {9, 3, 4, 7, 3, 4, 1},
				         {3, 5, 4, 3, 6, 3, 8},
				         {3, 4, 4, 6, 3, 4, 4},
				         {3, 7, 4, 8, 3, 8, 4},
				         {6, 3, 5, 9, 2, 7, 9}};
		
		int[] totalHours = calculateHours(hours);
		displayHours(totalHours);
	}
	
	/**
	 * Method izracunava broj radnih sati za svakog zaposlenika, smjesta u niz
	 * i vraca niz
	 * @param m
	 * @return
	 */
	public static int[] calculateHours(int[][] m) {
		
		int[] hoursTotal = new int[m.length];
		
		for (int i=0; i < m.length; i++) {
			for (int j=0; j < m[i].length; j++) {
				
				hoursTotal[i] += m[i][j];
			}
		}
		
		return hoursTotal;
	}
	
	/**
	 * Method ispisuje broj radnih sati svakog zaposlenika u opadajucem 
	 * redoslijedu
	 * @param hours
	 */
	public static void displayHours(int[] hours) {
		
		for (int i=0; i < hours.length; i++) {
			int index = 0;
			int max = hours[index];
			for (int j=0; j < hours.length; j++) {
				if (hours[j] > max) {
					index = j;
					max = hours[index];
				}
			}
			System.out.println("Zaposlenik " + index + " ima " + max + " radnih sati");
			hours[index] = -1;
		}
	}
}
