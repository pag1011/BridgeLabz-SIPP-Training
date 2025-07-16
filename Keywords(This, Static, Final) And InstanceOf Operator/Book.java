class Book {
    // Static variable
    static String libraryName = "City Central Library";

    // Final variable
    private final String isbn;
    private String title;
    private String author;

    // Constructor using 'this'
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library Name : " + libraryName);
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + isbn);
    }
}