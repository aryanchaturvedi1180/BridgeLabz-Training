package scenario_based.OrderManagementSystem;

public class Order {
	private int orderId;
	private Product product;
	private Customer customer;
	private String status = "Placed";
	
	Order(int orderId, Product product, Customer customer) {
        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
    }
	
	public void cancelOrder() {
		status = "Cancelled";
		System.out.println("Order cancelled!");
	}
	
	void placeOrder(Payment payment) {
        try {
            payment.pay(product.getPrice());
            System.out.println("Order placed successfully");
        } catch (PaymentFailedException e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }
    }
	
	public void trackOrder() {
		System.out.println("Order status: " + status);
	}
	
	public double getOrderAmount() {
		return product.getPrice();
	}
	
}
