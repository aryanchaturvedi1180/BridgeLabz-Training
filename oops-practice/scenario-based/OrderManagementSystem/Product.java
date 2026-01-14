package scenario_based.OrderManagementSystem;

class Product {
	private int productId;
	private String name;
	private double price;
	
	Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void displayProduct() {
		System.out.println("ProductId: " + productId);
		System.out.println("Product Name: " + name);
		System.out.println("Product Price: " + price);
	}

}
