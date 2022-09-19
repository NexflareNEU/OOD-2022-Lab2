package shopping;

public class Item {
	public static final String REVISION = "1";

	private int id;
	private Double price;
	private String name;
	
	Item(int id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}

//	public void setPrice(Double price) {
//		this.price = price;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	
	public String toString() {
		String itemString = getName() + " " + getPrice().toString();
		return itemString;
	}

	public static String demo() {
		Inventory inventory = new Inventory();
		System.out.print(inventory.getInventory());
//		inventory.getItems();
//		Cart cart = new Cart();
//		cart.addItem();
		return "Hello Shopper";
//		print
	}
}

/**
* Mango 1
* 16
* 
**/