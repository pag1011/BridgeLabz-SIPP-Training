public class BookLibrary {
	public int ISBN;
	protected String title;
	private String author;
	
	//Constructor
	public BookLibrary(int ISBN, String title, String author) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void display() {
		System.out.println("\n---- Book Details ----");
		System.out.println("ISBN : "+ISBN);
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
	}
}
