import java.util.Scanner;

class Products {
	String productName;
    double price;
    //Class Variable
    static int totalProducts = 0;
    
    //Constructor
    Products(String productName, double price) {
        this.productName = productName;
        this.price = price;
        //Increase the class variable whenever a product is created
        totalProducts++; 
    }
    
    // Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price : Rs." + price);
    }

    // Class method to display total number of products
    static void displayTotalProducts() {
        System.out.println("Total Products Created : " + totalProducts);
    }
}

public class Product {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int prod;
	    
		System.out.println("Enter the number of products to create : ");
	    prod = sc.nextInt();
	    sc.nextLine();
	    
	    Products[] product = new Products[prod];
	    
	    for(int i = 0; i < prod; i++) {
	    	System.out.println("Enter the product name " + (i + 1) + " : ");
		    String name = sc.nextLine();
		    System.out.println("Enter the product price " + (i + 1) + " : ");
		    double price = sc.nextDouble();
		    sc.nextLine();
		    
		    product[i] = new Products(name, price);
	    }
	    System.out.println("\n--- Product Details ---");
        for (Products p : product) {
            p.displayProductDetails();
        }
     // Display total number of products
        Products.displayTotalProducts();
	}

}
