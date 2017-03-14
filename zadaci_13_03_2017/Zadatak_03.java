package zadaci_13_03_2017;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

public class Zadatak_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite godinu(2001-2010): ");
		int	year = sc.nextInt();
		System.out.print("Unesite pol(M ili F): ");
		char gender = sc.next().charAt(0);
		System.out.print("Unesite ime: ");
		String name = sc.next();
				
		
		sc.close();
		
		File file = findFile(year);
		
		if (file == null) {
			System.out.println("Pogresan unos");
			System.exit(0);
		}
		displayRank(file, year, gender, name);
	}
	
	/**
	 * Metod prolazi kroz file i ispisuje rezultat pretrage
	 * @param file
	 * @param year
	 * @param gender
	 * @param name
	 */
	public static void displayRank(File file, int year, char gender, String name) {
		
		String s = "";
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
				
			while ((s = br.readLine()) != null) {
				String[] arr = containsName(s, name, gender);
				if (gender == 'M' && arr[0].equals(name)) {
					System.out.println("Ime " + name + ", " + year + 
							". godine, rangirano je #" + getRank(s));
					return;
				}
				if (gender == 'F' && arr[1].equals(name)) {
					System.out.println("Ime " + name + ", " + year + 
							". godine, rangirano je #" + getRank(s));
					return;
				}
					
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Ime " + name + " nije rangirano "  + year + ". godine");
		
	}
	
	/**
	 * Metod izdvaja imena iz stringa s i vraca kao niz stringova 
	 * @param s
	 * @param name
	 * @param gender
	 * @return
	 */
	private static String[] containsName(String s, String name, char gender) {
		
		String str = "";
		
		for (int i=0; i < s.length(); i++)  {
			if (Character.isLetter(s.charAt(i)))
				str += s.charAt(i);
		}
		
		String boysName = "";
		String girlsName = "";
		for (int i=0; i < str.length(); i++) {
			boysName += str.charAt(i);
			if (Character.isUpperCase(str.charAt(i + 1))) {
				girlsName = str.substring(i+1);
				break;
			}	
		}
	
		return new String[]{boysName, girlsName};
	}
	
	/**
	 * Metod vraca rank kao string
	 * @param s
	 * @return
	 */
	private static String getRank(String s) {
		
		String rank = "";
		for (int i=0; i < 4; i++) {
			if (Character.isDigit(s.charAt(i)))
				rank += s.charAt(i);
		}
		return rank;
	}	
	
	/**
	 * Metod trazi file i ako nadje vraca, ako ne vraca null
	 * @param year
	 * @return
	 */
	private static File findFile(int year) {
		
		File newFile = null;
			
		File file = new File("babynameranking");
		File[] files = file.listFiles();
		for (int i=0; i < files.length; i++) {
		
			if (files[i].getName().equals("babynamesranking" + year + ".txt")) {
				return new File(files[i].getPath());
			}
		}
		return newFile;
	}	
}


