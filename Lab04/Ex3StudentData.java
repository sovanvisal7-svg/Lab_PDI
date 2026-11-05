package Lab04;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ex3StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Ex3StudentData.csv"))) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Student " + i);
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("ID: ");
                String id = sc.nextLine();
                System.out.print("Gender: ");
                String gender = sc.nextLine();
                writer.write(name + "," + id + "," + gender);
                writer.newLine();
            }
            System.out.println("Data saved to Ex3StudentData.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
