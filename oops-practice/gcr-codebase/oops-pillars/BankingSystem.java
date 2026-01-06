package oops_pillars;
import java.util.*;

interface Loanable {
	void applyForLoan();
	boolean calculateLoanEligibility();
}

abstract class BankAccount {
	private String accountNumber;
	private String holderName;
	private double balance;
	
	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	abstract double calculateInterest();
	 
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
		else {
			System.out.println("Deposit Amount must be positive! ");
		}
	}
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}
		else {
			System.out.println("Invalid withdraw amount! ");
		}
	}
	
	public void displayAccountInfo() {
		System.out.println("Account Number " + accountNumber);
		System.out.println("Holder Name    " + holderName);
		System.out.println("Current Balance" + balance);
	}
}

class SavingAccount extends BankAccount implements Loanable {
	
	public SavingAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}
	
	public double calculateInterest() {
		return getBalance() * 0.04; // interst 4 percent
	}
	public void applyForLoan() {
		System.out.println("--Loan Applied--");
	}
	public boolean calculateLoanEligibility() {
		return getBalance() >= 5000; 
	}
	
}

class CurrentAccount extends BankAccount implements Loanable {
	
	public CurrentAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}
	
	public double calculateInterest() {
		return getBalance() * 0.02; // interst 2 percent
	}
	public void applyForLoan() {
		System.out.println("Loan Applied");
	}
	public boolean calculateLoanEligibility() {
		return getBalance() >= 10000; 
	}
}

public class BankingSystem {
	public static void main(String[] args) {
		
		List<BankAccount> account = new ArrayList<>();
		
		BankAccount acc1 = new SavingAccount("SBI100", "Aryan Chaturvedi", 8000);
		BankAccount acc2 = new CurrentAccount("IN200", "Pankaj Bharadwaj", 15000);
		
		account.add(acc1);
		account.add(acc2);
		
		for(BankAccount acc : account) {
			
			System.out.println("------------------");
			acc.displayAccountInfo();
			
			double interest = acc.calculateInterest();
			System.out.println("Interest Amount : " + interest);
			
			Loanable loan = (Loanable) acc;
			loan.applyForLoan();
			System.out.println("Loan Eligible : " + loan.calculateLoanEligibility());
		}
		
		
		
	}
}
