package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] array = new double[10];
		
		System.out.print("Unesite deset decimalnih brojeva: ");
		
		// Popunjavam niz kroz petlju, zavisno od unosa korisnika
		for (int i=0; i < array.length; i++)
			array[i] = sc.nextDouble();
		
		System.out.println("Najmanji broj niza je " + min(array));
		
		sc.close();
		
	}

	/*
	 * Method prolazi kroz niz decimalnih brojeva nalazi najmanju vrijednost i vraca je
	 */
	public static double min(double[] array) {
		
		// Prvi broj niza deklarisem kao najmanji
		double n = array[0];
		
		// Kroz petlju provjeravam ostale brojeve, ukoliko postoji broj manji od
		// inicijalnog n, varijabla n dobija tu novu vrijednost 
		for (int i=0; i < array.length; i++) {
			if (array[i] < n)
				n = array[i];
		}
		// Method vraca, "pronadjeni", najmanji broj  
		return n;
	}
}
