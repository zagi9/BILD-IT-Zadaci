package zadaci_25_02_2017;

import utils.Helper;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.print("Kolko zelite brojeva unijeti: ");
		int n = help.checkIntInput();
		
		System.out.print("Unesite brojeve: ");
		int[] array = help.checkArrayInput(n);
		
		if (isConsecutiveFour(array)) 
			System.out.println("Niz ima cetiri uzastopna broja sa istom vrijednoscu");
		else
			System.out.println("Niz nema cetiri uzastopna broja sa istom vrijednoscu");
	}
	
	/**
	 * Niz provjerava da li broj ima cetiri broja u nizu sa istom vrijednoscu
	 * @param values
	 * @return
	 */
	public static boolean isConsecutiveFour(int[] values) {
		
		int counter = 1;
		for (int i=0; i < values.length-1; i++) {
			
			if (values[i] == values[i+1]) {
				counter++;
			}
			else
				counter = 1;
			if (counter == 4) return true;
		}
		return false;
	}

}
