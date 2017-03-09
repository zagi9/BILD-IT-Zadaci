package zadaci_09_03_2017;

import zadaci_07_03_2017.Loan;

public class Zadatak_05 {
	public static void main(String[] args) {
		
		Loan loan = new Loan(1.5, 4, 10000);
		System.out.println(loan);
		
		Loan loan2 = null;
		
		try {
			loan2 = new Loan(0, 4, 10000);
		}catch(IllegalArgumentException iae) {
			System.out.println("IllegalArgumentException, caught");
			System.out.println("Try to create object with illegal argument");
		}
		System.out.println(loan2);
		
		try {
			loan.setAnnualInterestRate(0);
		}catch(IllegalArgumentException iae) {
			System.out.println("IllegalArgumentException, caught");
			System.out.println("Try to set AIR to illegal argument");
		}
		System.out.println();
		
		try {
			loan.setNumberOfYears(0);
		}catch(IllegalArgumentException iae) {
			System.out.println("IllegalArgumentException, caught");
			System.out.println("Try to set number of years to illegal argument");
		}
	}

}
