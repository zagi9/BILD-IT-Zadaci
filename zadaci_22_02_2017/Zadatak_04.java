package zadaci_22_02_2017;

import utils.Helper;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		System.out.print("Unesite cijeli broj: ");
		long num = help.checkLongInput();
		System.out.print("Zbir svih cifri broja " + num + " je ");
		System.out.println(Math.abs(sumDigits(num)));
	}
	
	/**
	 * Method izracunava zbir cifara cijelog broja
	 * @param n
	 * @return
	 */
	public static int sumDigits(long n) {
		
		int sum = 0;
		
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
}
