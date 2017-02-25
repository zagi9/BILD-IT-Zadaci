package zadaci_25_02_2017;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		int[] array = fillArray();
		displayCount(array);
	}
	
	/**
	 * Method pounjava i vraca niz cijelih brojeva 
	 * @return
	 */
	public static int[] fillArray() {
		
		int[] array = new int[10];
		for (int i=0; i < 100; i++) {
			
			array[randomize()]++;
		}
		return array;
	}
	
	/**
	 * Method nasumicno bira cijeli broj 0-9
	 * @return
	 */
	public static int randomize() {
		
		return (int)(Math.random() * 10);
	}
	
	/**
	 * Method ispisuje, koliko se puta ponavlja svaki elemenat niza
	 * @param numbers
	 */
	public static void displayCount(int[] numbers) {
		
		for (int i=0; i < numbers.length; i++) {
			
			if (numbers[i] != 0)
				System.out.println("Brojeva " + i + " ima " + numbers[i]);
		}
	}

}
