package Lab05;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7 {
    public static void sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum 1.." + n + " = " + sum);
    }

    public static void showPrimes() {
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
    }

    public static void readStudents() {
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
    }

    public static void main(String[] args) {
        Thread th1 = new Thread() {
            @Override
            public void run() {
                sumToN(100);
            }
        };
        Thread th2 = new Thread() {
            @Override
            public void run() {
                showPrimes();
            }
        };
        Thread th3 = new Thread() {
            @Override
            public void run() {
                readStudents();
            }
        };

        th1.start();
        th2.start();
        th3.start();
    }
}
