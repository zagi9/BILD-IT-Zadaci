package zadaci_10_02_2017;

import utils.Helper;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Unesite broj redova matrice: ");
		int d1 = help.checkIntInput();;
		System.out.print("Unesite broj kolona matrice: ");
		int d2 = help.checkIntInput();
		
		// Deklarisem niz
		double[][] arr = new double[d1][d2];
		
		// Popunjavam niz korisnikovim unosom
		System.out.println("Unesite elemente " + d1 + "x" + d2 + " matrice");
		for (int i=0; i < d1; i++)
			for (int j=0; j < d2; j++)
				arr[i][j] = help.checkDoubleInput();
		
		int[] largest = locateLargest(arr);
		
		System.out.println("Najveci elemenat je na lokaciji " +
				largest[0] + ", " + largest[1]);
		
				
	}
	
	/*
	 * Method locira najveci elemenat 2D niza i vraca lokaciju kao niz sa dva 
	 * elementa (red, kolona)
	 */
	public static int[] locateLargest(double[][] a) {
		
		// Niz ce "sadrzavati" lokaciju najveceg elementa 
		int[] location = new int[2];
		// Inicijalna vrijednost najveceg elementa 
		double largest = a[0][0];
		
		// Kroz petlju trazim vrijednost koja je veca od inicijalne, ukoliko 
		// nadjem inicijalna vrijednost postaje pronadjena, a indeksi pronadjenog
		// broja postaju elementi niza location
		for (int i=0; i < a.length; i++) 
			for (int j=0; j < a[i].length; j++) 
				if (a[i][j] > largest) {
					largest = a[i][j];
					location[0] = i;
					location[1] = j;
				}
			
		return location;
	}
}
