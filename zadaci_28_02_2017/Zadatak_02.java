package zadaci_28_02_2017;

import utils.Helper;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		System.out.println("Unesite prvu matricu 3x3:");
		int[][] m1 = checkInput();
		
		System.out.println("Unesite drugu matricu 3x3:");
		int[][] m2 = checkInput();
		
		if (equals(m1, m2)) System.out.println("Matrice su striktno identicne");
		else System.out.println("Matrice nisu striktno identicne");
		
	}
	
	/**
	 * Method provjerava da li su dvija proslijedjena 2D niza striktno identicna
	 * @param m1
	 * @param m2
	 * @return
	 */
	public static boolean equals(int[][] m1, int[][] m2) {
		
		for (int i=0; i < m1.length; i++)
			for (int j=0; j < m1[i].length; j++)
				if (m1[i][j] != m2[i][j])
					return false;
		
		return true;
							
	}
	
	/**
	 * Method kontrolise unos korisnika
	 * @return
	 */
	public static int[][] checkInput() {
		
		Helper help = new Helper();
		
		int[][] m = new int[3][3];
		boolean isCorrectInput = false;
		
		do{
			m = help.checkIntMatrix(3, 3);
			if (m.length != 0) isCorrectInput = true;
			else System.out.println("Pogresan unos. Pokusajte ponovo:");
		}while(!isCorrectInput);
		
		return m;
	}

}
