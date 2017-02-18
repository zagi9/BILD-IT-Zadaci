package mini_projekat_02;

import utils.Helper;

public class CreditCardNumber {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Enter a credit card number as a long integer: ");
		long cardNumber = help.checkLongInput();
		
		if (isValid(cardNumber)) System.out.println(cardNumber + " is valid");
		else System.out.println(cardNumber + " is invalid");
		
	}
	
	/** Return true if the card number is valid */
	public static boolean isValid(long number){
		
		if (getSize(number) > 12 && getSize(number) < 17) { 
			if (prefixMatched(number, 4) ||
				prefixMatched(number, 5) ||
				prefixMatched(number, 6) ||
				prefixMatched(number, 37)) { 
				if (((sumOfDoubleEvenPlace(number) +
						sumOfOddPlace(number)) % 10 == 0)) {
					
					return true;
				}
			}	
		}		
			
		return false;
	}
	
	/** Get the  result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		while (number != 0) {
			int i = (int)((number / 10 % 10) * 2);
			sum += getDigit(i);
			number /= 100;
		}
		return sum;
	}
	
	/** Return this number if it is a single digit, otherwise,
	 * return the sum of two digits*/
	public static int getDigit(int number) {
		return (number / 10) + (number % 10);
	}
	
	/** Return sum of odd-places digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number /= 100;
		}
		return sum;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		return d == getPrefix(number, getSize(d));
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) {
		int count = 0;
		while (d != 0) {
			d /= 10;
			count++;
		}
		return count;
	}
	
	/** Return the first k number of digits from number. If the
	 * number of digits in number is less than k, return number */
	public static long getPrefix(long number, int k) {
		if (getSize(number) < k) return number;
		else return number / (long)(Math.pow(10, (getSize(number) - k)));
	}
}
