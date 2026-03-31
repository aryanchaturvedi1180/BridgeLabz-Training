package scenario_based.OrderManagementSystem;

public abstract class CardPayment implements Payment{
	public void makePayment(double amount) throws PaymentFailedException {
		if(amount <= 0) {
			throw new PaymentFailedException("Card Payment Failed!");
		}
		System.out.println("Payment of ₹" + amount + " done using Card");
	}
}
