package battleship;


public class Battleship {
	
	public static void main(String[] args) {
	
		Grid grid = new Grid();
		Ship ship = new Ship();
		Player player1 = new Player();
		Player player2 = new Player();
		boolean isDone = false;
		do {
			System.out.println("Player1, vas red");
			play(player1, grid, ship);
		
			if(ship.isAllSunk()) break;
			
			System.out.println("Player2, vas red");
			play(player2, grid, ship);
			
			if(ship.isAllSunk()) isDone = true;
			
		}while(!isDone);
		
		System.out.println("Player1 potopio je " + player1.getSunk());
		System.out.println("i ima " + player1.getHit() + " pogodaka");
		
		System.out.println("Player2 potopio je " + player2.getSunk());
		System.out.println("i ima " + player2.getHit() + " pogodaka");
		
		declareWinner(player1, player2);
	}
	
	/**
	 * Method je entry point za igru
	 * @param p
	 * @param grid
	 * @param ship
	 */
	public static void play(Player p, Grid grid, Ship ship) {
		
		
		boolean isDone = false;
		int row;
		int col;
		
		while(!isDone) {
			 
			boolean isAlreadyShoot = true;
			do {
				System.out.print("Unesite red(0-6): ");
				row = grid.guess();
				System.out.print("Unesite kolonu(0-6): ");
				col = grid.guess();
				if(isAlreadyGuessed(row, col, grid.getGrid())) 
					System.out.println("Na polju je vec gadjano, pokusajte ponovo");
				else
					isAlreadyShoot = false;
				
			}while(isAlreadyShoot);
		
			grid.enterTry(row, col);
		
			grid.displayGrid();
			
			ship.hitBoat(grid.getBattleField()[row][col], p);
			
			if(!grid.isHit(row, col)) isDone = true;
			
			if(ship.isAllSunk()) break;
		}
	}
	
	/**
	 * Method provjerava da li je vec uneseno polje
	 * @param row
	 * @param col
	 * @param c
	 * @return
	 */
	public static boolean isAlreadyGuessed(int row, int col, char[][] c) {
		
		if(c[row][col] != '\u0000') return true;
		return false;
	}
	
	/**
	 * Method ispisuje pobjednika
	 * @param player1
	 * @param player2
	 */
	public static void declareWinner(Player player1, Player player2) {
		
		System.out.print("Pobjednik je: ");
		
		if(player1.getSunk() > player2.getSunk()) System.out.print("Player1");
		
		else if(player1.getSunk() < player2.getSunk()) System.out.print("Player2");
		
		else {
			if(player1.getHit() > player2.getHit()) System.out.print("Player1");
			else if (player1.getHit() < player2.getHit()) System.out.print("Player2");
			else System.out.print("Rezultat je nerijesen");
		}
	}
}
