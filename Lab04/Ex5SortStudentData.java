package Lab04;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Ex5SortStudentData {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        
        try (BufferedReader reader = new BufferedReader(new FileReader("Ex3StudentData.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                students.add(new Student(parts[0], parts[1], parts[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("New student " + i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            students.add(new Student(name, id, gender));
        }

       
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(j).name.compareToIgnoreCase(students.get(j + 1).name) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Ex3StudentData.csv"))) {
            for (Student s : students) {
                writer.write(s.name + "," + s.id + "," + s.gender);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

class Student {
    String name;
    String id;
    String gender;

    Student(String name, String id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Gender: " + gender;
    }
}
