package zadaci_15_02_2017;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		int n1 = randomize(0,9);
		int n2 = randomize(0,9);
		int n3 = randomize(0,9);
		int res;
		boolean isCorrect = false;
		do {
			System.out.print("Koliko je " + n1 + " + " + n2 + " + " + n3 + ": ");
			res =  help.checkIntInput();
			if (n1+n2+n3 != res) 
				System.out.println("Odgovor nije tacan pokusajte ponovo");
			else 
				isCorrect = true;
		} while(!isCorrect); 
		
		System.out.println("Odgovor je tacan");
	}
	
	/**
	 * Method bira nasumican broj u rasponu start-end
	 * @param start
	 * @param end
	 * @return
	 */
	public static int randomize(int start, int end) {
		return (int)(start + Math.random() * (end - start + 1));
	}

}
