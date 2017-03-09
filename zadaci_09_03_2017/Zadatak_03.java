package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Zadatak_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite dva cijela broja: ");
		
		int a = 0;
		int b = 0;
		
		boolean isCorrectInput = false;
		do {
			try {
				a = sc.nextInt();
				b = sc.nextInt();
				isCorrectInput = true;
			}catch(InputMismatchException ime) {
				System.out.print("Unos nije validan, pokusajte ponovo: ");
				sc.nextLine();
			}
		}while(!isCorrectInput);
		
		System.out.println("Suma unesenih brojeva je: " + (a+b));
		sc.close();
		
	}

}
