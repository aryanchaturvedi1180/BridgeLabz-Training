package scenario.banking_account_hierarchy;

public class Main {
	public static void main(String[] args) {

        BankAccount saving1 = new SavingAccount("abc", 12345, 500);
        System.out.printf("%.2f%n", saving1.calculateFee()); // 2.50

        BankAccount checking1 = new CheckingAccount("abc", 12346, 1500);
        System.out.printf("%.2f%n", checking1.calculateFee()); // 0.00

        BankAccount checking2 = new CheckingAccount("abc", 12347, 500);
        System.out.printf("%.2f%n", checking2.calculateFee()); // 1.00
    }

}
