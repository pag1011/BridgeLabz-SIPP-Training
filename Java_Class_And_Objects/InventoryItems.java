
import java.util.Scanner;

class Item {
	int itemCode;
	String itemName;
	double price;
	
	//Constructor
	Item(int code, String name, double price) {
		this.itemCode = code;
		this.itemName = name;
		this.price = price;
	}
	
	//Method to display item details
	void display() {
		System.out.println("Item Code  : " + itemCode);
		System.out.println("Item Name  : " + itemName);
		System.out.println("Item Price : " + price);
	}
	
	//Method to calculate total cost of given quantity
	double calculateTotalPrice(int quantity) {
		return price * quantity;
	}
}

public class InventoryItems {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int itemCode;
		String itemName;
		double price;
		int quantity;
		
		System.out.println("Enter the item code : ");
		itemCode = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the item name : ");
		itemName = sc.nextLine();
		
		System.out.println("Enter the item price : ");
		price = sc.nextDouble();
		
		//Create item object for input user
		Item item = new Item(itemCode, itemName, price);
		
		//Display item details
		item.display();
		
		//Initialize quantity
		System.out.println("Enter the quantity of the item : ");
		quantity = sc.nextInt();
		
		double totalCost = item.calculateTotalPrice(quantity);
		System.out.println("Total cost for " + quantity + 
				" items : Rs." + totalCost);
	}

}
