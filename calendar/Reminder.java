package calendar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Klasa Reminder radi sa file
 */
public class Reminder {
	
	// Method kreira file i ispisuje unos korisnika
	public void makeANote(String s1, String s2) {
		
		Path path = Paths.get("note.txt");
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			writer.write(s1);
			writer.newLine();
			writer.write(s2);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	// Method cita iz file_a, ispisuje korisniku obavijest i brise file
	public void readNote(String s) {
		
		String date = "";
		String note = "";
		
		Path path = Paths.get(s);
		
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			// reader "cita" linije i dodjeljuje ih String varijablama date i note
			date = reader.readLine();
			note = reader.readLine();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		// Naredni dio koda uzima date String pravi niz Stringova i parsuje stringove
		// u numericke vrijednosti 
		String[] str = date.split(" ");
		int year = Integer.parseInt(str[0]);
		int month = Integer.parseInt(str[1]);
		int day = Integer.parseInt(str[2]);
		
		// parsovane vrijednosti saljemo kao argumente u MyCalendar konstruktor
		MyCalendar myCalendar = new MyCalendar(year, month-1, day);
		myCalendar.displayCalendar();
		
		// Ispis poruke korisniku
		System.out.println("Vasa napomena za datum "+ myCalendar.getDay() + ". " +
				myCalendar.getMonth() + ". " + myCalendar.getYear() + " glasi: ");
		System.out.println(note);
		System.out.println();
		// brisanje file_a nakon ispisa
		new File("note.txt").delete();
	}
	
	// Method provjerava korisnikov unos datuma u file
	public boolean isValidDate(String s) {
		
		String[] str = s.split(" ");
		
		if (str.length != 3) return false;
		
		for (int i=0; i < str.length; i++)
			if (!isNumeric(str[i]))
				return false;
		
		int month = Integer.parseInt(str[1]);
//		int day = Integer.parseInt(str[2]);
		
		if (month < 1 || month > 12) return false;
		
		if (!isValidDay(str[1], str[2])) return false;
		
		return true;
	}
	
	// Method provjerava da li je onos numericki
	private boolean isNumeric(String s) {
		
		for (int i=0; i < s.length(); i++) 
			if(!Character.isDigit(s.charAt(i)))
				return false;
		return true;
						
	}
	
	// Method provjerava da li je korisnik unio validan dan
	private boolean isValidDay(String month, String day) {
		
		int m = Integer.parseInt(month);
		int d = Integer.parseInt(day);
		
		GregorianCalendar calendar = new GregorianCalendar(2017, m, 1);
		int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	
		if (d < 1 || d > numberOfDays) {
			System.out.println("Pogresan unos dana");
			return false;
		}
		return true;
	}
	
}
