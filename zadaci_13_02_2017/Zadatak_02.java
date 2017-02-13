package zadaci_13_02_2017;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suit = {"Hearts", "Spades", "Diamonds", "Clubs"};
		
		System.out.println("Izabrana je karta: " + randomPick(rank) + " " + randomPick(suit));

	}
	
	/**
	 * Method nasumicno bira i vraca index String niza
	 * @param str
	 * @return
	 */
	public static String randomPick(String[] str) {
		
		int num = (int)(Math.random() * str.length);
		return str[num];
	}

}

