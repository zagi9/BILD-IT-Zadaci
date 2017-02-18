package zadaci_18_02_2017;

import java.util.ArrayList;
import utils.Helper;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		ArrayList<Integer> list;
		
		System.out.println("Unesite cijele brojeve, unos prekidate nulom:");
		boolean isCorrect = false;
		do {
			list = help.fillArr();
			if (list.size() != 0) isCorrect = true;
			else System.out.println("Pogresan unos, pokusajte ponovo");
		} while(!isCorrect);
		
		calculate(list);
	}
	
	/**
	 * Method prihvata listu cijelih brojeva, izracunava koliko ima pozitivnih,
	 * koliko negativnih, ukupan zbir i prosijek i ispisuje u konzoli
	 * @param list
	 */
	public static void calculate(ArrayList<Integer> list) {
		
		double sum = 0;
		int pos = 0;
		int neg = 0;
		
		for (int i=0; i < list.size(); i++) {
			sum += list.get(i);
			if (list.get(i) > 0) pos++;
			else neg++;
		}
		
		int total = pos + neg;
		
		System.out.println("Pozitivnih brojeva je " + pos + ", negativnih, " + neg +
				" zbir je " + sum + " a prosijek svih brojeva je " + (sum/total));
	} 

}
