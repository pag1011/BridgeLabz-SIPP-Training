import java.util.Scanner;

public class LibraryMangementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input for first book
        System.out.print("Enter Book Title : ");
        String title1 = sc.nextLine();
        System.out.print("Enter Author Name : ");
        String author1 = sc.nextLine();
        System.out.print("Enter ISBN : ");
        String isbn1 = sc.nextLine();

        Book book1 = new Book(title1, author1, isbn1);

        // Input for second book
        System.out.print("\nEnter another Book Title : ");
        String title2 = sc.nextLine();
        System.out.print("Enter another Author Name : ");
        String author2 = sc.nextLine();
        System.out.print("Enter another ISBN : ");
        String isbn2 = sc.nextLine();

        Book book2 = new Book(title2, author2, isbn2);

        // Display library name using static method
        System.out.println("\n--- Library Info ---");
        Book.displayLibraryName();

        // Use instanceof before displaying book details
        System.out.println("\n--- Book 1 Details ---");
        if (book1 instanceof Book) {
            book1.displayDetails();
        }

        System.out.println("\n--- Book 2 Details ---");
        if (book2 instanceof Book) {
            book2.displayDetails();
        }
	}
}
