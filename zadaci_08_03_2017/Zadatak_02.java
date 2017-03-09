package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Collections;
import utils.Helper;;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		ArrayList<Integer> list = help.listOfIntegers(5);
		sort(list);
		
		System.out.println("Sortirani brojevi: ");
		for(Integer i : list)
			System.out.print(i + " ");
	}
	
	/**
	 * Method sortira Integer objekte
	 * @param list
	 */
	public static void sort(ArrayList<Integer> list) {
		
		Collections.sort(list);
	}
	
}
