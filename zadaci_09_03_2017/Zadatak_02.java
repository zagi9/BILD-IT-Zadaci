package zadaci_09_03_2017;

import java.util.ArrayList;
import utils.Helper;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		System.out.print("Unesite cijeli broj: ");
		int m = help.checkIntInput();
		computePerfectSquare(m);
		
	}
	
	/**
	 * Method izracunava i ispisuje savrsen kvadrat
	 * @param m
	 */
	public static void computePerfectSquare(int m) {
		
		ArrayList<Integer> list = factors(m);
		ArrayList<Integer> list2 = distinctOdds(list);
		int n = 1;
		for (int i=0; i < list2.size(); i++)
			n *= list2.get(i);
		
		System.out.println("Najmanji broj n za n * m da bi bio savrsen kvadrat je " + n);
		System.out.println(m + " * " + n + " = " + (m*n));
	}
	
	/**
	 * Method unosi sve faktore proslijedjenog broja u ArrayList i vraca
	 * @param n
	 * @return
	 */
	public static ArrayList<Integer> factors(int n) {
		
		ArrayList<Integer> list = new ArrayList<>();
		int factor = 2;
		
		while(n != 1) {
			
			if(n % factor == 0) {
				list.add(factor);
				n /= factor;
			}	
			else {
				factor++;
			}	
		}
		return list;
	}
	
	/**
	 * Method izdvaja brojeve koji se ponavljaju neparan broj puta u 
	 * proslijedjenoj listi, unosi ih u novu listu i vraca
	 * @param list
	 * @return
	 */
	public static ArrayList<Integer> distinctOdds(ArrayList<Integer> list) {
		
		list.add(0);
		ArrayList<Integer> list2 = new ArrayList<>();
		int counter = 1;
		for (int i=0; i < list.size()-1; i++) {
			if (list.get(i) == list.get(i+1)) {
				counter++;
			}
			else {
				if (counter % 2 != 0) {
					list2.add(list.get(i));
					counter = 1;
				}
				else {
					counter = 1;
				}
			}
		}
		return list2;
 	}

}
