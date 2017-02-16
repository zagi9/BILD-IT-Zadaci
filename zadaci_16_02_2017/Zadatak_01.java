package zadaci_16_02_2017;

import utils.Helper;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Unesite cijeli broj za danasnji dan\n\t"
				+ "0 za ponedjeljak, 1 za utorak, itd: ");
		int day;
		boolean isCorrect = false;
		do {
			day = help.checkIntInput();
			if (day >= 0 && day <= 6) isCorrect = true;
			else System.out.println("Unos nije validan pokusajte ponovo: ");
		} while (!isCorrect);
		
		System.out.print("Unesite cijeli broj da provjerite buduci dan: ");
		int daysPast;
		isCorrect = false;
		do {
			daysPast = help.checkIntInput();
			if (daysPast >= 0) isCorrect = true;
			else System.out.println("Unos ne moze biti negativan broj: ");
		} while (!isCorrect);
		
		int futureDay = (day + daysPast) % 7;
		System.out.println("Danas je " + checkDay(day) + ", a za " + daysPast + " dana, bice " +
				checkDay(futureDay));
	}
	
	/**
	 * Method, kao argument, prihvata cijeli broj pretvara ga u string(ime dana) 
	 * i vraca
	 * @param day
	 * @return
	 */
	public static String checkDay(int day) {
		
		String s = "";
		
		switch(day) {
			case 0: s = "Ponedjeljak"; break;
			case 1: s = "Utorak"; break;
			case 2: s = "Srijeda"; break;
			case 3: s = "Cetvrtak"; break;
			case 4: s = "Petak"; break;
			case 5: s = "Subota"; break;
			case 6: s = "Nedjelja"; 
		}
		
		return s;
	}

}
