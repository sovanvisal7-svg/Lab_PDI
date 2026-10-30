package Lab03;
import java.util.Scanner;
public class lab3_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter number of books (N): ");
        int n = input.nextInt();
        input.nextLine(); 

        Book[] books = new Book[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1) + ":");

            System.out.print("Book ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Title: ");
            String title = input.nextLine();

            System.out.print("Author: ");
            String author = input.nextLine();

            System.out.print("Price: ");
            double price = input.nextDouble();
            input.nextLine();

            books[i] = new Book(id, title, author, price);
        }

        
        double total = 0;
        System.out.println("\n===== Library Books =====");
        for (int i = 0; i < n; i++) {
            System.out.println("Book ID: " + books[i].id);
            System.out.println("Title:   " + books[i].title);
            System.out.println("Author:  " + books[i].author);
            System.out.println("Price:   $" + books[i].price);
            System.out.println("-------------------------");
            total += books[i].price;
        }

        
        double average = total / n;
        System.out.printf("Average price of all books: $%.2f%n", average);

        input.close();
    }
}

class Book {
    int id;
    String title;
    String author;
    double price;

    Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}