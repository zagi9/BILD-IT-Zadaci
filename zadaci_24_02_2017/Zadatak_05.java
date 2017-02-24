package zadaci_24_02_2017;

import utils.Helper;
import java.util.ArrayList;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Unesite 10 brojeva: ");
		int[] arr;
		do {
			arr = help.checkArrayInput();
		}while (arr.length == 0);
		
		System.out.print("Jedinstveni brojevi ovog niza su: ");
		uniqueNumbers(arr);
	}
	
	/**
	 * Method prihvata niz brojeva i ispisuje jedinstvene brojeve niza
	 * @param arr
	 */
	public static void uniqueNumbers(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i=0; i < arr.length; i++) 
			if (!list.contains(arr[i]))
				list.add(arr[i]);
		
		for (Integer i : list)
			System.out.print(i + " ");
	}

}
