package zadaci_11_03_2017;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;

public class Zadatak_04 {
	public static void main(String[] args) throws Exception {
		
		URL url = null;
		try {
			url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
		}catch (MalformedURLException mue) {
			mue.printStackTrace();
		}
		
		Scanner sc = new Scanner(url.openStream());
		int count = 1;
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println("Takmicar " + count + ":");
			processScore(s);
			count++;
		}
		
		sc.close();
	}
	
	public static void processScore(String s) {
		
		String[] str = s.split(" ");
		int count = str.length;
		int total = 0;
		for (int i=0; i < str.length; i++) {
			total += Integer.parseInt(str[i]);
		}
		
		System.out.println("Ukupan skor je " + total);
		System.out.println("Prosijecan skor je " + (1.0 * total / count));
	}

}
