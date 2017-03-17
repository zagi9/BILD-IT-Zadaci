package zadaci_17_03_2017;

import java.util.Scanner;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite dva cijela broja: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(gcd(m, n));
		
		sc.close();
	}
	
	public static int gcd(int m, int n) {
		
		if (m % n == 0) return n;
		
		return gcd(n, m % n);
	}

}
