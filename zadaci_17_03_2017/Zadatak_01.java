package zadaci_17_03_2017;

import java.util.Scanner;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite index na kojem zelite provjeriti "
				+ "broj Fibonacci niza: ");
		
		int n = sc.nextInt();
		
		System.out.println(fibAtIndex(n));
		
		sc.close();
	}
	
	public static int fibAtIndex(int index) {
		
		int f0 = 0;
		int f1 = 1;
		int currentFib = 0;
		
		for (int i=1; i < index; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}
		return currentFib;
	}

}
