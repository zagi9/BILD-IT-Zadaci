package zadaci_27_02_2017;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		int[][] m = fillMatrix();
		countAndDisplayMatrix(m);
	}
	
	/**
	 * Mtehod trazi indexe reda i kolone sa najvecim zbirom cifara i ispisuje
	 * matricu i rezultat 
	 * @param m
	 */
	public static void countAndDisplayMatrix(int[][] m) {
		
		int largestRow = 0;
		int indexRow = 0;
		int largestColumn = 0;
		int indexColumn = 0;
		
		for (int i=0; i < m.length; i++) {
			
			int sumRow = 0;
			int sumColumn = 0;
			int j;
			for (j=0; j < m[i].length; j++) {
				
				sumRow += m[i][j];
				sumColumn += m[j][i];
			}
			if (sumRow > largestRow) { 
				largestRow = sumRow;
				indexRow = i;
			}
			
			if (sumColumn > largestColumn) {
				largestColumn = sumColumn;
				indexColumn = i;
			}
		}
		for (int[] a : m) {
			for (int i : a)
				System.out.print(i + " ");
			System.out.println();
		}	
		System.out.println("Index najveceg reda je " + indexRow);
		System.out.println("Index najvece kolone je " + indexColumn);
		
	}
	
	/**
	 * Method popunjava matricu nasumicno izabranim ciframa 1 i 0
	 * i vraca matricu
	 * @return
	 */
	public static int[][] fillMatrix() {
		
		int[][] m = new int[4][4]; 
		
		for(int i=0; i < m.length; i++) 
			for (int j=0; j < m[i].length; j++)
				m[i][j] = randomize();
		
		return m;
	}

	/**
	 * Method nasumicno bira cifre 0 i 1 i vraca
	 * @return
	 */
	public static int randomize() {
	
		return (int)(Math.random() * 2);
	}

}
