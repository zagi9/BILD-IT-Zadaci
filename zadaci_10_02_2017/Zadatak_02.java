package zadaci_10_02_2017;

import java.util.InputMismatchException;
import utils.Helper;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		System.out.print("Unesite deset decimalnih brojeva: ");
		
		// Popunjavam niz kroz petlju, zavisno od unosa korisnika	
		double[] array;
		do {
			array = checkInput();
		} while (array.length != 10);

		System.out.println("Najmanji broj niza je " + min(array));
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
	
	// Method provjerava validnost unosa i vraca double niz
	public static double[] checkInput() {
	
		Helper help = new Helper();
		
		double[] arr = new double[10];
			
		double num = 0;
		boolean isException = true;
		
		for (int i=0; i < arr.length; i++) {
			do {
				try {
					num =help.checkDoubleInput();
					arr[i] = num;
					isException = false;
				} catch (InputMismatchException ime) {
					System.out.print("Svi unosi moraju biti broj ponovite unos: ");
					return new double[0];
				}
			} while (isException);
		}
		
		return arr;
	}
}
