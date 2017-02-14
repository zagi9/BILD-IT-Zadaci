package zadaci_14_02_2017;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		System.out.print("Unesite cijeli broj: ");
		int n = help.checkIntInput();
		
		String s = isPalindrome(n) ? "je" : "nije";
		System.out.println("Uneseni broj " + s + " palindrom");
	}
	
	/**
	 * Method prima cijeli broj kao argument i izvrce rede cifri(prva ide na zadnje
	 * mjesto, druga na predzadnje itd..) i vraca ga.
	 * @param number
	 * @return
	 */
	public static int reverse(int number) {
		
		int inverted = 0;
		
		while (number != 0) {
			inverted += number % 10;
			inverted *= 10;
			number /= 10;
		}
		return inverted /= 10;
	}
	
	/**
	 * Method provjerava da li je palindrom
	 * @param number
	 * @return
	 */
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
