package zadaci_20_03_2017;

import java.util.ArrayList;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("bca");
		list.add("def");
		list.add("abc");
		list.add("fed");
		list.add("def");
		list.add("ijk");
		list.add("srt");
		
		ArrayList<String> newList = removeDuplicates(list);
		
		for (String i : newList)
			System.out.print(i + " ");
	}
	
	/**
	 * Metod vraca novi objekat ArrayList sa uklonjenimduplikatima iz 
	 * proslijedjene liste
	 * @param list
	 * @return
	 */
	public static<E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		
		ArrayList<E> newList = new ArrayList<>();
		newList.addAll(list);
		for (int i=0; i < newList.size(); i++) {
			for (int j=0; j < newList.size(); j++) {
				if (newList.get(i).equals(newList.get(j)) && i != j) {
					newList.remove(newList.get(j));
				}
			}
		}
		
		return newList;
	}

}
