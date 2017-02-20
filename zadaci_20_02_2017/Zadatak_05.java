package zadaci_20_02_2017;

import utils.Helper;
import java.util.ArrayList;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		ArrayList<Integer> list;
		
		System.out.println("Unesite niz cijelih brojeva od 1 do 100");
		boolean isCorrect = false;
		do {
			list = help.fillArr();
			if (list.size() != 0 && checkInput(list))
				isCorrect = true;
			
			else {
				System.out.println("Doslo je do greske, niz mora sadrzati brojeve 1-100");
				System.out.print("Ponovite unos: ");
			}
			
		} while(!isCorrect);
		
		countNumbers(list);
		
	}
	
	/**
	 * Method prihvata ArrayList broji koliko puta se svaki elemnat pojavljuje
	 * i ispisuje rezultat
	 * @param list
	 */
	public static void countNumbers(ArrayList<Integer> list) {
		
		int[] arr = new int[100];
		for (int i=0; i < list.size(); i++) {
			int num = list.get(i);
			arr[num]++;
		}
		
		for (int i=0; i < arr.length; i++) 
			if (arr[i] != 0) 
				System.out.println("Broj " + i + " ponavlja se " + arr[i] + " puta");
		
	}
	
	/**
	 * Method kontrolise unos korisnika
	 * @param list
	 * @return
	 */
	public static boolean checkInput(ArrayList<Integer> list) {
		
		for (int i=0; i < list.size(); i++) {
			if (list.get(i) < 1 || list.get(i) > 100) return false;	
		}
		
		return true;
	}
	
	

}
