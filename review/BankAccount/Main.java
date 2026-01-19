package review.BankAccount;

public class Main {
	public static void main(String[] args) {
		
		BankAccount savings = new SavingAccount("12345", 101, 1000.0);
        System.out.printf("%.2f%n", savings.calculateFee()); 

        BankAccount savings2 = new SavingAccount("11111",201, 500.0);
        System.out.printf("%.2f%n", savings2.calculateFee());

        BankAccount checking1 = new CheckingAccount("22222", 301,1500.0);
        System.out.printf("%.2f%n", checking1.calculateFee());

        BankAccount checking2 = new CheckingAccount("33333", 401, 500.0);
        System.out.printf("%.2f%n", checking2.calculateFee());
	}
}
/*
Savings balance 500 → 2.50 
Checking balance 1500 → 0.00 
Checking balance 500 → 1.00
*/