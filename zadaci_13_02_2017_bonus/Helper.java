package zadaci_13_02_2017_bonus;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Klasa help sadrzi neke pomocne metode
 * @author Milan
 *
 */
public class Helper {
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * Method provjerava unos cijelog broja i ako je u redu vraca ga
	 * @return
	 */
	public int checkIntInput() {
	
		int n = 0;
		boolean isCorrect = false;
		
		while(!isCorrect) {
			try {
				n = sc.nextInt();
				isCorrect = true;
			} catch (InputMismatchException e) {
				System.out.print("Nevazeci unos, unesite ponovo: ");
				sc.nextLine();
			}
		}
		return n;
	}
	
	/**
	 * Method provjerava unos decimalnog broja
	 * @return
	 */
	public double checkDoubleInput() {
				
		double n = 0;
		boolean isCorrect = false;
		
		while(!isCorrect) {
			try {
				n = sc.nextDouble();
				isCorrect = true;
			} catch (InputMismatchException e) {
				System.out.println("Nevazeci unos, unesite ponovo: ");
				sc.nextLine();
			}
		}
		return n;
	}
	
	/**
	 * Method provjerava unos niza
	 * @return
	 */
	public int[] checkArrayInput() {
		
		int[] arr = new int[10];
		
		boolean isCorrect = false;
		while (!isCorrect) {
			
			try {
				for (int i=0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				isCorrect = true;
			} catch(InputMismatchException ime) {
				System.out.println("Pogresan unos. "
						+ "Jedan ili vise unosa nije cijeli broj, pokusajte ponovo");
				sc.nextLine();
				return new int[0];
			}
		}
		return arr;
		
	}
	
	public boolean isValid(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%") || 
				s.equals("^") || s.equals("root")) return true;
		System.out.println("Nije unesen validan operand");
		return false;
	}
	
}
