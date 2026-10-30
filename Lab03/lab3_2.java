package Lab03;
import java.util.Scanner;
class City {
    String name;
    double celsius;
    City(String name, double celsius) {
        this.name = name;
        this.celsius = celsius;
    }
    double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
    void display() {
        System.out.printf("%s: %.1f C = %.1f F%n", name, celsius, toFahrenheit());
    }
}
public class lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();
        City[] cities = new City[n];
        for (int i = 0; i < n; i++) {
            System.out.print("City name: ");
            String name = sc.nextLine();
            System.out.print("Temperature in Celsius: ");
            double c = sc.nextDouble();
            sc.nextLine();
            cities[i] = new City(name, c);
        }
        System.out.println("Temperatures");
        for (int i = 0; i < n; i++) {
            cities[i].display();
        }
    }
}