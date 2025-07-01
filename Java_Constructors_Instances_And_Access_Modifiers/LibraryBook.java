import java.util.Scanner;

class LibraryBooks {
	String title;
	String author;
	double price;
	int availability;
	
	//Constructor
	LibraryBooks(String title, String author, double price, int availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
	
	//Method to borrow a book
    boolean borrowBook() {
        if (availability > 0) {
            availability--;
            System.out.println("Borrowed book successfully!");
            return true;
        } else {
            System.out.println("Currently not available.");
            return false;
        }
    }
    
    //Method to display the details
    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : Rs." + price);
        System.out.println("Available : " + availability);
    }
}

public class LibraryBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String title, author;
		double price;
		int availability;
		
		System.out.println("Enter the book title : ");
		title = sc.nextLine();
		System.out.println("Enter the book author name : ");
		author = sc.nextLine();
		System.out.println("Enter the book price : ");
		price = sc.nextDouble();
		System.out.println("Enter the number of availabile books : ");
		availability = sc.nextInt();
		
		//Create an object for class 
		LibraryBooks book = new LibraryBooks(title, author, price, availability);
		
		System.out.print("\nDo you want to borrow the book? (yes/no): ");
        sc.nextLine();
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            book.borrowBook();
        }

        book.display();
	}

}
