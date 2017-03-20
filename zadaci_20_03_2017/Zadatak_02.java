package zadaci_20_03_2017;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Integer[] array = {1, 2, 3, 4};
		System.out.println(lineSearch(array, 4));
	}
	
	public static <E extends Comparable<E>> int lineSearch(E[] list, E key) {
		
		for (int i=0; i < list.length; i++) {
			if (list[i].compareTo(key) == 0) return i;
		}
		
		return -1;
	}

}
