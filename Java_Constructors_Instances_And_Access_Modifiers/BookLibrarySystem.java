import java.util.Scanner;

public class BookLibrarySystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String title, author;
		int ISBN;
		
		System.out.println("Enter the ISBN : ");
		ISBN = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter book title : ");
		title = sc.nextLine();
		System.out.println("Enter the author name : ");
		author = sc.nextLine();
		
		// Create outer class object
        BookLibrary booklibrary = new BookLibrary(ISBN, title, author);
        booklibrary.display();
        sc.nextLine();
        
        EBook ebook = new EBook(ISBN, title, author);
        System.out.println("Enter the updated name of author : ");
        ebook.setAuthor(sc.nextLine());
        System.out.println("Updated Author : " + ebook.getAuthor());
        ebook.displayEBook();
	}
}
