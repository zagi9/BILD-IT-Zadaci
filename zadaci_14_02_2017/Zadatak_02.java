package zadaci_14_02_2017;

public class Zadatak_02 {
	public static void main(String[] args) {
	
		Helper help = new Helper();
		
		System.out.print("Unesite pocetnu godinu: ");
		int start = help.checkIntInput();
		
		System.out.print("Unesite zavrsnu godinu: ");
		int end = help.checkIntInput();
		
		System.out.println();
		System.out.println("Sve prestupne godine izmedju navedenih su:");
		printLeapYears(start, end);
		
	}
	
	/**
	 * Method ispisuje sve prestupne godine u rasponu first-last
	 * @param first
	 * @param last
	 */
	public static void printLeapYears(int first, int last) {
		
		if (first > last) {
			int temp = first;
			first = last;
			last = temp;
		}
		
		int counter = 0;
		for (int i = first; i <= last; i++) {
			if (isLeapYear(i)) {
				counter++;
				if (counter % 10 == 0) System.out.println(i);
				else System.out.print(i + " ");
			}
		}
	}
	
	/**
	 * Method provjerava da li je godina prestupna
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

}
