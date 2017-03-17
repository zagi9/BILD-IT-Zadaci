package zadaci_16_03_2017;

import java.util.Scanner;

public class Zadatak_05 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite decimalni broj: ");
		String num = sc.next();
		int sign = sign(Double.parseDouble(num));
		String[] s = num.split("\\.");
		
		if (s.length != 2) {
			System.out.println("Broj je cijeli");
			System.exit(0);
		}
		
		int n = Integer.parseInt(s[0]);
		
		long i = s[1].length();
		
		long secondNom = Long.parseLong(s[1]) * sign;
		long secondDen = (int)(Math.pow(10, i));
		
		Rational r = new Rational(n).add(new Rational(secondNom, secondDen));
		System.out.println(r);
		
		sc.close();
		
	}
	
	public static int sign(double d) {
		if (d < 0) return -1;
		return 1;
	}

}
