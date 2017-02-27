package zadaci_10_02_2017;

import java.util.*;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		int[] array1 = populateArray();
		int[] array2 = populateArray();
		
		if (equals(array1, array2))
			System.out.println("Nizovi su striktno identicni");
		else
			System.out.println("Nizovi nisu striktno identicni");
		
	}

	
	/*
	 * Method provjerava da li su dva niza striktno identicna, odnosno imaju li jednake
	 * elemente na istim pozicijama (indeksima)
	 */
	public static boolean equals(int[] array1, int[] array2) {
		
		// Ukoliko nizovi imaju razlicit broj elemenata nisu striktno identicni
		if (array1.length != array2.length) return false;
		
		// Kroz petlju provjeravamo pojedinacno elemente na istim indeksima
		// ako se razlikuju nizovi nisu striktno identicni
		for (int i=0; i < array1.length; i++)
			if (array1[i] != array2[i]) return false;
		
		return true;
	}
	
	/*
	 * Method popunjava niz u zabisnosti od unosa korisnika
	 */
	public static int[] populateArray() {
		
		Scanner sc = new Scanner(System.in);
		// Kreiram ArrayList koja ce se popunjavati u zavisnosti od unosa korisnika
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Unesite elemente(brojeve) niza, 0, zavrsava unos: ");

		int i;
		// ArrayList se popunjava dok korisnik ne unese 0
		while ((i = sc.nextInt()) != 0) {
			list.add(i);
		}
		
		// Kreiram niz cijelih brojeva i popunjavam ga elementima ArrayListe
		int[] arr = new int[list.size()];
		for (int j=0; j < arr.length; j++)
			arr[j] = list.get(j);
		
		sc.close();
		
		return arr;
	}
}
