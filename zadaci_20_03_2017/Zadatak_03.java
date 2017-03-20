package zadaci_20_03_2017;

public class Zadatak_03 {
	public static void main(String[] args) {

		Integer[] array = {1, 34, 234, 12, 8};
		System.out.println("Najveci elemenat niza je " + max(array));
	}
	
	public static <E extends Comparable<E>> E max(E[] list) {
		
		E largest = list[0];
		for (int i=0; i < list.length; i++) {
			if (list[i].compareTo(largest) > 0) {
				largest = list[i];
			}
		}
		
		return largest;
	}

}
