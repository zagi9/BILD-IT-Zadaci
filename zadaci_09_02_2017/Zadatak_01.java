package zadaci_09_02_2017;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		displayLeapYears(101, 2100);
	}
	
	// Method provjerava da li je godina prestupna i vraca boolean
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}
	
	// Method ispisuje prestupne godin u periodu first-last i ispisuje ukupan 
	// broj prestupnih godina u ovom periodu
	public static void displayLeapYears(int first, int last) {
		
		// inicijalne vrijednosti za kontrolnu varijable counter i 
		// ukupna broj godina u periodu first-last
		int counter = 1;
		int yearsTotal = 0;
		
		for (int i = first; i <= last; i++) {
			if (isLeapYear(i)) {
				// Ispis trenutne godine i uvecavanje kontrolne varijable i ukupnog broja godina
				// ukoliko method isLeapYear() vrati true
				if (counter % 10 == 0) System.out.println(i);
				else System.out.print(i + " ");
				yearsTotal++;
				counter++;
			}
		}
		// Ispis ukupnog broja godina
		System.out.println("\n\nU periodo od " + first + " do " + last +
				" godine ima " + yearsTotal + " prestupnih godina");
	}

}
