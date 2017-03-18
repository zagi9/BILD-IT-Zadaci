package zadaci_18_03_2017;

import java.util.Scanner;

public class Zadatak_05 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] array = new int[8];
		System.out.print("Unesite osam cijelih brojeva: ");
		for (int i=0; i < array.length; i++)
			array[i] = sc.nextInt();
		
		System.out.print("Najveci broj niza je ");
		System.out.println(largestNumber(array, 0));
		
		sc.close();

	}
	
	/**
	 * Metod vraca najveci broj niza
	 * @param numArray
	 * @param index
	 * @return
	 */
	public static int largestNumber(int[] numArray, int index) {
		
		int current = numArray[index];
		
		if (index == numArray.length - 1) return current;
		
		if (largestNumber(numArray, index + 1) > current)
			return largestNumber(numArray, index + 1);
		
		else
			return current;

	}

}
