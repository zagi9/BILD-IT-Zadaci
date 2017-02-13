package zadaci_13_02_2017;


public class Zadatak_04 {

	public static void main(String[] args) {
		
		Help help = new Help();
		
		int[] arr;
 		
		System.out.println("Unesite niz cijelih brojeva");

		do {
			arr = help.checkArrayInput();
		} while (arr.length != 10);
		
		System.out.print("Niz u obrnutom redoslijedu: ");
		reverse(arr);
			
	}
	
	/**
	 * Method prima niz cijelih brojeva kao argument i okrece unos naopako
	 * tj. prvi elemenat ide na zdnje mjesto, drugi na predzadnje itd.
	 * @param arr
	 */
	public static void reverse(int[] arr) {
		
		for (int i=0, j=arr.length - 1; i < arr.length/2; i++, j--) {
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int i : arr)
			System.out.print(i + " ");
	
	}
	
	

}

