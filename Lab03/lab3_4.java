package Lab03;
import java.util.Scanner;
class Student {
    int id;
    String name;
    double[] marks;
    Student(int id, String name, double[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    double getTotal() {
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }
    double getAverage() {
        return getTotal() / marks.length;
    }
    char getGrade() {
        double avg = getAverage();
        if (avg >= 90) {
            return 'A';
        } else if (avg >= 75) {
            return 'B';
        } else if (avg >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }
    void display() {
        System.out.printf("ID: %d | Name: %s | Total: %.1f | Average: %.2f | Grade: %c%n", id, name, getTotal(), getAverage(), getGrade());
    }
}
public class lab3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            double[] marks = new double[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Mark of subject " + (j + 1) + ": ");
                marks[j] = sc.nextDouble();
            }
            students[i] = new Student(id, name, marks);
        }
        System.out.println("Student results");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }
    }
}
