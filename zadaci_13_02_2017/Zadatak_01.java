package zadaci_13_02_2017;


public class Zadatak_01 {
	
	public static void main(String[] args) {
		
		// Klasa Help sadrzi pomocne methode.
		Help help = new Help();
	
		System.out.print("Unesite mjesecni unos stednje: ");
		double amount = help.checkDoubleInput();
		System.out.print("Na koliko mjeseci: ");
		int month = help.checkIntInput();
		
		System.out.print("Za " + month + " mjeseci,"
				+ " uz kamatnu stopu od 5% iznos na vasem racunu ce biti ");
		
		System.out.printf("%7.2f", calculateSavingAmount(amount, month, 5));
	
	}
	
	/**
	 * Method izracunava i vraca kolicinu ustedjenog novca nakon odredjenog broja mjeseci 
	 * @param monthAmount 
	 * @param numberOfMonths
	 * @param annualInterestRate
	 * @return
	 */
	public static double calculateSavingAmount(double monthAmount, int numberOfMonths,
			double annualInterestRate) {
		
		double monthlyInterestRate = annualInterestRate / 100 / 12;
		
		double afterNthMonth = 0;
		
		for (int i=0; i < numberOfMonths; i++) {
			
			afterNthMonth = (monthAmount + afterNthMonth) * (1 + monthlyInterestRate);
		}
		return afterNthMonth;	
	}
}
