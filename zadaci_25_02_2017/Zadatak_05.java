package zadaci_25_02_2017;

import utils.Helper;

public class Zadatak_05 {

	public static void main(String[] args) {
		
		System.out.println("Unesite prvu matricu:");
		double[][] matrix1 = validateInput();
		System.out.println("Unesite drugu matricu:");
		double[][] matrix2 = validateInput();
		
		displayResult(matrix1, matrix2);
	}
	
	/**
	 * Method sabira dvije matrice i vraca rezultat
	 * @param a
	 * @param b
	 * @return
	 */
	public static double[][] addMatrix(double[][] a, double[][] b) {
		
		double[][] resMatrix = new double[a.length][a[0].length];
		
		for (int i=0; i < a.length; i++) 
			for (int j=0; j < a[i].length; j++) 
				resMatrix[i][j] = a[i][j] + b[i][j];
			
		return resMatrix;
	}
	
	/**
	 * Method ispisuje citav izraz
	 * @param a
	 * @param b
	 */
	public static void displayResult(double[][] a, double[][] b) {
		
		double[][] res = addMatrix(a, b);

		
		for (int i=0; i < res.length; i++) {
			for (int j=0; j < res[i].length; j++)
				System.out.print(a[i][j] + " ");
			
			if (i == 1) 
				System.out.print("  +  ");
			else
				System.out.print("     ");
			
			for (int k=0; k < res[i].length; k++)
				System.out.print(b[i][k] + " ");
			
			if (i == 1) 
				System.out.print("  =  ");
			else
				System.out.print("     ");
			
			for (int l=0; l < res[i].length; l++)
				System.out.print(res[i][l] + " ");
			
			System.out.println();
		
		}
		
	}
	
	/**
	 * Method kontrolise unos i vraca matricu
	 * @return
	 */
	public static double[][] validateInput() {
		
		Helper help = new Helper();
		double[][] array = new double[3][3];
		
		boolean isCorrectInput = false;
		do {		
			array = help.checkArrayInput(3, 3);
			if (array.length != 0) isCorrectInput = true;
			else System.out.println("Unos nije validan, ponovite:");
		} while(!isCorrectInput);
		
		return array;
	}
}
