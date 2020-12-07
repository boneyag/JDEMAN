package bookShare;

public class EditBookController {
    private Book book;

    public void editBook(int pos, User user, String title, String type, String author, String ISBN) {
        book = user.getSelectedBook(pos);

        book.setTitle(title);
        book.setType(type);
        book.setAuthor(author);
        book.setISBN(ISBN);
    }
}

