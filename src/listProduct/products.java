package listProduct;

public class products {
	
	private String name;
	private Double price;
	private Integer quantity;
	
	public products(String name, String price, String quantity) {
		this.name = name;
		this.price = Double.parseDouble(price);
		this.quantity = Integer.parseInt(quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}
	
	public double totalValue() {
		return price * quantity;
	}
	
	public String toString() {
		return "name of product: " + name + " Total: " + String.format("%.2f", totalValue());
	}

}
