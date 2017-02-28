package zadaci_28_02_2017;

public class TestAccount {
	public static void main(String[] args) {
		
		Account account = new Account(1122, 22_000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
//		account.withdraw(30_000);
		account.deposit(3000);
		
		System.out.println("Iznos na vasem racunu je: " + 
				account.getBalance());
		System.out.println("Iznos mjesecne kamate je: " + 
				account.getMonthlyInterest());
		System.out.println("Datum kreiranja vaseg racuna je: " + 
				account.getDateCreated());
	}

}
