package zadaci_22_02_2017;

import utils.Helper;

public class Zadatak_02 {
	public static void main(String[] args) {
		
		Helper help = new Helper();
		String[] str = {"rock", "paper", "scissors"};
		
		System.out.println("Unesite rock, paper, scissors(0, 1, 2)");
		boolean isCorrectInput = false;
		int myGuess;
		do {
			myGuess = help.checkIntInput();
			if (myGuess >= 0 && myGuess <= 2) isCorrectInput = true;
			else System.out.print("Unos nije validan, ponovite: ");
		} while (!isCorrectInput);
		
		int compGuess = (int)(Math.random() * 3);
		
		System.out.println(rps(str, myGuess, compGuess));
 	}
	
	/**
	 * Method prihvata niz stringova kao moguce izbore, izbor korisnika ka cijeli
	 * broj i random broj. Poredi ih i vraca rezultat kao string
	 * @param s
	 * @param n
	 * @param comp
	 * @return
	 */
	public static String rps(String[] s, int n, int comp) {
		
		System.out.println("Vi ste izabrali " + s[n] + 
			", kompjuter je izabrao " + s[comp]);
		
		if (n == comp) 
			return "Nerijeseno je";
		
		if (n == 0 && comp == 1) {
			return "Komjuter je pobijedio";
		}	
		else if (n == 0 && comp == 2) {
			return"Pobijedili ste";
		}
		
		else if (n == 1 && comp == 2) { 
			return "Komjuter je pobijedio";
		}	
		else if (n == 1 && comp == 0){
			return "Pobijedili ste";
		}	
		
		else if (n == 2 && comp == 0) { 
			return "Komjuter je pobijedio";
		}	
		else {
			return "Pobijedili ste";
		}	
	}
}
