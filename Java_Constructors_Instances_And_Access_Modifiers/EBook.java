public class EBook extends BookLibrary{
	
	public EBook(int ISBN, String title, String author) {
		super(ISBN, title, author);
	}
	
	public void displayEBook() {
        System.out.println("\n---- EBook Details ----");
        System.out.println("Accessing from EBook - ISBN : " + ISBN);
        System.out.println("Accessing from EBook - Title : " + title);
        System.out.println("Accessing from EBook - Author : " + getAuthor());
	}
}

