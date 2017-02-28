package zadaci_28_02_2017;

import java.util.Arrays;
import utils.Helper;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.println("Unesite 3x3 matricu, red po red:");
		
		double[][] m = new double[3][3];
		boolean isCorrectInput = false;
		do{
			m = help.checkArrayInput(3, 3);
			if (m.length != 0) isCorrectInput = true;
			else System.out.println("Unos nije validan, pokusajte ponovo:");
		}while(!isCorrectInput);
		
		
		double[][] sorted = sortRows(m);
		System.out.println("\nMatrica sa sortiranim redovima: ");
		displayMatrix(sorted);
	}
	
	/**
	 * Method sortira redove matrice
	 * @param m
	 * @return
	 */
	public static double[][] sortRows(double[][] m) {
		
		double[][] sortedM = copyMatrix(m);
		for (int i=0; i < sortedM.length; i++)
			Arrays.sort(sortedM[i]);
		
		return sortedM;
	}
	
	/**
	 * Method kopira matricu
	 * @param m
	 * @return
	 */
	public static double[][] copyMatrix(double[][] m) {
		
		double[][] matrix = new double[m.length][m[0].length];
		
		for (int i=0; i < m.length; i++)
			for (int j=0; j < m[i].length; j++)
				matrix[i][j] = m[i][j];
		
		return matrix;
	}
	
	/**
	 * Method ispisuje matricu
	 * @param m
	 */
	public static void displayMatrix(double[][] m) {
		
		for (double[] arr : m) {
			for (double n : arr)
				System.out.print(n + " ");
			System.out.println();
		}
	}

}
