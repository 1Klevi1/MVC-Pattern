public class BookController {
    private Book model;
    private BookConsoleView view;
    public BookController(Book model, BookConsoleView view) {
        this.model = model;
        this.view = view;
    }
    // Methods to interact with the model
    public String getBookTitle() { return model.getTitle(); }
    public void setBookTitle(String title) { model.setTitle(title); }
    public String getBookAuthor() { return model.getAuthor(); }
    public void setBookAuthor(String author) { model.setAuthor(author); }
    public double getBookPrice() { return model.getPrice(); }
    public void setBookPrice(double price) { model.setPrice(price); }
    // Method to update the view
    public void updateView() {
        view.printBookDetails(model.getTitle(), model.getAuthor(),
                model.getPrice());
    }
}
