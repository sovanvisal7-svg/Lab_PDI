package Lab05;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("Sum 1..100 = " + sum);
        };

        Runnable task2 = () -> {
            System.out.println("Primes between 1 and 100:");
            for (int i = 2; i <= 100; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        };

        Runnable task3 = () -> {
            ArrayList<String> students = new ArrayList<>();
            try {
                Scanner reader = new Scanner(new File("students.csv"));
                while (reader.hasNextLine()) {
                    students.add(reader.nextLine());
                }
                reader.close();
                System.out.println("Student list loaded! " + students.size() + " students");
            } catch (Exception e) {
                System.out.println("Cannot read file");
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);
        t1.start();
        t2.start();
        t3.start();
    }
}
