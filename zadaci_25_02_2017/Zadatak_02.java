package zadaci_25_02_2017;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		int n = getRandom(1, 2, 4, 14, 17, 19, 26, 27, 23, 32, 35, 36, 41, 45);
		System.out.println(n);
	}
	
	/**
	 * Method vraca nasumicno izabran broj izmedju 1 i 54 
	 * iskljucujuci proslijedjene brojeve u varargs numbers 
	 * @param numbers
	 * @return
	 */
	public static int getRandom(int... numbers) {
		
		int n;
		boolean contains;
		do {
			contains = false;;
			n = randomize();
			for (int i=0; i < numbers.length; i++) {
				if (numbers[i] == n) {
					contains = true;
					break;
				}
			}
		} while(contains);
		
		return n;
	}
	
	/**
	 * Method nasumicno bira broj izmedju 1 i 54 i vraca
	 * @return
	 */
	public static int randomize() {
		
		return (int)(1 + Math.random() * 54);
	}

}
