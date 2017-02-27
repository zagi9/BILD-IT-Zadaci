package mini_projekat_03;

import utils.Helper;

public class ConnectFour {
	public static void main(String[] args) {
		char[][] grid = new char[6][7];
		char red = 'R';
		char yellow = 'Y';
		displayGrid(grid);
		int done;
		do {
			done = play(grid, red);
			if (done == 1) break;
			done = play(grid, yellow);
			if (done == 1) break;
		
		} while (done != 1);
		
	}
	
	/**
	 * Method je entry point igre. Ukoliko je igra zavrsena pronadjena cetiri 
	 * povezana diska vraca 1, ukoliko nije vraca -1
	 * @param ch
	 * @param c
	 * @return
	 */
	public static int play(char[][] ch, char c) {
		promptUser(ch, c);
		if (isConsecutiveFour(ch)) {
			if(c == 'R') System.out.println("Pobjednik je crveni");
			else System.out.println("Pobjednik je zuti");
			return 1;
		}
		return -1;
	}
	
	/**
	 * Method ispisuje(crta) tabelu, sa eventualnim unosima(R ili Y) ili praznu 
	 * @param grid
	 */
	public static void displayGrid(char[][] grid) {
		for (int i=0; i < grid.length; i++) {
			System.out.printf("%c", '|');
			for (int j=0; j < grid[i].length; j++) {
				if (grid[i][j] == '\u0000')
					System.out.printf("%2c", '|');
				else
					System.out.printf("%c%c", grid[i][j], '|');
			}
			System.out.println();
		}
		System.out.println("---------------");
	}
	
	/**
	 * Method trazi unos od onog korisnika koji je na redu da igra(Y ili R)
	 * da unese broj kolone u koju zeli ubaciti disk(0-6) 
	 * @param ch
	 * @param c
	 */
	public static void promptUser(char[][] ch, char c) {

		Helper help = new Helper();
		
		if (c == 'R') 
			System.out.print("Ubacite crveni disk u kolonu(0-6): ");
		else
			System.out.print("Ubacite zuti disk u kolonu(0-6): ");
		
		int col;
		boolean isCorrectInput = false;
		do {
			col = help.checkIntInput();
			if (col >= 0 && col <=6) isCorrectInput = true;
			else System.out.print("Unos mora biti 0-6, pokusajte poonovo: ");
		} while(!isCorrectInput);
		
		dropDisc(ch, c, col);
	}
	
	/**
	 * Method biljezi unos korisnika u prvu sloboodnu celiju kolone koju korisnik
	 * izabere i ispisuje ovako updated tabelu
	 * @param ch
	 * @param c
	 * @param col
	 */
	public static void dropDisc(char[][] ch, char c, int col) {
		for (int i = ch.length-1; i >= 0; i--) {
			if (ch[i][col] == '\u0000') { 
				ch[i][col] = c;
				break;
			}	
		}
		displayGrid(ch);
	}
	
	/**
	 * Method provjerava da li imaju cetiri povezana diska
	 * @param values
	 * @return
	 */
	public static boolean isConsecutiveFour(char[][] values) {
		if (isCosecutiveFourRow(values) ||
			isCosecutiveFourColumn(values) ||
			rightDiagonal(values) ||
			leftDiagonal(values))
			return true;
		return false;
	}
	
	/**
	 * Method provjerava da li neki red ima povezana cetiri diska
	 * @param values
	 * @return
	 */
	public static boolean isCosecutiveFourRow(char[][] values) {
		
		for (int i=0; i < values.length; i++) {
			int count = 1;
			for (int j=0; j < values[i].length-1; j++) {
				if ((values[i][j] == 'R' || values[i][j] == 'Y')
						&& values[i][j] == values[i][j+1]) {
					count++;
					if (count >= 4) return true;
				}
				else count = 1;
			}
		}
		return false;
	}
	
	/**
	 * Method provjerava da li neka kolona ima povezana cetiri diska
	 * @param values
	 * @return
	 */
	public static boolean isCosecutiveFourColumn(char[][] values) {
		
		for (int i=0; i < values[0].length; i++) {
			int count = 1;
			for (int j=0; j < values.length-1; j++) {
				if ((values[j][i] == 'R' || values[j][i] == 'Y')
						&& values[j][i] == values[j+1][i]) {
					count++;
					if (count >= 4) return true;
				}
				else count = 1;
			}
			
		}
		return false;
	}
	
	/**
	 * Method provjerava "desne" dijagonale
	 * @param values
	 * @return
	 */
	public static boolean rightDiagonal(char[][] values) {
		int rowIndex = values.length - 4;
		int colIndex = 0;
		while (colIndex <= values[0].length - 4) {
			int counter = 1;
			if (rowIndex > 0) {
				for (int i=rowIndex, j=colIndex; i < values.length-1; i++, j++) {
					
					if ((values[i][j] == 'R' || values[i][j] == 'Y') && 
							values[i][j] == values[i+1][j+1]) {
						counter++;
						if (counter >= 4) return true;
					}
					else counter = 1;
				}
				rowIndex--;
			}
			else if (rowIndex == 0) {
				for (int i=rowIndex, j=colIndex; j < values[rowIndex].length-1; i++, j++) {
					
					if ((values[i][j] == 'R' || values[i][j] == 'Y')
							&& values[i][j] == values[i+1][j+1]) {
						counter++;
						if (counter == 4) return true;
					}
					else 
						counter = 1;
	
					if (i == j && j == values[rowIndex].length-3) break;
						
				}
				colIndex++;
			}
		}
		return false;
	}
	
	/**
	 * Method provjerava lijeve dijagonale
	 * @param values
	 * @return
	 */
	public static boolean leftDiagonal(char[][] values) {
		int rowIndex = 0;
		int colIndex = values[rowIndex].length-4;
		while (rowIndex <= values.length - 4) {
			int counter = 1;
			if (colIndex < values[rowIndex].length-1) {
				for (int i=rowIndex, j=colIndex; j > 0;i++, j--) {
					if ((values[i][j] == 'R' || values[i][j] == 'Y')
							&& values[i][j] == values[i+1][j-1]) {
						counter++;
						if (counter >= 4) return true;
					}
					else counter = 1;
				}
				colIndex++;
			}
			
			else if (colIndex == values[rowIndex].length-1) {
				for (int i=rowIndex, j=colIndex; i < values.length-1; i++, j--) {
					if ((values[i][j] == 'R' || values[i][j] == 'Y')
							&& values[i][j] == values[i+1][j-1]) {
						counter++;
						if (counter >= 4) return true;
					}
					else counter = 1;
				}
				rowIndex++;
			}
			
		}
		return false;
	}
}
