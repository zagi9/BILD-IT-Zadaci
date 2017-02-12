package zadaci_11_02_2017;

import java.util.*;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
 		// U petlji pozivam checkValid() method, ako je vracena lista prazna ponavlja se
		// ako lista sadrzi elemente, petlja se zavrsava 
		do {
			list = checkValid();
		} while (list.size() == 0);
		
		displayAboveAndBelowAverage(list);
	}
   /*
	* Method izracunava zbir svih brojeva u listi, prosijek, zbraja ukupan
	* broj svih brojeva vecih ili jednakih prosijeku i ispisuje ukupan broj
	* brojeva iznad i jednakih prosijeku i ukupan broj brojeva ispod prosjeka
	*/
	public static void displayAboveAndBelowAverage(ArrayList<Integer> list) {
		
		int size = list.size();
		int sum = 0;
		
		for (int i=0; i < size; i++)
			sum += list.get(i);
		
		double average = 1.0 * sum / size;
		
		int aboveAndEquals = 0;
	
		for (int i=0; i < size; i++)
			if (list.get(i) >= average) aboveAndEquals++;
		
		System.out.println("Vise ili jednako prosjeku je uneseno " + 
				aboveAndEquals + " brojeva");
		System.out.println("Manje od prosjeka je uneseno " + 
				(list.size() - aboveAndEquals) + " brojeva");
				
	}
	
	// Method upisuje brojeve u ArrayListu, provjerava unos, ako je unos validan
	// vraca popunjenu listu ako unos nije validan vraca praznu listu
	public static ArrayList<Integer> checkValid() {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Unesite najvise 100 brojeva, 0 prekida unos");
		
		int n;
		do {
			try {
				n = sc.nextInt();
				list.add(n);
			} catch (Exception e) {
				System.out.println("Unos nije validan, unesite samo cijele brojeve");
				return new ArrayList<>();
			}
		} while (n != 0);
		list.remove(list.size()-1);
		return list;
	}
}
