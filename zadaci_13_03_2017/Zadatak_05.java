package zadaci_13_03_2017;

import java.util.ArrayList;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Zadatak_05 {
	public static void main(String[] args) {

		ArrayList<Number> list = new ArrayList<>();
		
		list.add(123);
		list.add(12);
		list.add(new BigInteger("1234567890"));
		list.add(1334.78);
		list.add(new BigDecimal("23.37466476734637463764"));
		
		for (Number n : list)
			System.out.print(n + " ");
		
		System.out.println();
		sort(list);
		
		for (Number n : list)
			System.out.print(n + " ");
	}
	
	/**
	 * Method sortira ArrayList od najmanjeg ka najvecem (selection sort algorithm)
	 * @param list
	 */
	public static void sort(ArrayList<Number> list) {
		
		int size = list.size(); 
		
		for (int i=0; i < size; i++) {
			Number minNum = list.get(i);
			int minNumIndex = i;
			for (int j = i+1; j < size; j++) {
				if (list.get(j).doubleValue() < minNum.doubleValue()) {
					minNum = list.get(j);
					minNumIndex = j;
				}
			}
			if (minNumIndex != i) {
				list.remove(minNumIndex);
				list.add(i, minNum);
				
			}
		}
	}

}
