package mini_projekat_03;

import utils.Helper;

public class TicTacToe {
	public static void main(String[] args) {
		char[][] grid = new char[3][3];		

		char playerX = 'X';
		char playerO = 'O';
		int check;
		do {
			check = play(grid, playerX);
			if (check == 1) break;
			
			if (isDraw(grid)) break;
			
			check = play(grid, playerO);
			if (check == 1) break;
			
			if (isDraw(grid)) break;
			
		} while (check < 1);
	}
	
	/**
	 * Method je entry point za igru
	 * @param grid
	 * @param player
	 * @return
	 */
	public static int play(char[][] grid, char player) {
		displayGrid(grid);
		post(grid, player);
		boolean win = checkWin(grid);
		if (win) {
			System.out.println("Igrac " + player + " je pobijedio");
			displayGrid(grid);
			return 1;
		}
		return -1;
	}
	
	/**
	 * Method ispisuje restku 
	 * @param ch
	 */
	public static void displayGrid(char[][] ch) {
		for (int i=0; i<ch.length; i++) {
			System.out.println("-------------");
			System.out.print("|");
			for (int j=0; j<ch[i].length; j++) {
				if (ch[i][j] != 0) {
					System.out.printf("%2c%2c", ch[i][j], '|');
				}
				else {
					System.out.printf("%4c", '|');
				}	
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	
	/**
	 * Method provjerava unos korisnika, ako je polje prazno, biljezi unos
	 * @param ch
	 * @param c
	 */
	public static void post(char[][] ch, char c) {	
		
		boolean posted;
		do {
			
			System.out.print("Unesite red(0, 1, 2) za igraca " + c + ": ");
			int row = checkRange();
			System.out.print("Unesite kolonu(0, 1, 2): ");
			int col = checkRange();
			posted = isPosted(ch, row, col);
			if (!posted) {
				ch[row][col] = c;
				break;
			}
		} while(posted);	
		 
	}
	
	/**
	 * Method kontrolise unos korisnika (mora biti 0-2), ako je u zadanim granicama
	 * vraca
	 * @return
	 */
	public static int checkRange() {
		Helper help = new Helper();
		int num;
		boolean isCorrect = false;
		do {
			num = help.checkIntInput();
			if (num >= 0 && num <= 2) isCorrect = true;
			else System.out.print("Unos mora bit 0-2. Ponovite unos: ");
		}while(!isCorrect);
		return num;
	}
	
	/**
	 * Method provjerava da li u polju vec ima unos i vraca
	 * @param ch
	 * @param row
	 * @param col
	 * @return
	 */
	public static boolean isPosted(char[][] ch, int row, int col) {
		if (ch[row][col] == 'X' || ch[row][col] == 'O'){
			System.out.println("Vec ima slovo, pokusajte ponovo");
			return true;
		}
		return false;
	}
	
	/**
	 * Method proverava redove, kolone i dijagonale i ako ima tri povezana(pobjeda)
	 * vraca true
	 * @param ch
	 * @return
	 */
	public static boolean checkWin(char[][] ch) {
		if (checkCol(ch) || checkRow(ch) || checkMainDiagonal(ch) || 
				checkSubDiagonal(ch)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Method provjerava resetku(matricu), ako su popunjena sva polja a nema
	 * povezanih, vraca da je nerijesen rezultat
	 * @param ch
	 * @return
	 */
	public static boolean isDraw(char[][] ch) {
		for (int i=0; i<ch.length; i++) {
			for (int j=0; j<ch[i].length; j++) {
				if (ch[i][j] != 'X' && ch[i][j] != 'O') return false;
			}
		}
		System.out.println("Rezultat je nerijesen");
		return true;
	}
	
	/**
	 * Method provjerava redove
	 * @param ch
	 * @return
	 */
	public static boolean checkRow(char[][] ch) {
	
		for (int i=0; i<ch.length; i++) {
			boolean isInOrder = true;
			for (int j=0; j < ch[i].length - 1; j++) {
				if ((ch[i][j] != 'X' && ch[i][j] != 'O') || (ch[i][j] != ch[i][j+1])) {
					isInOrder = false;
					break;
				}
			}
			if (isInOrder) return true;
		}
		return false;
		
	}
	
	/**
	 * Method provjerava kolone
	 * @param ch
	 * @return
	 */
	public static boolean checkCol(char[][] ch) {
		
		for (int i=0; i<ch.length; i++) {
			boolean isInOrder = true;
			for (int j=0; j < ch[i].length - 1; j++) {
				if ((ch[j][i] != 'X' && ch[j][i] != 'O') || (ch[j][i] != ch[j + 1][i])) {
					isInOrder = false;
					break;
				}
			}
			if (isInOrder) return true;
		}
		return false;	
	}
	
	/**
	 * Method provjerava glavnu dijagonalu
	 * @param ch
	 * @return
	 */
	public static boolean checkMainDiagonal(char[][] ch) {
		
		int counter = 1;
		for (int i=0; i < ch.length-1; i++) {
			if (ch[i][i] != 'O' && ch[i][i] != 'X') return false;
			if (ch[i][i] == ch[i+1][i+1]) counter++;
		}
		if (counter == ch.length) return true;
		return false;
	}
	
	/**
	 * Method provjerava subdijagonalu
	 * @param ch
	 * @return
	 */
	public static boolean checkSubDiagonal(char[][] ch) {
		
		int counter = 1;
		for (int i=0, j=ch.length-1; i < ch.length-1; i++, j--) {
			if (ch[i][j] != 'O' && ch[i][j] != 'X') return false;
			if (ch[i][j] == ch[i+1][j-1]) counter++;
		}
		if (counter == ch.length) return true;
		return false;
	}
}
