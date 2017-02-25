package zadaci_25_02;

import utils.Helper;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		double[][] array = new double[3][4];
		
		System.out.println("Unesite 3x4 matricu, red po red");
		
		boolean isCorrectInput = false;
		do {		
			array = help.checkArrayInput(3, 4);
			if (array.length != 0) isCorrectInput = true;
			else System.out.println("Unos nije validan, ponovite:");
		} while(!isCorrectInput);
		
		displayResults(array);
	}
	
	/**
	 * Method izracunava sumu brojeva kolone matrice.
	 * @param m
	 * @param columnIndex
	 * @return
	 */
	public static double sumColumn(double[][] m, int columnIndex) {
		
		double sum = 0;
		
		for (int i=0; i < m.length; i++) {
			sum += m[i][columnIndex]; 
		}
		
		return sum;
	}
	
	/**
	 * Method ispisuje sume brojeva kolona matrice
	 * @param array
	 */
	public static void displayResults(double[][] array) {
		
		for (int i=0; i < array[0].length; i++) {
			
			System.out.println("Zbir brojeva kolone " + i + " je " + sumColumn(array, i));
		}
	}

}
