package Lab04;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class Ex1LuckyNumber {
    static final String FILE = "LuckyNumber.csv";
    static final int COUNT = 500;
    static final int PER_LINE = 10;

    public static void main(String[] args) {
        // 1) Generate and write
        Random rand = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE))) {
            for (int i = 1; i <= COUNT; i++) {
                writer.write(String.valueOf(rand.nextInt(1000) + 1)); // 1..1000
                if (i % PER_LINE == 0) {
                    writer.newLine();          // 10 numbers per row
                } else {
                    writer.write(",");
                }
            }
            System.out.println(COUNT + " random numbers written to " + FILE);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        
        System.out.println("\nData read from " + FILE + ":");
        int total = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                total += line.split(",").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nTotal numbers read: " + total);
    }
}
