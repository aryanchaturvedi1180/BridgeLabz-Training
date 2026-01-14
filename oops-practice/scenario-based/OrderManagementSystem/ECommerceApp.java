package scenario_based.OrderManagementSystem;

public class ECommerceApp {
	public static void main(String[] args) {
		
		Product p1 = new Product(110, "Shirt", 1000);
		Product p2 = new Product(210, "Jacket", 1800);
		
		System.out.println("Product 1 details: ");
		p1.displayProduct();
		System.out.println("\nProduct 2 details: ");
		p2.displayProduct();
		
		Customer c = new Customer(1, "Aryan");
		Order o = new Order(348, p1, c);
		
		
		Payment payment= new UPIPayment();
		
		System.out.println("\nOrder Placement");
		o.placeOrder(payment);
		
		System.out.println("\nOrder Tracking");
		o.trackOrder();
		
		System.out.println("\nOrder Cancellation");
		o.cancelOrder();
	}

}
