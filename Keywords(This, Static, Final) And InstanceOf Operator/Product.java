class Product {
    // Static variable shared by all products
    static double discount = 10.0; 

    // Final variable for unique product ID
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this'
    Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID : " + productID);
        System.out.println("Product Name : " + productName);
        System.out.println("Price per Unit : Rs." + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Discount : " + discount + "%");
        double total = price * quantity * (1 - discount / 100);
        System.out.println("Total After Discount: Rs." + total);
    }
}