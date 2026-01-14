import java.util.Scanner;

public class ShoppingCartSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input for first product
        System.out.print("Enter Product ID : ");
        String id1 = sc.nextLine();
        System.out.print("Enter Product Name : ");
        String name1 = sc.nextLine();
        System.out.print("Enter Price : ");
        double price1 = sc.nextDouble();
        System.out.print("Enter Quantity : ");
        int qty1 = sc.nextInt();
        sc.nextLine(); 

        Product p1 = new Product(id1, name1, price1, qty1);

        // Input for second product
        System.out.print("\nEnter another Product ID : ");
        String id2 = sc.nextLine();
        System.out.print("Enter Product Name : ");
        String name2 = sc.nextLine();
        System.out.print("Enter Price : ");
        double price2 = sc.nextDouble();
        System.out.print("Enter Quantity : ");
        int qty2 = sc.nextInt();

        Product p2 = new Product(id2, name2, price2, qty2);

        // Optional: update discount
        System.out.print("\nEnter new discount percentage to apply for all products : ");
        double newDiscount = sc.nextDouble();
        Product.updateDiscount(newDiscount);

        // Displaying product details using instanceof operator
        System.out.println("\n--- Product Details ---");

        if (p1 instanceof Product) {
            p1.displayProductDetails();
        }

        System.out.println();

        if (p2 instanceof Product) {
            p2.displayProductDetails();
        }
	}
}
