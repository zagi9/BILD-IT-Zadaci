package zadaci_07_03_2017;

import java.util.ArrayList;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for(Integer i : list)
			System.out.print(i + " ");
		
		System.out.println();
		
		shuffle(list);
		
		for(Integer i : list)
			System.out.print(i + " ");
	}
	
	/**
	 * Method mijesa elemente ArrayList<Integer>
	 * @param list
	 */
	public static void shuffle(ArrayList<Integer> list) {
		
		int size = list.size();
		
		for(int i=0; i < size; i++) {
			int index = (int)(Math.random() * size);
			Integer temp = list.get(index);
			list.remove(index);
			list.add(temp);
		}
	}
}
