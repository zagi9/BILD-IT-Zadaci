package zadaci_28_02_2017;

import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		
		dateCreated = new Date();
	}
	
	public Account(int id, double balance) {
		
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	/**
	 * Method izracunava i vraca iznos mjesecne kamate
	 * @return
	 */
	public double getMonthlyInterest() {
		return (getAnnualInterestRate() / 12 / 100) * balance;
	}
	
	/**
	 * Method "isplacuje korisnika" ili ga obavjestava da nema dovoljno 
	 * sredstava na racunu 
	 * @param amount
	 * @return
	 */
	public double withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return amount;
		}
		
		System.out.println("Nemate dovoljno sredstava");
		System.out.println("Trenutno statnje vaseg racuna je " + balance);
		return 0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}
