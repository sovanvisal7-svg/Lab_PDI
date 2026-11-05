package Lab04;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Ex4ReadStudentData {
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
