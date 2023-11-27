public class BookMain {
    public static void main(String[] args) {

        // Create a book instance
        Book book = new Book("Software Architecture", "Donald Flyn", 39.99);
        // Create a book view instance
        BookConsoleView view = new BookConsoleView();
        // Create a book controller instance
        BookController controller = new BookController(book, view);
        // Display the initial book details
        controller.updateView();
        // Update the book details and display the updated details
        controller.setBookTitle("Software Engineering");
        controller.setBookAuthor("Roger S. Pressman");
        controller.setBookPrice(34.99);
        controller.updateView();
    }
}