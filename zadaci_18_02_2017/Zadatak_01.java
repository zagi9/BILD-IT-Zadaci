package zadaci_18_02_2017;

import java.util.Scanner;

import java.util.Collections;
import utils.Helper;
import java.util.ArrayList;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Helper help = new Helper();
		ArrayList<String> cities = new ArrayList<>();
		
		System.out.println("Unesite imena tri grada, "
				+ "nakon svakog unosa pritisnite enter: ");
		
		for (int i=0; i < 3; i++) { 
			
			System.out.print("Unesite ime ");
			if (i>0) System.out.print("sljedeceg ");
			System.out.print("grada: ");
			
			try {
				String s = sc.nextLine();
				s = help.makeCapitalLetters(s);
				cities.add(s);
			} catch(Exception e) {
				System.out.println("Nenormalan unos, ponovite");
				i--;
			}
		}
		
		displayOrderedCities(cities);
		
		sc.close();
	}
	
	/**
	 * Method prihvata niz stringova sortira ih i ispisuje 
	 * @param array
	 */
	public static void displayOrderedCities(ArrayList<String> list) {
		
		Collections.sort(list);
		System.out.println("Gradovi sortirani po abecedi: ");
		for (String s : list)
			System.out.println(s);
	}
	
}
