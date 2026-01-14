package scenario_based.OrderManagementSystem;

public class UPIPayment implements Payment{
	public void makePayment(double amount) throws PaymentFailedException {
		if(amount <= 0) {
			throw new PaymentFailedException("UPI Payment Failed! (minimun ₹50)");
		}
		System.out.println("Payment of ₹" + amount + " done using UPI");
	}

	@Override
	public void pay(double amount) throws PaymentFailedException {
		// TODO Auto-generated method stub
		
	}
}
