package zadaci_27_02_2017;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		int[][] m = createMatrix();
		displayMatrix(m);
		countAndDisplayEven(m);
	}
	
	/**
	 * Method kreira i vraca matricu
	 * @return
	 */
	public static int[][] createMatrix() {
		
		int[][] m = new int[6][6];
		
		for (int i=0; i < m.length; i++)
			for (int j=0; j < m[i].length; j++)
				m[i][j] = randomize();
		
		return m;
	}
	
	/**
	 * Method sabira brojeve 1 i ispisuje za svaki red i kolonu ima li 
	 * paran, neparan, ili nema uopste broj 1
	 * @param m
	 */
	public static void countAndDisplayEven(int[][] m) {
		
		System.out.println();
		for (int i=0; i < m.length; i++) {
			
			int sumRows = 0;
			int sumCols = 0;
			
			for (int j=0; j < m[i].length; j++) {
				sumRows += m[i][j];
				sumCols += m[j][i];
			}
			
			if (sumRows == 0)
				System.out.println("Red " + i + " nema broj 1");
			
			else if (sumRows % 2 == 0) 
				System.out.println("Red " + i + " ima paran broj 1");
			
			else 
				System.out.println("Red " + i + " ima neparan broj 1");
			
			
			if (sumCols == 0)
				System.out.println("Kolona " + i + " nema broj 1");
			
			else if (sumCols % 2 == 0) 
				System.out.println("Kolona " + i + " ima paran broj 1");
			
			else 
				System.out.println("Kolona " + i + " ima neparan broj 1");
			
			System.out.println();
			
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
	
	/**
	 * Method nasumicno bira broj 0 ili 1
	 * @return
	 */
	public static int randomize() {
		
		return (int)(Math.random() * 2);
	}

}
