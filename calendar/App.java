package calendar;

import java.io.File;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Reminder reminder = new Reminder();
		
		// Ukoliko postoji file, ispisuje korisniku obavijest
		if (new File("note.txt").exists()) 
			reminder.readNote("note.txt");
		
		Scanner sc = new Scanner(System.in);
		
		// Kontrolna varijabla za izlazak iz petlje
		int control = 0;
		
		// U petlji program ispisuje kalendar, zatim korisniku nudi ponovni
		// unos mjeseca, zabiljeske ili izlazak
		do {
			System.out.print("Unesite godinu: ");
			int year = sc.nextInt();
			System.out.print("Unesite mjesec: ");
			int month = sc.nextInt();
			
			// Ukoliko nije validan unos mjeseca, korisnik se obavjestava i trazi
			// ponovljen unos
			while (month < 1 || month > 12) {
				System.out.print("Pogresan unos mjeseca, pokusajte ponovo: ");
				month = sc.nextInt();
			}
		
			MyCalendar calendar = new MyCalendar(year, month-1, 1);
		
			calendar.displayCalendar();
			
			System.out.println();
			System.out.println("Ukoliko zelite novi mjesec, unesite 1:");
			System.out.println("Ukoliko zelite napraviti zabiljesku, unesite 2:");
			System.out.println("Ukoliko zelite zavrsiti, unesite 0:");
			control = sc.nextInt();
			
			sc.nextLine();
			
			// U slucaju da korisnik izabere da unese zabiljesku
			if (control == 2) {
				
				String s1 = "";
				do {
					System.out.println("Unesite datum (godina mjesec dan):");
					s1 = sc.nextLine();
					// Provjera je li unos validan
					if (!reminder.isValidDate(s1))
						System.out.println("Nije validan unos datuma");
				} while (!reminder.isValidDate(s1));
			
				System.out.println("Unesite kratku zabiljesku: ");
				String s2 = sc.nextLine();
				reminder.makeANote(s1, s2);
				
				// Nakon unosa program se zavrsava
				control = 0;
			}
		} while(control == 1 || control == 2);
		
		sc.close();	
	}
}
