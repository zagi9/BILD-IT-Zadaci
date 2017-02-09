package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite n dimenziju matrice: ");
		int n = sc.nextInt();
		printMatrix(n);
		sc.close();
	}
	
	/*
	 * Method nasumicno generise 0 ili 1 i ispisuje kvadratnu matricu nxn,
	 * gdje se dimenzija n prosljedjuje kao argument
	 */
	public static void printMatrix(int n) {
		
		int[][] matrix = new int[n][n];
		for (int i=0; i < matrix.length; i++) {
			for (int j=0; j < matrix[i].length; j++)
				System.out.printf("%2d", (int)(Math.random() * 2));
			System.out.println();
		}	
		
	}

}
