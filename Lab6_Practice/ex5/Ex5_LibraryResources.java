
import library.Book;
import library.LibraryItem;

public class Ex5_LibraryResources {
    public static void main(String[] args) {
        LibraryItem item = new LibraryItem("Magazine Weekly", 1);
        Book book = new Book("Java Basics", 2);

        item.displayInfo();
        book.displayInfo();   // uses title inside the subclass

        // Outside the package/subclass, protected members are NOT accessible:
        // System.out.println(book.title);   // ERROR: title has protected access in LibraryItem
    }
}
