package zadaci_07_03_2017;

import java.util.Scanner;
import utils.Helper;

public class TestTriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite prvu stranu trougla: ");
		double side1 = controlInput();
		System.out.print("Unesite drugu stranu trougla: ");
		double side2 = controlInput();
		System.out.print("Unesite trecu stranu trougla: ");
		double side3 = controlInput();
		System.out.print("Unesite boju trougla: ");
		String color = sc.nextLine();
		System.out.print("Da li je trougao popunjen(Unesite true ili false): ");
		boolean filled = false;
		boolean isCorrectInput = false;
		do {
			try{
				filled = sc.nextBoolean();
				isCorrectInput = true;
			}catch(Exception e) {
				System.out.print("Unos nije validan, pokusajte ponovo:");
				sc.nextLine();
			}
		}while(!isCorrectInput);
		
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		System.out.println("Povrsina trougla je: " + triangle.getArea());
		System.out.println("Obim trougla je: " + triangle.getPerimeter());
		System.out.println("Boja trougla je: " + triangle.getColor());
		System.out.println("Trougao je popunjen: " + triangle.isFilled());
		
		sc.close();
	}
	
	/**
	 * Method kontrolise unos korisnika
	 * @return
	 */
	public static double controlInput() {
		
		Helper help = new Helper();

		double side;
		boolean isCorrectInput = false;
		do {
			side = help.checkDoubleInput();
			if (side > 0) isCorrectInput = true;
			else System.out.print("Nevazeci unos, pokusajte ponovo: ");
		}while(!isCorrectInput);
		
		return side;
	}

}
