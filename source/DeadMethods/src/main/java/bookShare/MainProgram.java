package bookShare;

public class MainProgram {
    public static void main(String[] args){
        User tempUser = new User("Jane Smith", "jsmith@abc.ca", "5871232000");
        AddBookController bc = new AddBookController();

        bc.addBook("Test Title", "novel", "Test Author", "1234567890123", tempUser);
    }
}
