package zadaci_07_03_2017;

import java.util.Date;
import java.util.ArrayList;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Loan loan = new Loan();
		Date date = new Date();
		String s = "Some words";
		
		ArrayList<Object> list = new ArrayList<>();
		list.add(circle);
		list.add(loan);
		list.add(date);
		list.add(s);
		
		for(Object o : list)
			System.out.println(o);
	}

}
