package bookShare;

public class Book extends Publication {
    private String author;
    private String ISBN;
    private String description;

    public Book(String title, String type, String author, String ISBN) {
        super(title, type);
        this.author = author;
        this.ISBN = ISBN;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
