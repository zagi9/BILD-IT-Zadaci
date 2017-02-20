package zadaci_20_02_2017;

import java.util.Arrays;
import utils.Helper;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.println("Unsite tri cijela broja, nakon svakog unosa pritisnite enter");
		System.out.print("Unesite prvi broj: ");
		int n1 = help.checkIntInput();
		
		System.out.print("Unesite drugi broj: ");
		int n2 = help.checkIntInput();
		
		System.out.print("Unesite treci broj: ");
		int n3 = help.checkIntInput();
		
		int[] arr = displayOrderedNumbers(n1, n2, n3);
		
		System.out.println("Brojevi u rastucem redoslijedu: ");
		for (int i : arr)
			System.out.print(i + " ");
	}
	
	/**
	 * Method prihvata tri cijela broja smijesta ih u niz, sortira i vraca
	 * niz sortiranih brojeva
	 * @param n1
	 * @param n2
	 * @param n3
	 * @return
	 */
	public static int[] displayOrderedNumbers(int n1, int n2, int n3) {
		
		int[] arr = {n1, n2, n3};
		
		Arrays.sort(arr);
		
		return arr;
		
	}

}
