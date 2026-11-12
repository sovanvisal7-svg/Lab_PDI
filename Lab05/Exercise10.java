package Lab05;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        try {
            Scanner reader = new Scanner(new File("students.csv"));
            while (reader.hasNextLine()) {
                String[] data = reader.nextLine().split(",");
                names.add(data[0]);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Cannot read file");
        }

        names.stream().sorted().forEach(System.out::println);
    }
}
