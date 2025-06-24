
import java.util.Scanner;

class Book {
	String title;
	String author;
	double price;
	
	//Constructor
	Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//Method to display book details
	void display() {
		System.out.println("Title of the book : " + title);
		System.out.println("Book Author name  : " + author);
		System.out.println("Price of the book : Rs." + price);
	}
}


public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String title, author;
		double price;
		
		//Taking input for user
		System.out.println("Enter the book name : ");
		title = sc.nextLine();
		System.out.println("Enter the author's name : ");
		author = sc.nextLine();
		System.out.println("Enter the price of the book : ");
		price = sc.nextDouble();
		
		//Create book object for input user 
		Book book = new Book(title, author, price);
		
		//Display book details
		book.display();
	}

}
