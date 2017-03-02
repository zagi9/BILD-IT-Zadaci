package zadaci_02_03_2017;

import utils.Helper;

public class TestLinearEquation {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		System.out.println("Unesite decimalni broj a: ");
		double a = help.checkDoubleInput();
		System.out.println("Unesite decimalni broj b: ");
		double b = help.checkDoubleInput();
		System.out.println("Unesite decimalni broj c: ");
		double c = help.checkDoubleInput();
		System.out.println("Unesite decimalni broj d: ");
		double d = help.checkDoubleInput();
		System.out.println("Unesite decimalni broj e: ");
		double e = help.checkDoubleInput();
		System.out.println("Unesite decimalni broj f: ");
		double f = help.checkDoubleInput();
		
		LinearEquation le = new LinearEquation(a, b, c, d, e, f);
		if (le.isSolvable()) {
			System.out.println("x = " + le.getX());
			System.out.println("y = " + le.getY());
		}
		else
			System.out.println("Linearna jednadzba nema rjesenja");
	}

}
