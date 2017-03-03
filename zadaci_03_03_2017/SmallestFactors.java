package zadaci_03_03_2017;

import utils.Helper;

public class SmallestFactors {
	public static void main(String[] args) {
	
		Helper help = new Helper();
		
		System.out.print("Unesite cijeli broj: ");
		int n;
		boolean isCorrectInput = false;
		do {
			n = help.checkIntInput();
			if(n > 0) isCorrectInput = true;
			else System.out.print("Unos nije validan, ponovite unos: ");
		}while(!isCorrectInput);
		
		displayFactors(n);
	}
	
	/**
	 * Method ispisuje najmanje faktore proslijedjenog broja u opadajucem 
	 * redoslijedu
	 * @param num
	 */
	public static void displayFactors(int num) {
		
		StackOfIntegers stack = new StackOfIntegers();
		
		int factor = 2;
		
		while (num >= factor) {
			
			if (num % factor == 0) {
				stack.push(factor);
				num /= factor;
			}	
			
			else {
				factor++;
			}	
		}
		
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
			
	}

}
