package zadaci_28_02_2017;

public class TestStopwatch {
	public static void main(String[] args) {
		
		int[] arr = fillArray();
		Stopwatch sw = new Stopwatch();
		
		sw.start();
		sort(arr);
		sw.end();
		long time = sw.getElapsedTime();
		System.out.println("Za sortiranje ovog 100000 cijelih brojeva "
				+ "bilo je potrebno " + time + " milisekundi");
				
	}
	
	/**
	 * Niz sortiran koristeci selection sort algoritam
	 * @param arr
	 */
	public static void sort(int[] arr) {
		
		for (int i=0; i < arr.length; i++) {
			
			int smallest = arr[i];
			int smallestIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[j] < smallest) {
					smallest = arr[j];
					smallestIndex = j;
				}
			}
			
			if (smallestIndex != i) {
				arr[smallestIndex] = arr[i];
				arr[i] = smallest;
			}
		}
	}
	
	/**
	 * Method deklarise, inicijalizira i vraca niz od 100000 cijelih brojeva
	 * @return
	 */
	public static int[] fillArray() {
		
		int[] arr = new int[100_000];
		for (int i=0; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 10);
		
		return arr;
	}

}
