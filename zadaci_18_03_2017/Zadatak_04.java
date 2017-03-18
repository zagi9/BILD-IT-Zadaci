package zadaci_18_03_2017;

import java.util.Scanner;

public class Zadatak_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite cijeli broj: ");
		long number = sc.nextLong();
		System.out.print("Suma cifri unesenog broja je ");
		System.out.println(sumDigits(number));
		sc.close();
	}
	
	public static int sumDigits(long n) {
		
		if (n == 0) return 0;
		
		return (int)(n % 10) + sumDigits(n / 10);
	}

}
