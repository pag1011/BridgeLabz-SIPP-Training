import java.util.Scanner;
public class PurchasePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double unitPrice;
		int quantity;
		
		System.out.print("Enter the unit price : ");
		unitPrice = sc.nextDouble();
		System.out.print("Enter the quantity : ");
		quantity = sc.nextInt();
		double totalPrice = unitPrice * quantity;
		
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " 
				+ quantity + " and unit price is INR " + unitPrice);
	}

}
