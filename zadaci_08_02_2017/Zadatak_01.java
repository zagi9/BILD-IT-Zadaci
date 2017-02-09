package zadaci_08_02_2017;

import java.util.ArrayList;

public class Zadatak_01 {
	public static void main(String[] args) {

		/*
		 * Provjera max(ArrayList<Integer> list) method.
		 * Kreiram tri liste. Jedna sadrzi Integer elemente, druga ima 0 elemenata,
		 * treca ima vrijednost null. Ubacujem sve liste u novu listu i kroz for 
		 * petlju provjeravam vrijednosti koje max() method vraca  
		 */
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(107);
		list1.add(5);
		list1.add(7);
		list1.add(57);
		list1.add(1);
		list1.add(23);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		ArrayList<Integer> list3 = null;
		
		ArrayList<ArrayList<Integer>> listArray = new ArrayList<>();
		listArray.add(list1);
		listArray.add(list2);
		listArray.add(list3);
		
		for (int i=0; i < listArray.size(); i++) {
			Integer n = max(listArray.get(i));
			if (n == null) System.out.println("null");
			else System.out.println(n);
		}
 		
	}
	
	/*
	 * Method vraca najvecu vrijednost ArrayList<Integer> ili, ukoliko nije referencirana
	 * ili nema niti jedan elemenat, vraca null
	 */
	
	public static Integer max(ArrayList<Integer> list) {
		
		// Provjeravam da li je ArrayList prazna i referncirana
		if (list == null || list.size() == 0) return null;
		
		// max varijabla referencira na prvi elemenat liste
		Integer max = list.get(0);
		
		// Kroz petlju provjeravam postoji li veca vrijednost od max u listi.
		// Ukoliko postoji max ce referencirati tu "vrijednost"
		for (int i=0; i < list.size(); i++) 
			if (list.get(i) > max)
				max = list.get(i);
		return max;
		
	}
}
