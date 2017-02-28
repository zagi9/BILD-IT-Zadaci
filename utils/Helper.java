package utils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Klasa help sadrzi neke pomocne metode
 * @author Milan
 *
 */
public class Helper {
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * Method provjerava unos cijelog broja i ako je u redu vraca ga
	 * @return
	 */
	public int checkIntInput() {
	
		int n = 0;
		boolean isCorrect = false;
		
		while(!isCorrect) {
			try {
				n = Integer.parseInt(sc.nextLine());
				isCorrect = true;
			} catch (Exception e) {
				System.out.print("Nevazeci unos, unesite ponovo: ");
//				sc.nextLine();
			}
		}
		return n;
	}
	
	public short checkShortInput() {
		
		short n = 0;
		boolean isCorrect = false;
		
		while(!isCorrect) {
			try {
				n = Short.parseShort(sc.nextLine());
				isCorrect = true;
			} catch (Exception e) {
				System.out.print("Nevazeci unos, unesite ponovo: ");
//				sc.nextLine();
			}
		}
		return n;
	}
	
	/**
	 * Method provjerava unos long broja i ako je u redu vraca ga
	 * @return
	 */
	public long checkLongInput() {
		
		long n = 0;
		boolean isCorrect = false;
		
		while(!isCorrect) {
			try {
				n = Long.parseLong(sc.nextLine());
				isCorrect = true;
			} catch (Exception e) {
				System.out.print("Nevazeci unos, unesite ponovo: ");
//				sc.nextLine();
			}
		}
		return n;
	}
	
	/**
	 * Method provjerava unos decimalnog broja
	 * @return
	 */
	public double checkDoubleInput() {
				
		double n = 0;
		boolean isCorrect = false;
		
		while(!isCorrect) {
			try {
				n = Double.parseDouble(sc.nextLine());
				isCorrect = true;
			} catch (Exception e) {
				System.out.println("Nevazeci unos, unesite ponovo: ");
//				sc.nextLine();
			}
		}
		return n;
	}
	
	/**
	 * Method provjerava unos niza
	 * @return
	 */
	public int[] checkArrayInput() {
		
		int[] arr = new int[10];
		
		boolean isCorrect = false;
		while (!isCorrect) {
			
			try {
				for (int i=0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				isCorrect = true;
			} catch(InputMismatchException ime) {
				System.out.println("Pogresan unos. "
						+ "Jedan ili vise unosa nije cijeli broj, pokusajte ponovo");
				sc.nextLine();
				return new int[0];
			}
		}
		return arr;
		
	}
	
	public int[] checkArrayInput(int n) {
		
		int[] arr = new int[n];
		
		boolean isCorrect = false;
		while (!isCorrect) {
			
			try {
				for (int i=0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				isCorrect = true;
			} catch(InputMismatchException ime) {
				System.out.println("Pogresan unos. "
						+ "Jedan ili vise unosa nije cijeli broj, pokusajte ponovo");
				sc.nextLine();
				return new int[0];
			}
		}
		return arr;
		
	}
	
	public double[][] checkArrayInput(int row, int col) {
		
		double[][] arr = new double[row][col];
		
		boolean isCorrect = false;
		while (!isCorrect) {
			
			try {
				for (int i=0; i < arr.length; i++) {
					for (int j=0; j < arr[i].length; j++) {
						arr[i][j] = sc.nextDouble();
					}
				}
				isCorrect = true;
			} catch(InputMismatchException ime) {
				System.out.println("Pogresan unos. "
						+ "Jedan ili vise unosa nije broj");
				sc.nextLine();
				return new double[0][0];
			}
		}
		return arr;
	}
	
	public int[][] checkIntMatrix(int row, int col) {
		
		int[][] arr = new int[row][col];
		
		boolean isCorrect = false;
		while (!isCorrect) {
			
			try {
				for (int i=0; i < arr.length; i++) {
					for (int j=0; j < arr[i].length; j++) {
						arr[i][j] = sc.nextInt();
					}
				}
				isCorrect = true;
			} catch(InputMismatchException ime) {
				System.out.println("Pogresan unos. "
						+ "Jedan ili vise unosa nije cijeli broj");
				sc.nextLine();
				return new int[0][0];
			}
		}
		return arr;
	}
	
	/**
	 * Method kontrolise unos cijelih brojeva u ArrayList<Integer>
	 * @return
	 */
	public ArrayList<Integer> fillArr() {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.print("Unesite niz cijelih brojeva. 0 prekida unos: ");
		
		for (int i=0 ; ; i++) {
			try {
				list.add(sc.nextInt());
			} catch (Exception x) {
				sc.nextLine();
				return new ArrayList<>();
			}
			if (list.get(i) == 0) {
				list.remove(i);
				break;
			}
		}
		
		return list;
	}
	
	/**
	 * Method kreira pocetno slovo svake rijeci u veliko 
	 * @param s
	 * @return
	 */
	public String makeCapitalLetters(String s) {
		
		String[] str = s.split(" ");
		String s2 = "";
		
		for (int i=0; i < str.length; i++) {
			s2 += makeCapital(str[i]) + " ";
		}
		
		return s2;
 	}
	
	/**
	 * Method kreira pocetno slovo veliko
	 * @param s
	 * @return
	 */
	public String makeCapital(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		
		char ch = Character.toUpperCase(s.charAt(0));
		sb.setCharAt(0, ch);
		return sb.toString();
	}
	/**
	 * Method provjerava da li je prolijedjeni broj prost
	 * @param n
	 * @return
	 */
	public boolean isPrime(int n) {
		for (int i=2; i <= n/2; i++) 
			if (n % i == 0) return false;
		return true;
	}
	
}

