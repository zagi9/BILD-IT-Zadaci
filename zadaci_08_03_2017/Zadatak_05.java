package zadaci_08_03_2017;

import utils.Helper;
import java.util.ArrayList;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		ArrayList<Integer> list1 = help.listOfIntegers(5);
		ArrayList<Integer> list2 = help.listOfIntegers(5);
		
		ArrayList<Integer> list = union(list1, list2);
		
		System.out.println("Kombinovane liste: ");
		for(Integer i : list)
			System.out.print(i + " ");
	}
	
	public static ArrayList<Integer> union(
			ArrayList<Integer> list1, ArrayList<Integer> list2) {
		
		for(int i=0; i < list2.size(); i++)
			list1.add(list2.get(i));
		
		return list1;
	}

}
