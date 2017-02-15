package zadaci_15_02_2017;

public class Zadatak_04 {
	public static void main(String[] args) {

		displayPerfectNumbers();
	}
	
	/**
	 * Method ispisuje sve savrsene brojeve 0-10000
	 */
	public static void displayPerfectNumbers() {
		
		System.out.print("Savrseni brojevi izmedju 0 i 10000 su: ");
		for (int i=1; i <= 10_000; i++)
			if (isPerfect(i)) System.out.print(i + " ");
	}

	/**
	 * Method provjerava jeli proslijedjeni broj savrsen
	 * @param num
	 * @return
	 */
	public static boolean isPerfect(int num) {
		
		int sum = 0;
		for (int i=1; i <= num/2; i++) 
			if (num % i == 0) sum += i;
		
		return sum == num;
		
	}
}
