import java.util.Scanner;

class CarRentalSystem {
	String customerName;
    String carModel;
    int rentalDays;
    int ratePerDay;
    
    //Constructor
    CarRentalSystem(String customerName, String carModel, int rentalDays, int ratePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.ratePerDay = ratePerDay;
    }
    
    //Method to calculate the total cost
    double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }
    
    //Method to display the details
    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model : " + carModel);
        System.out.println("Rental Days : " + rentalDays);
        System.out.println("Total Cost : Rs." + calculateTotalCost());
    }
}


public class CarRental {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String customerName, carModel;
	    int rentalDays, ratePerDay;
	    
	    System.out.println("Enter the customer name : ");
	    customerName = sc.nextLine();
	    System.out.println("Enter the car model : ");
	    carModel = sc.nextLine();
	    System.out.println("Enter number of rental days : ");
	    rentalDays = sc.nextInt();
	    System.out.println("Enter the rate of a day : ");
	    ratePerDay = sc.nextInt();
	    
	    //Create an object
	    CarRentalSystem car = new CarRentalSystem(customerName, carModel, rentalDays, ratePerDay);
	    
	    //Display the details
	    System.out.println("\n---- Customers Details ----");
	    car.display();
	}

}
