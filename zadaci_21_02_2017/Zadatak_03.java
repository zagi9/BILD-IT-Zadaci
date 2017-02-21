package zadaci_21_02_2017;

import utils.Helper;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		System.out.println("Prvih 100 emirp brojeva:\n");
		printEmirps();
	}
	
	/**
	 * Method ispisuje prvih 100 emirp brojeva
	 */
	public static void printEmirps() {
		
		int counter = 0;
		int number = 2;
		
		while (counter < 100) {
			
			if (isEmirp(number) && !isPalindrome(number)) {
				counter++;
				if (counter % 10 == 0) System.out.println(number);
				else System.out.print(number + " ");
			}
			number++;
		}
	}
	
	/**
	 * Method provjerava da li je proslijedjeni broj emirp
	 * @param n
	 * @return
	 */
	public static boolean isEmirp(int n) {
		
		Helper help = new Helper();
		return help.isPrime(n) && help.isPrime(reverse(n));
	}
	
	/**
	 * Method vraca proslijedjeni broj u obrnutom redoslijedu cifri
	 * @param n
	 * @return
	 */
	public static int reverse(int n) {
		
		int rev = 0;
		int num = n;
		while (num != 0) {
			
			rev += num % 10;
			rev *= 10;
			num /= 10;
		}
		return rev /= 10;
	}
	
	/**
	 * Method provjerava da li je broj palindrom
	 * @param number
	 * @return
	 */
	public static boolean isPalindrome(int number) {
		
		return number == reverse(number);
	}

}
