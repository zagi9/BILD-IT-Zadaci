package zadaci_11_03_2017;

import java.io.File;
import java.io.PrintWriter;

public class Zadatak_05 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("bigfile.txt");
		PrintWriter pw = new PrintWriter(file);
		
		for (int i=1; i <= 1000; i++) {
			String rank = randomizeRank();
			double salary = randomizeSalary(rank);
			pw.println("FirstName" + i + " LastName" + i + " " + rank + " " + salary);
		}
		
		pw.close();
	}
	
	public static String randomizeRank() {
		
		String[] s = {"assistant", "associate", "full"};
		int index = (int)(Math.random() * 3);
		return s[index];
	}
	
	public static double randomizeSalary(String s) {
		
		double salary = 0;
		
		if (s.equals("assistant")) { 
			salary =  50_000 + (Math.random() * (80_000 - 50_000 + 1));
		}
		
		else if (s.equals("associate")) { 
			salary =  60_000 + (Math.random() * (110_000 - 60_000 + 1));
		}
		
		else { 
			salary =  75_000 + (Math.random() * (130_000 - 75_000 + 1));
		}
		
		return (int)(salary * 100) / 100.0;
	}

}
