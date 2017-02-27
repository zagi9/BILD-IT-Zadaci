package zadaci_11_02_2017;

import utils.Helper;
import java.util.Arrays;

public class Zadatak_03 {
	public static void main(String[] args) {

		Helper help = new Helper();
		
		System.out.println("Unesite tri broja, Nakon svakog unosa pritisnite enter:");
		double n1 = help.checkDoubleInput();
		double n2 = help.checkDoubleInput();
		double n3 = help.checkDoubleInput();
		
		displaySortedNumbers(n1, n2, n3);
		
		
	}

	// Method sortira i ispisuje brojeve u rastucem redosljedu
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		double[] arr = {num1, num2, num3};
		Arrays.sort(arr);
		System.out.print("Uneseni brojevi sortirani od najmanjeg ka najvecem: ");
		for (int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
