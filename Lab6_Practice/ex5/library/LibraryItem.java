package library;

public class LibraryItem {
    protected String title;
    protected int id;

    public LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Item: " + title + " (ID: " + id + ")");
    }
}
