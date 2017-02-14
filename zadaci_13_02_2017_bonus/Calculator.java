package zadaci_13_02_2017_bonus;

public class Calculator {
	
	/**
	 * Konstruktor je private zato sto klasa nema data fielda i svi metodi su
	 * static tako da nema potrebe da bude instancirana
	 */
	private Calculator() {}
	
	/*
	 * Nastupajuci metodi samo rade bazicne matematicke operacije
	 */
	
	private static double add(double n1, double n2) {
		return n1 + n2;
	}
	
	private static double subtract(double n1, double n2) {
		return n1 - n2;
	}
	
	private static double multiply(double n1, double n2) {
		return n1 * n2;
	}
	
	private static double divide(double n1, double n2) {
		return n1 / n2;
	}
	
	private static int modulo(int n1, int n2) {
		return n1 % n2;
	}
	
	private static double graduate(double n1, double n2) {
		return Math.pow(n1, n2);
	}
	
	private static double root(double n) {
		return Math.sqrt(n);
	}
	
	/**
	 * Naredne tri overloadovane metode ce raditi operacije u zavisnost od unosa 
	 * korisnika, odnosno bice pozvana metoda u zavisnosti od unosa
	 * @param n1
	 * @param n2
	 * @param s
	 * @return
	 */
	
	public static double displayRes(double n1, double n2, String s) {
		
		double res = 0;
		
		if (s.equals("+") || s.equals("-") || s.equals("*") || 
				s.equals("/") || s.equals("^")) {
		
			switch(s) {
				case "+": res = add(n1, n2); break;
				case "-": res = subtract(n1, n2); break;
				case "*": res = multiply(n1, n2); break;
				case "/": res = divide(n1, n2); break;
				case "^": res = graduate(n1, n2); 
			}
		
			System.out.println(n1 + " " + s + " " + n2 + " = " + res);
		}
		return res;
	}
	
	public static double displayRes(double n) {
		return root(n);
	}
	public static int displayRes(int n1, int n2) {
		return modulo(n1, n2);
	}
}
