package zadaci_11_03_2017;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak_02 {
	public static void main(String[] args) throws Exception {

	    File currentDir = new File(args[0]);
	    
	    File[] files = currentDir.listFiles();
	    for (int i = 0; i < files.length; i++)
	    	if (files[i].isDirectory() && files[i].getName().startsWith("chapter")) {
	    		String packageStatment = "package " + files[i].getName() + ";\r\n";
	    		insertIntoFilesInDirectory(files[i], packageStatment);
	    	}
	  	}
	  
	private static void insertIntoFilesInDirectory(File directory, String line)
			throws Exception {
		File[] files = directory.listFiles();

	    for (int i = 0; i < files.length; i++)
	      if (files[i].isFile() && files[i].getName().endsWith(".java")) {
	        insertPackageStatment(files[i], line);
	      }
	}

	private static void insertPackageStatment(File file, String line)
			throws Exception {
	    StringBuilder sb = new StringBuilder(line);

	    try (
	      Scanner input = new Scanner(file);
	    ) {
	      while (input.hasNext()) 
	        sb.append("\r\n" + input.nextLine());
	    }

	    try (PrintWriter output = new PrintWriter(file)) {
	      output.printf("%s\r\n", sb.toString());
	    }
	}
}
