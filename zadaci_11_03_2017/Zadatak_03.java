package zadaci_11_03_2017;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak_03 {
	public static void main (String[] args) throws Exception {
		
		URL url = null;
		try {
			url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Scanner sc = new Scanner(url.openStream());
		
		int count = 0;
		
		while(sc.hasNext()) {
			
			count++;
			sc.next();
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
