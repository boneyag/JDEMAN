package bookShare;

public class AddBookController implements BookScanner{
    private Book book;

    public void addBook(String title, String type, String author, String ISBN, User owner) {
        if (scan() != null){
            book = scan();
        }
        else {
            book = new Book(title, type, author, ISBN);
        }
        owner.addBook(book);
    }

    @Override
    public Book scan(){
        // scan the barcode and return a book object
        String title = "title";
        String type = "novel";
        String author = "author";
        String ISBN = "1111111111111";
        Book scannedBook = new Book(title, type, author, ISBN);
        return scannedBook;
    }
}
