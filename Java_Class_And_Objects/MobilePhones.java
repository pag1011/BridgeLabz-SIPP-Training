
import java.util.Scanner;

class MobilePhone {
	String brand;
	String model;
	double price;
	
	//Constructor
	MobilePhone(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	//Method to display mobile phones details
	void display() {
		System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : Rs." + price);
	}
}

public class MobilePhones {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String brand, model;
		double price;
		
		//Take input user
		System.out.println("Enter the brand of the mobile phone : ");
		brand = sc.nextLine();
		System.out.println("Enter the model of the mobile phone : ");
		model = sc.nextLine();
		System.out.println("Enter the price of the mobile phone : ");
		price = sc.nextDouble();
		
		//Create phone object for input user
		MobilePhone phone = new MobilePhone(brand, model, price);
		
		//Display mobile phone details
		phone.display();
	}
}
