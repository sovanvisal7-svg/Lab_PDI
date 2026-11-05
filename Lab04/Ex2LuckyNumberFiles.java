package Lab04;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Ex2LuckyNumberFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        
        File directory = new File("Ex2LuckyNumber");
        directory.mkdir();

        
        Random rand = new Random();
        for (int i = 1; i <= n; i++) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Ex2LuckyNumber/file" + i + ".csv"))) {
                for (int j = 0; j < 20; j++) {
                    writer.write(String.valueOf(rand.nextInt(100) + 1));
                    if (j < 19) {
                        writer.write(",");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            try (BufferedReader reader = new BufferedReader(new FileReader("Ex2LuckyNumber/file" + i + ".csv"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    for (String p : parts) {
                        numbers.add(Integer.parseInt(p.trim()));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        
        int max = numbers.get(0);
        int min = numbers.get(0);
        for (int x : numbers) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Numbers: " + numbers);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
