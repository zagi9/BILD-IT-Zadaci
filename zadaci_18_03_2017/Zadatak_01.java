package zadaci_18_03_2017;

import java.util.Scanner;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite cijeli broj: ");
		int num = sc.nextInt();
		reverseDisplay(num);
		sc.close();
	}
	
	/**
	 * Metod ispisuje proslijedjeni cijeli broj u obrnutom redoslijedu
	 * @param value
	 */
	public static void reverseDisplay(int value) {
		
		if (value == 0) return;
		System.out.print(value % 10);
		reverseDisplay(value / 10);
	}

}
