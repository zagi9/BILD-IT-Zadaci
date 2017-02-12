package calendar;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Reminder reminder = new Reminder();
		
		// Ukoliko postoji file, ispisuje korisniku obavijest
		if (new File("note.txt").exists()) 
			reminder.readNote("note.txt");
		
		// Kontrolna varijabla za izlazak iz petlje
		int control = 0;
		
		// U petlji program ispisuje kalendar, zatim korisniku nudi ponovni
		// unos mjeseca, zabiljeske ili izlazak
		do {
			System.out.print("Unesite godinu: ");
			int year = checkInput();
			System.out.print("Unesite mjesec: ");
			int month = checkInput();
			
			// Ukoliko nije validan unos mjeseca, korisnik se obavjestava i trazi
			// ponovljen unos
			while (month < 1 || month > 12) {
				System.out.print("Pogresan unos mjeseca, pokusajte ponovo: ");
				month = checkInput();
			}
		
			MyCalendar calendar = new MyCalendar(year, month-1, 1);
		
			calendar.displayCalendar();
			
			System.out.println();
			System.out.println("Ukoliko zelite novi mjesec, unesite 1:");
			System.out.println("Ukoliko zelite napraviti zabiljesku, unesite 2:");
			System.out.println("Ukoliko zelite zavrsiti, unesite 0:");
			control = checkInput();
			
			// U slucaju da korisnik izabere da unese zabiljesku
			if (control == 2) {
				
				String s1 = "";
				boolean validInput = true;
				do {
					System.out.println("Unesite datum, u formi: (godina mjesec dan):");
					s1 = sc.nextLine();
					
					validInput = reminder.isValidDate(s1);
					// Provjera je li unos validan
					if (!validInput)
						System.out.println("Nije validan unos datuma");
				} while (!validInput);
			
				System.out.println("Unesite kratku zabiljesku: ");
				String s2 = sc.nextLine();
				reminder.makeANote(s1, s2);
				
				// Nakon unosa program se zavrsava
				System.out.println("Vasa zabiljeska je unesena. Program se zavrsava");
				control = 0;
			}
		} while(control == 1 || control == 2);
		
	}
	
	// Method kontrolise unos korisnika i ukoliko je ispravan vraca int vrijednost
	public static int checkInput() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean isException = true;
		
		do {
			try {
				num =sc.nextInt();
				isException = false;
			} catch (InputMismatchException ime) {
				System.out.print("Unos mora biti cijeli broj ponovite unos: ");
				sc.nextLine();
			}
		} while (isException);
		
		return num;
	}
}
