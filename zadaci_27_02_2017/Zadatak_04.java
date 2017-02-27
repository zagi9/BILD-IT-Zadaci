package zadaci_27_02_2017;

public class Zadatak_04 {
	public static void main(String[] args) {
			
		int[][] m = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
			
			displayMatrix(m);
			System.out.println();
			sort(m);
			
			displayMatrix(m);
		
	}
	
	/**
	 * Method sortira matricu
	 * @param m
	 */
	public static void sort(int[][] m) {
		
		for (int i=0; i < m.length; i++) {
			
			int[] smallest = m[i];
			int smallestIndex = i;
			
			for (int j = i+1; j < m.length; j++) {
				
				if (m[j][0] < smallest[0]) {
					smallest = m[j];
					smallestIndex = j;
				}
				if ((m[j][0] == smallest[0]) && (m[j][1] < smallest[1])) {
					smallest = m[j];
					smallestIndex = j;
				}
			}
			
			if (smallestIndex != i) {
				
				m[smallestIndex] = m[i];
				m[i] = smallest;
			}
 		}
	}
	
	/**
	 * Method ispisuje matricu
	 * @param m
	 */
	public static void displayMatrix(int[][] m) {
		for (int[] a : m) {
			for (int i : a)
				System.out.print(i + " ");
			System.out.println();
		}	
	}

}
