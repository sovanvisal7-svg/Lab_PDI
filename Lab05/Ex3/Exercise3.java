package Lab05.Ex3;

public class Exercise3 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Clean Code", "Robert C. Martin", 39.99);
        book1.display();
        book2.display();
    }
}
