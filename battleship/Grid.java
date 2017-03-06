package battleship;

import utils.Helper;

public class Grid {
	
	private char[][] battlefield;
	private char[][] grid;
	
	public Grid() {
		populateBattlefield();
		grid = new char[7][7];
	}
	
	public char[][] getBattleField() {
		return battlefield;
	}
	
	public char[][] getGrid() {
		return grid;
	}
	
	/**
	 * Method prikazuje grid
	 */
	public void displayGrid() {
		
		System.out.println("---------------");
		
		for (int i=0; i < grid.length; i++) {
			
			for (int j=0; j < grid[i].length; j++) {
				
				System.out.print("|" + grid[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("---------------");
	}
	
	/**
	 * Method kontrolise unos korisnika
	 * @return
	 */
	public int guess() {
		
		Helper help = new Helper();
		int n;
		boolean isCorrectInput = false;
		do {
			n = help.checkIntInput();
			if (n >= 0 && n <= 6) isCorrectInput = true;
			else System.out.print("Unos mora biti(0-6): ");
		}while(!isCorrectInput);
		
		return n;
	}
	
	/**
	 * Method provjerava da li je brod pogodjen
	 * @param row
	 * @param col
	 * @return
	 */
	public boolean isHit(int row, int col) {
		if(battlefield[row][col] != '\u0000') return true;
		return false;
	}
	
	
	/**
	 * Method unosi korisnikov pokusaj u resetku
	 * @param row
	 * @param col
	 */
	public void enterTry(int row, int col) {
		
		if (battlefield[row][col] == '\u0000') {
			grid[row][col] = 'X';
			System.out.println("Promasili ste");
		}
			
		else {
			grid[row][col] = 'O';
			System.out.println("Pogodili ste, gadjajte ponovo");
		}	
	}

	/**
	 * Method hardcode popunjava(nastanjuje) tablu brodovima
	 */
	public void populateBattlefield() {
		
		battlefield = new char[10][10];
		battlefield[1][1] = 'N';
		battlefield[1][2] = 'N';
		battlefield[1][3] = 'N';
		battlefield[1][4] = 'N';
		battlefield[3][1] = 'B';
		battlefield[3][2] = 'B';
		battlefield[3][5] = 'K';
		battlefield[4][5] = 'K';
		battlefield[5][2] = 'P';
		battlefield[5][5] = 'K';
	}
}
