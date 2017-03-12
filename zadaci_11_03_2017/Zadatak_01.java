package zadaci_11_03_2017;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class Zadatak_01 {
	public static void main(String[] args) throws Exception {
		
		String filename = args[0];
		File file = new File(filename);
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String s = br.readLine();
		
		 while (s != null) {
		
			String str = s.trim();
			if (str.charAt(0) == '{') {
				sb.append(" {");
//				if (str.length() > 1) sb.append(System.lineSeparator() + s.replace('{', ' '));
			}
			else
			sb.append(System.lineSeparator() + s);
			
			s = br.readLine();
		}

		br.close();

		PrintWriter pw = new PrintWriter(filename);
		pw.print(sb.toString());
		pw.close();	
	}

}
