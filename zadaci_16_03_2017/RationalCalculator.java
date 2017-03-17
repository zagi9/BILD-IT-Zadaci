package zadaci_16_03_2017;

public class RationalCalculator {
	public static void main(String[] args) {

		String rational1 = args[0];
		String rational2 = args[2];
		char operand = args[1].charAt(0);
		
		Rational r1 = createRational(rational1);
		Rational r2 = createRational(rational2);
		
		if (result(r1, r2, operand) == null) 
			System.out.println("Greska pri unosu");
		else
			System.out.println(r1 + " " + operand + " " + r2 + " = " + 
					result(r1, r2, operand));
	}
	
	public static Rational createRational(String s) {
		
		long[] l = new long[2];
		String[] str = s.split("/");
		l[0] = Long.parseLong(str[0]);
		l[1] = Long.parseLong(str[1]);
		return new Rational(l);
	}
	
	public static Rational result(Rational r1, Rational r2, char operand) {
		
		if (operand == '+') return r1.add(r2);
		if (operand == '-') return r1.subtract(r2);
		if (operand == '*') return r1.multiply(r2);
		if (operand == '/') return r1.divide(r2);
		
		return null;
	}

}
