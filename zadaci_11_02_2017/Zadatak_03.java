package zadaci_11_02_2017;

import java.util.*;

public class Zadatak_03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite tri broja, Nakon svakog unosa pritisnite enter:");
		double n1 = checkInput();
		double n2 = checkInput();
		double n3 = checkInput();
		
		displaySortedNumbers(n1, n2, n3);
		
		sc.close();
	}

	// Method sortira i ispisuje brojeve u rastucem redosljedu
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		double[] arr = {num1, num2, num3};
		Arrays.sort(arr);
		System.out.print("Uneseni brojevi sortirani od najmanjeg ka najvecem: ");
		for (int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static double checkInput() {
		Scanner sc = new Scanner(System.in);
		double num = 0;
		boolean isException = true;
		
		do {
			try {
				num =sc.nextDouble();
				isException = false;
			} catch (InputMismatchException ime) {
				System.out.print("Unos mora biti broj ponovite unos: ");
				sc.nextLine();
			}
		} while (isException);
		
		return num;
	}
}
