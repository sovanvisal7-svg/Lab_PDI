package Lab03;
import java.util.Scanner;
class Employee {
    int id;
    String name;
    double basic;
    Employee(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }
    double getGross() {
        double hra = basic * 0.2;
        double tca = basic * 0.1;
        return basic + hra + tca;
    }
    void display() {
        System.out.printf("ID: %d | Name: %s | Basic: $%.2f | Gross: $%.2f%n", id, name, basic, getGross());
    }
}
public class lab3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Basic salary: ");
            double basic = sc.nextDouble();
            emp[i] = new Employee(id, name, basic);
        }
        System.out.println("Employee details");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
    }
    
}