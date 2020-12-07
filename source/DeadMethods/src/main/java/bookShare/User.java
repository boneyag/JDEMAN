package bookShare;

import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private String telephoneNumber;
    private ArrayList<Book> ownedBooks;
    private ArrayList<Book> borrowedBooks;

    public User(String name, String email, String telephoneNumber) {
        this.name = name;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.ownedBooks = new ArrayList<Book>();
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public ArrayList<Book> getOwnedBooks() {
        return ownedBooks;
    }

    public Book getSelectedBook(int pos) {
        return ownedBooks.get(pos);
    }

    public void addBook(Book book) {
        ownedBooks.add(book);
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
}
