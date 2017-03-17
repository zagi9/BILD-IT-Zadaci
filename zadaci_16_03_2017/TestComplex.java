package zadaci_16_03_2017;

import java.util.Scanner;

public class TestComplex {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite prvi kompleksni broj: ");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		
		System.out.print("Unesite drugi kompleksni broj: ");
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		
		Complex c1 = new Complex(a1, b1);
		Complex c2 = new Complex(a2, b2);
		
		Complex c3 = c1.add(c2);
		Complex c4 = c1.subtract(c2);
		Complex c5 = c1.multiply(c2);
		Complex c6 = c1.divide(c2);
		double d = c1.abs();
		System.out.println("(" + c1 + " + " +  c2 + ") = " + c3);
		System.out.println("(" + c1 + " - " +  c2 + ") = " + c4);
		System.out.println("(" + c1 + " * " +  c2 + ") = " + c5);
		System.out.println("(" + c1 + " / " +  c2 + ") = " + c6);
		System.out.println("|" + c1 + "| = " + d);
		
		sc.close();

	}

}
