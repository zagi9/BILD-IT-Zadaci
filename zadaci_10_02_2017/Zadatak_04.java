package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak_04 {
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
		
		int[] largest = locateLargest(arr);
		
		System.out.println("Najveci elemenat je na lokaciji " +
				largest[0] + ", " + largest[1]);
		
		sc.close();
				
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
