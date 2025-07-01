import java.util.Scanner;

class Books {
	String title;
	String author;
	double price;
	
	//Default Constructor
	Books() {
		this.title = "";
		this.author = "";
		this.price = 0.0;
	}
	
	//Parameterized Constructor
	Books(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//Method to display details
	void display() {
		System.out.println("Title of the book : " + title);
		System.out.println("Author of the book : " + author);
	    System.out.println("Price of the book : " + price);
	}

}


public class Book {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String title, author;
		double price;
		
		System.out.println("Enter the title of the book : ");
		title = sc.nextLine();
		System.out.println("Enter the author of the book : ");
		author = sc.nextLine();
		System.out.println("Enter the price of the book : ");
		price = sc.nextDouble();
		
		//Create an object for book class
		Books b = new Books(title, author, price);
		
		//Display the details
		b.display();
	}

}
