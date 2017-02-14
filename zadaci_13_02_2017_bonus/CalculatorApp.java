package zadaci_13_02_2017_bonus; 

import java.util.Scanner;

/**
 * Klasa simulira jednostavan kalkulator, vrsi bazicne matamaticke operacije
 * (sabiranje, oduzimanje, mnozenje, dijeljenje, modulo, stepenovanje i 
 * kvadratni korijen)
 * @author Milan
 *
 */
public class CalculatorApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Helper help = new Helper();
		
		boolean isInSession = true;
		
		while (isInSession) {
			System.out.print("Unesite prvi operand: ");
			double n1 = help.checkDoubleInput();
		
			String op;
			boolean isValid = false;
			do {
				System.out.println("Unesite zeljenu operaciju "
					+ "(+,-,*,/,%,^,root)");
				op = sc.next();
				if (help.isValid(op)) isValid = true;
			} while (!isValid);
			
			if (!op.equals("root")) {
				System.out.print("Unesite drugi operand: ");
				double n2 = help.checkDoubleInput();
			
				if (op.equals("%")) {
					int num1 = (int)n1;
					int num2 = (int)n2;
					System.out.println(num1 + " % " + num2 + " = " 
						+ Calculator.displayRes(num1, num2));
				}
			
				Calculator.displayRes(n1, n2, op);
			}
			else
				System.out.println("Kvadratni korijen iz " + n1 + " je " 
					+ Calculator.displayRes(n1));
			
			String choice = "";
			do {
				System.out.println("Ako zelite nastaviti unesite y a "
						+ "ako zelite zavrsiti unesite n");
				choice = sc.next();
				if (choice.equals("n")) isInSession = false;
			} while (!choice.equals("y") && !choice.equals("n"));
		}
		sc.close();
	}
}
