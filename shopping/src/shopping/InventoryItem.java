package shopping;

public class InventoryItem extends Item{

	private int quantity;
	InventoryItem(int id, String name, Double price, int quantity) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
		this.quantity = quantity;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder(super.toString());
		stringBuilder.append(" " + String.valueOf(quantity));
		return stringBuilder.toString();
	}

}
