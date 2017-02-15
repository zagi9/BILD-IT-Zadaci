package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite password: ");
		String s = sc.nextLine();
		if (isValid(s)) 
			System.out.println("Password je validan");
		else
			System.out.println("Password nije validan");
		
		sc.close();
	}
	
	/**
	 * Method provjerava da li je string validan password i vraca boolean
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
		
		int countDigits = 0;
		
		if (s.length() < 8) return false;
		
		for (int i=0; i < s.length(); i++) {
			if (!Character.isLetterOrDigit(s.charAt(i))) 
				return false;
			if (Character.isDigit(s.charAt(i)))
				countDigits++;
		}	
		if (countDigits < 2)
			return false;
		return true;
	}

}
