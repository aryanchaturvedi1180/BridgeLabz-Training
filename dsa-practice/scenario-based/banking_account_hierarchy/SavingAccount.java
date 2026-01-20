package scenario.banking_account_hierarchy;

public class SavingAccount extends BankAccount {

    public SavingAccount(String holderName, int accNumber, double balance) {
        super(holderName, accNumber, balance);
    }

    @Override
    public double calculateFee() {
        return getBalance() * 0.005; // 0.5%
    }
}
