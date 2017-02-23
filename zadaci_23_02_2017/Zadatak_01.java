package zadaci_23_02_2017;

import utils.Helper;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		System.out.print("Unesite cijeli, pozitivan trocifren broj: ");
		int num;
		boolean isCorrect = false;
		do {
			num = help.checkIntInput();
			if (num >= 100 && num <= 999) isCorrect = true;
			else {
				System.out.println("Broj mora biti trocifren i pozitivan");
				System.out.print("Ponovite unos: ");
			}
		} while(!isCorrect);
		
		String s = isPalindrome(num) ? "je" : "nije";
		System.out.print("Uneseni broj " + s + " palindrom");
	}
	
	/**
	 * Method provjerava, iskljucivo trocifrene brojeve, da li su palindromi
	 * @param num
	 * @return
	 */
	public static boolean isPalindrome(int num) {
		
		return (num / 100 == num % 10) ? true : false;
	}

}
