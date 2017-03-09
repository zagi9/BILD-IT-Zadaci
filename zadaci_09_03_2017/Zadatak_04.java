package zadaci_09_03_2017;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Zadatak_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = randomizeArray();
		System.out.print("Unesite index niza: ");
		
		int n = 0;
		int m = 0;
		boolean isCorrectInput = false;
		
		do {
			try {
				n = sc.nextInt();
				m = arr[n];
				isCorrectInput = true;
			}catch (InputMismatchException ime) {
				System.out.print("Unos nije validan, pokusajte ponovo: ");
				sc.nextLine();
			}catch (ArrayIndexOutOfBoundsException aiob) {
				System.out.print("Unos je van granica niza, pokusajte ponovo: ");
				sc.nextLine();
			}
		}while(!isCorrectInput);
		
		System.out.println("Elemenat niza na indexu " + n + " je: " + m);
		sc.close();
	}
	
	/**
	 * Method kreira i vraca niz od nasumicno izabranih cijelih brojeva
	 * @return
	 */
	public static int[] randomizeArray() {
		
		int[] array = new int[100];
		
		for (int i=0; i < array.length; i++)
			array[i] = (int)(1 + Math.random() * 10);
		
		return array;
	}

}
