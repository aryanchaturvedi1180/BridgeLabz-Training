package scenario_based.OrderManagementSystem;

public abstract class WalletPayment implements Payment{
	public void makePayment(double amount) throws PaymentFailedException {
		System.out.println("Payment of ₹" + amount + " done using Card");
	}
}