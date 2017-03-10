package zadaci_10_03_2017;

import java.util.ArrayList;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		createObjects();
		System.out.println("After!");
	}
	
	/**
	 * Method kreira i hvata OutOfMemoryError
	 */
	public static void createObjects() {
		
		while(true) {
			
			try {
				new ArrayList<>(123455619);
			}catch(OutOfMemoryError ome) {
				System.out.println("Caught!");
				break;
			}
		}
	}

}
