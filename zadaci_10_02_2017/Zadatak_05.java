package zadaci_10_02_2017;

import java.util.*;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite dimenzije 2D niza, npr 3 3: ");
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		
		// Deklarisem niz
		double[][] arr = new double[d1][d2];
		
		// Popunjavam niz korisnikovim unosom
		System.out.println("Unesite elemente " + d1 + "x" + d2 + " niza");
		for (int i=0; i < d1; i++)
			for (int j=0; j < d2; j++)
				arr[i][j] = sc.nextDouble();
		
		double[][] sortedArr = sortRows(arr);
		
		// Ispis sotiranog niza
		for (int i=0; i < sortedArr.length; i++) {
			for (int j=0; j < sortedArr[i].length; j++)
				System.out.print(sortedArr[i][j] + " ");
			System.out.println();
		}		
				
		sc.close();
	}

	/*
	 * Method prihvata 2D niz decimalnih brojeva, kopira, sortira redove novog
	 * niza i vraca novi(sortiran) niz
	 */
	public static double[][] sortRows(double[][] array) {
		
		// Deklarisem novi niz koji ima dimenzije kao passed niz
		double[][] sorted = new double[array.length][array[0].length];
		
		// Kopiram elemente niza u novi niz
		for (int i=0; i < array.length; i++) 
			for (int j=0; j < array[i].length; j++)
				sorted[i][j] = array[i][j];
		
		// Sortiram redove novog niza statickom metodom Arrays klase
		for (int i=0; i < sorted.length; i++)
			Arrays.sort(sorted[i]);
		
		return sorted;
	}
}
