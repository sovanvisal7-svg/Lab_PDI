package library;

public class Book extends LibraryItem {
    public Book(String title, int id) {
        super(title, id);
    }

    @Override
    public void displayInfo() {
        // title and id are protected, so the subclass can use them directly
        System.out.println("Book -> \"" + title + "\" [ID: " + id + "]");
    }
}
