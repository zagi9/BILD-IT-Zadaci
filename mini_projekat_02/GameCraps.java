package mini_projekat_02;

public class GameCraps {
	
	public static void main(String[] args) {
		int sum = roll(); 
		
		if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("You loose");
			System.exit(1);
		}
		else if (sum == 7 || sum == 11) {
			System.out.println("You win");
			System.exit(2);
		}
		
		int point = sum;
		System.out.println("point is " + point);
		do {
			sum = roll();
		} while (sum != point && sum != 7);
		
		if (sum == 7) System.out.println("You loose");
		else System.out.println("You win");
		
		
	}
	
	/**
	 * Method simulira bacanje dvije kocke ispisuje i vraca zbir
	 * @return
	 */
	public static int roll() {
		
		int dice1 = rollOneDice();
		int dice2 = rollOneDice();
		System.out.println("You rolled " + dice1 + " + " +
				dice2 + " = " + (dice1 + dice2));
		return dice1 + dice2;
	}
	
	/**
	 * Method simulira bacanje kocke, tako sto nasumicno bira broj(1-6) i vraca
	 * taj broj
	 * @return
	 */
	public static int rollOneDice() {
		
		return (int)(1 + Math.random() * (7 - 1));
	}
}
