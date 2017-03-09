package zadaci_08_03_2017;

import java.util.ArrayList;
import utils.Helper;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		ArrayList<Integer> list = help.listOfIntegers(10);
		
		removeDuplicates(list);
		
		System.out.println("Distinktni brojevi unesenog niza su: ");
		for(Integer i : list)
			System.out.print(i + " ");
	}
	
	/**
	 * Method uklanja duplikate iz ArrayList<Integer>
	 * @param list
	 */
	public static void removeDuplicates(ArrayList<Integer> list) {
		
		for(int i=0; i < list.size(); i++) {
		
			for(int j=i+1; j < list.size(); j++) {
				if(list.get(i).equals(list.get(j))) 
					list.remove(j--);
			}
		}
	}

}
