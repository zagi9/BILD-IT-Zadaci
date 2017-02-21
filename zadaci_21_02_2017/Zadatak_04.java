package zadaci_21_02_2017;

import utils.Helper;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		System.out.println("Prvih 100 palindrom primes:\n");
		printPalindromPrimes();
	}
	
	/**
	 * Method ispisuje prvih 100 palindrom prime brojeva
	 */
	public static void printPalindromPrimes() {
		
		Helper help = new Helper();
		int counter = 0;
		int number = 2;
		
		while (counter < 100) {
			
			if (help.isPrime(number) && Zadatak_03.isPalindrome(number)) {
				
				counter++;
				if (counter % 10 == 0) System.out.println(number);
				else System.out.print(number + " ");
			}
			number++;
		}
	}

}
