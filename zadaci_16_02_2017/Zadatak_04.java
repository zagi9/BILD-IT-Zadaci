package zadaci_16_02_2017;

import utils.Helper;
import java.util.ArrayList;

public class Zadatak_04 {
	public static void main(String[] args) {
	
		Helper help = new Helper();
		
		ArrayList<Integer> list;
		
		boolean isCorrect = false;
		do {
			list = help.fillArr();
			if (list.size() == 0) 
				System.out.println("Nevazeci unos, pokusajte ponovo: ");
			else
				isCorrect = true;
			
		} while (!isCorrect);
		
		largest(list);
	}
	
	/**
	 * Method prihvata ArrayList cijelih brojeva kao argument trazi najveci, broji
	 * koliko se puta pojavljuje i ispisuje obavijest 
	 * @param list
	 */
	public static void largest(ArrayList<Integer> list) {
		
		int max = list.get(0);
		int count = 0;
		
		for (int i=0; i < list.size(); i++) {
			if (list.get(i) == max)
				count++;
			
			if (list.get(i) > max) {
				max = list.get(i);
				count = 1;
			}
		}
		System.out.println("Najveci broj niza je " + max + " i pojavljuje se " + count + " puta.");
	}

}
