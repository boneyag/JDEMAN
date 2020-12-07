package bookShare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBookControllerTest {

    @Test
    public void testAddBook() {
        User testUser = new User("John Smith", "jsmith@abc.ca", "5872494800");

        AddBookController bc = new AddBookController();
        bc.addBook("Test Title", "novel", "Test Author", "1234567890123", testUser);

        Book testBook = testUser.getSelectedBook(0);

        assertEquals(testBook.getTitle(), "Test Title");
    }


}