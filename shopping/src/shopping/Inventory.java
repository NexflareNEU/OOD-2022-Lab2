package shopping;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
	private Map<String, InventoryItem> inventoryMap;
	
	public Inventory() {
		inventoryMap = new HashMap();
		addItem(1, "Choclate", 1.29, 20);
		addItem(2, "Battery", 1.25,100);
		addItem(3, "Onion", 2.0, 10);
		addItem(4, "Capsicum", 1.0, 12);
		addItem(5, "Chicken", 6.0, 9);
		addItem(6, "Masala", 3.0, 50);
		addItem(7, "Oil", 4.75, 10);
	}
	
	private void addItem(int id, String name, Double value, int quantity) {
		InventoryItem item = new InventoryItem(id, name, value,quantity);
		inventoryMap.put(name, item);
	}
	
	public String getInventory() {
		StringBuilder inventoryString = new StringBuilder("");
		for(String itemName : inventoryMap.keySet()) {
			inventoryString.append(inventoryMap.get(itemName).toString() + "\n");
		}
		return inventoryString.toString();
	}
 }
