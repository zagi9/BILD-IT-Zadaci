package zadaci_03_03_2017;

import utils.Helper;

public class DisplayPrimes {

	public static void main(String[] args) {

		display();
	}
	
	/**
	 * Method ispisuje proste brojeve manje od 120
	 */
	public static void display() {
		
		Helper help = new Helper();
		StackOfIntegers stack = new StackOfIntegers();
		
		for (int i=2; i < 120; i++) 
			if (help.isPrime(i)) stack.push(i);
		
		System.out.println("Prosti brojevi manji od 120:");
		while(!stack.empty())
			System.out.println(stack.pop());
		
	}

}
