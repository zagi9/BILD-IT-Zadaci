package zadaci_13_03_2017;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.io.IOException;

public class Zadatak_01 {
	public static void main(String[] args) {
		
		Scanner sc = null;
		double assistantSalaryTotal = 0;
		int assistants = 0;
		double associateSalaryTotal = 0;
		int associates = 0;
		double fullProfesorsSalaryTotal = 0;
		int fullProfesors = 0;
		
		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			sc = new Scanner(url.openStream());
			while (sc.hasNext()) {
				String s = sc.nextLine();
				String[] str = s.split(" ");
				for (int i=0; i < str.length; i++) {
					if (str[i].equals("assistant")) {
						assistantSalaryTotal += Double.parseDouble(str[i+1]);
						assistants++;
					}
					else if (str[i].equals("associate")) {
						associateSalaryTotal += Double.parseDouble(str[i+1]);
						associates++;
					}
					else if (str[i].equals("full")) {
						fullProfesorsSalaryTotal += Double.parseDouble(str[i+1]);
						fullProfesors++;
					}
				}
			}
		}catch (MalformedURLException me) {
			me.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println("Ukupna plata za sve asistente: " + assistantSalaryTotal);
		System.out.printf("Prosijecna plata za sve asistente: %8.2f\n", (assistantSalaryTotal / assistants));
		
		System.out.println("Ukupna plata za sve saradnike: " + associateSalaryTotal);
		System.out.printf("Prosijecna plata za sve saradnike: %8.2f\n",  (associateSalaryTotal / associates));
		
		System.out.println("Ukupna plata za sve profesore: " + fullProfesorsSalaryTotal);
		System.out.printf("Prosijecna plata za sve profesore: %8.2f\n", (fullProfesorsSalaryTotal / fullProfesors));
		
		double totalStaffSalary = assistantSalaryTotal + associateSalaryTotal + fullProfesorsSalaryTotal;
		int totalStaff = assistants + associates + fullProfesors;
		
		System.out.println("Ukupna plata: " + totalStaffSalary);
		System.out.printf("Prosijecna plata: %8.2f", (totalStaffSalary / totalStaff));
		
		sc.close();
	}
}
