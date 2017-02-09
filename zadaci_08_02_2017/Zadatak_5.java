package zadaci_08_02_2017;

import java.util.*;

public class Zadatak_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite niz cijelih brojeva. Unos prekidate nulom: ");
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int n;
		while ((n = sc.nextInt()) != 0) {
			list.add(n);
		}
		
		int[] intArray = new int[list.size()];
		for (int i=0; i < intArray.length; i++)
			intArray[i] = list.get(i);
		
		countLargest(intArray);
		
		sc.close();
		
	}
	
	/*
	 * Method, kao argument, prihvata niz, pronalazi i ispisuje najveci broj niza i 
	 * koliko se puta ponavlja 
	 */
	public static void countLargest(int[] nums) {
		
		// inicijalne vrijednosti najveceg broja i broj ponavljanja
		int largest = nums[0];
		int count = 0;
		
		for (int i=0; i < nums.length; i++) {
			
			// Ukoliko je trenutna vrijednost elementa niza jednaka najvecoj vrijednosti
			// broj ponavljanja se inkrementira
			if (nums[i] == largest) count++;
			
			// Ako je trenutna vrijednost niza veca od najvece, trenutna vrijednost 
			// postaje najveca a broj ponavljanja se resetuje
			else if (nums[i] > largest) {
				largest = nums[i];
				count = 1;
			}
		}
		// Ispis. "count" je broj pojavljivanja najveceg broja u nizu
		// a (count-1) broj ponavljanja tog broja 
		System.out.println("Najveci broj je " + largest + " ponavlja se " 
				+ (count-1) + " puta");
	}

}
