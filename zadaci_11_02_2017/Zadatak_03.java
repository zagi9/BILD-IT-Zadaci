package zadaci_11_02_2017;

import java.util.*;

public class Zadatak_03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite tri broja: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		displaySortedNumbers(n1, n2, n3);
		System.out.println();
		displaySortedNumbers_2(n1, n2, n3);
		
		sc.close();
		
	}

	// Method sortira i ispisuje brojeve u rastucem redosljedu
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		double[] arr = {num1, num2, num3};
		Arrays.sort(arr);
		for (int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void displaySortedNumbers_2(double num1, double num2, double num3) {
		
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 =temp;
		}
		if (num2 > num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 =temp;
		}
		System.out.println(num1 + ", " + num2 + ", " + num3);
	}
}
