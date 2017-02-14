package zadaci_14_02_2017;

public class Zadatak_01 {
	public static void main(String[] args) {

		Helper help = new Helper();
		
		System.out.print("Unesite iznos investicije: ");
		double investmentAmount = help.checkDoubleInput();
		
		System.out.print("Unesite godisnju interesnu stopu: ");
		double annualInterestRate = help.checkDoubleInput();
		
		System.out.print("Unesite broj godina: ");
		int years = help.checkIntInput();
		
		System.out.println();
		System.out.print("Iznos investicija nakon " + years + " godina iznosice ");  
		System.out.printf("%6.2f",  futureInvestment(investmentAmount, annualInterestRate, years));
	}
	
	/**
	 * Method izracunava iznos investicija za years godina i vraca kao double vrijednost
	 * @param investmentAmount
	 * @param annualInterestRate
	 * @param years
	 * @return
	 */
	public static double futureInvestment
		(double investmentAmount, double annualInterestRate, int years) {
		
		double monthInterest = annualInterestRate / 12 / 100;
		return investmentAmount * Math.pow((1 + monthInterest) , years * 12);
	}

}
