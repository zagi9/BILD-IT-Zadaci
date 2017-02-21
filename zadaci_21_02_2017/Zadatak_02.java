package zadaci_21_02_2017;

import utils.Helper;

public class Zadatak_02 {
	public static void main(String[] args) {
	
		prompt();
	}
	
	/**
	 * Method trazi unos korisnika
	 */
	public static void prompt() {
		
		Helper help = new Helper();
		System.out.print("Unesite cijeli broj: ");
		long n = help.checkLongInput();
		
		reverse(n);
	}
	
	/**
	 * Method okrece i ispisuje proslijedjeni broj
	 * @param n
	 */
	public static void reverse(long n) {
		
		long rev = 0;
		long num = n;
		while (num != 0) {
			
			rev += num % 10;
			rev *= 10;
			num /= 10;
		}
		rev /= 10;
		System.out.println(n + " naopako je " + rev);
	}

}
