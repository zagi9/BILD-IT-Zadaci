package zadaci_13_03_2017;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		ArrayList<Number> list = new ArrayList<>();
		list.add(1);
		list.add(1.5);
		list.add(new BigInteger("17267126726712672676276"));
		list.add(new BigDecimal("1.75748574574857485758"));
		list.add(3);
		list.add(3.2);
		
		for (Number n : list)
			System.out.print(n + " ");
		
		System.out.println();
		
		shuffle(list);
		
		for (Number n : list)
			System.out.print(n + " ");

	}
	
	public static void shuffle(ArrayList<Number> list) {
		
		for (int i=0; i < list.size(); i++) {
			
			int index = (int)(Math.random() * list.size());
			Number temp = list.get(index);
			list.remove(index);
			list.add(temp);
		}
	}
}
