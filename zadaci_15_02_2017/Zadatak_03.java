package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Helper help = new Helper();
		
		System.out.print("Unesite godinu: ");
		int year = help.checkIntInput();
		
		System.out.print("Unesite prva tri slova mjeseca, prvo slovo veliko, npr. Mar: ");
		String s;
		boolean isCorrect = false;
		int month;
		do {
			s = sc.nextLine();
			month = checkMonthInput(s);
			if (month != 0) 
				isCorrect = true;
			else
				System.out.print("Pogresan unos mjeseca pokusajte ponovo: ");
		} while (!isCorrect);
		
		
		// Za ispis koristim method iz klase Zadatak_02
		System.out.print(s + " ");
		Zadatak_02.checkYear(year);
		System.out.println(" ima " + Zadatak_02.totalDays(year, month)+ " dana");
		
		sc.close();
	}
	
	/**
	 * Method prihvata string (unos korisnika), pretvara ga cijeli broj i vraca
	 * @param s
	 * @return
	 */
	public static int checkMonthInput(String s) {
		
		int i;
		switch (s) {
			case "Jan": i = 1; break;
			case "Feb": i = 2; break;
			case "Mar": i = 3; break;
			case "Apr": i = 4; break;
			case "Maj": i = 5; break;
			case "Jun": i = 6; break;
			case "Jul": i = 7; break;
			case "Avg": i = 8; break;
			case "Sep": i = 9; break;
			case "Okt": i = 10; break;
			case "Nov": i = 11; break;
			case "Dec": i = 12; break;
			default: i = 0;
		}
		
		return i;
	}

}
