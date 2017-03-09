package zadaci_09_03_2017;

import utils.Helper;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Unesite broj tacaka: ");
		
		int points = 0;
		boolean isCorrectInput = false;
		do {
			points = help.checkIntInput();
			if (points > 2) isCorrectInput = true;
			else System.out.print("Unos mora biti cijeli broj veci od 2: ");
		}while (!isCorrectInput);
		
		System.out.println("Unesite koordinate tacaka: ");
		
		double[][] m = new double[points][2];
		isCorrectInput = false;
		do {
			m = help.checkArrayInput(points, 2);
			if (m.length != 0) isCorrectInput = true;
			else System.out.println("Ponovite unos:");
		}while(!isCorrectInput);	
		
		
		computeArea(m);
	}
	
	/**
	 * Method izracunava povrsinu konveksnog poligona
	 * @param matrix
	 */
	public static void computeArea(double[][] matrix) {
		
		double[][] m = new double[matrix.length + 1][2];
		for (int i=0; i < matrix.length; i++)
			for (int j=0; j < matrix[i].length; j++)
				m[i][j] = matrix[i][j];
		
		m[m.length - 1][0] = matrix[0][0];
		m[m.length - 1][1] = matrix[0][1];
		
		double leftDiag = 0;
		double rightDiag = 0;
		
		for (int i=0; i < m.length-1; i++) {
			leftDiag += m[i][0] * m[i+1][1];
			rightDiag += m[i][1] * m[i+1][0];
		}
		
		double area = Math.abs(0.5 * (leftDiag - rightDiag));
		System.out.println("Povrsina je: " + area);
	}

}
