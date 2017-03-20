package zadaci_20_03_2017;

import java.util.Arrays;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Integer[] array = {1, 34, 234, 12, 8};
		Arrays.sort(array);
		for (Integer num : array)
			System.out.print(num + " ");
		System.out.println();
		
		System.out.println("Index broja 12 je " + binarySearch(array, 12));
		System.out.println("Index broja 17 je " +binarySearch(array, 17));

	}
	
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		
		int low = 0;
		int high = list.length -1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key.compareTo(list[mid]) < 0) {
				high = mid - 1;
			}
			else if (key.compareTo(list[mid]) == 0) {
				return mid;
			}
			else {
				low = mid + 1;
			}
		}
		
		return -low - 1;
	}

}
