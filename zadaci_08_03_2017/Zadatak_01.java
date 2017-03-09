package zadaci_08_03_2017;

import utils.Helper;
import java.util.ArrayList;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Unesite velicinu niza n: ");
		int n;
		boolean isCorrectInput = false;
		do {
			n = help.checkIntInput();
			if(n > 1) isCorrectInput = true;
			else System.out.print("Unesite cijeli broj veci od 1: ");
		}while(!isCorrectInput);
		
		display(n);

	}
	
	/**
	 * Method ispisuje rezultat
	 * @param n
	 */
	public static void display(int n) {
		
		int[][] m = createMatrix(n);
		for(int[] a : m) {
			for(int i : a)
				System.out.print(i + " ");
			System.out.println();
		}
		
		largestRowsAndColumns(m);
	}
	
	/**
	 * Method pronalazi i ispisuje indekse najvecih redova i kolona proslijedjene 
	 * matrice
	 * @param m
	 */
	public static void largestRowsAndColumns(int[][] m) {
		
		ArrayList<Integer> rows = new ArrayList<>();
		ArrayList<Integer> cols = new ArrayList<>();
		
		int[] max = maxRowCol(m);
		
		for(int i=0; i < m.length; i++) {
			int sumRow = 0;
			int sumCol = 0;
			for(int j=0; j < m[i].length; j++) {
				sumRow += m[i][j];
				sumCol += m[j][i];
			}
			if(sumRow == max[0]) rows.add(i);
			if(sumCol == max[1]) cols.add(i);
		}	
		
		System.out.print("Index najvecih redova: ");
		for(Integer i : rows)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.print("Index najvecih kolona: ");
		for(Integer i : cols)
			System.out.print(i + " ");
	}
	
	/**
	 * Method pronalazi najveci red i kolonu proslijedjene matrice
	 * @param m
	 * @return
	 */
	public static int[] maxRowCol(int[][] m) {
		
		int[] max = new int[2];
		int maxRow = 0;
		int maxCol = 0;
		
		for(int i=0; i < m.length; i++) {
			int sumRow = 0;
			int sumCol = 0;
			for(int j=0; j < m[i].length; j++) {
				sumRow += m[i][j];
				sumCol += m[j][i];
			}
			if(sumRow > maxRow) {
				maxRow = sumRow;
				max[0] = maxRow;
			}
			if(sumCol > maxCol) {
				maxCol = sumCol;
				max[1] = maxCol;
			}
		}
		return max;
	}
	
	/**
	 * Method kreira matricu nasunicnih vrijednosti 1 i 0
	 * @param n
	 * @return
	 */
	public static int[][] createMatrix(int n) {
		
		int[][] matrix = new int[n][n];
		
		for(int i=0; i < matrix.length; i++)
			for(int j=0; j < matrix[i].length; j++)
				matrix[i][j] = (int)(Math.random() * 2);
		
		return matrix;
	}
}
