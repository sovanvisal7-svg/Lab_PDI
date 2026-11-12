package Lab05;

import java.util.Scanner;

public class Exercise2 {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("----- Calculator -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Sum from 1 to n");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double a = input.nextDouble();
                System.out.print("Enter second number: ");
                double b = input.nextDouble();

                if (choice == 1) {
                    System.out.println("Result: " + add(a, b));
                } else if (choice == 2) {
                    System.out.println("Result: " + subtract(a, b));
                } else if (choice == 3) {
                    System.out.println("Result: " + multiply(a, b));
                } else {
                    if (b == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Result: " + divide(a, b));
                    }
                }
            } else if (choice == 5) {
                System.out.print("Enter n: ");
                int n = input.nextInt();
                System.out.println("Sum from 1 to " + n + " = " + sumToN(n));
            } else if (choice != 0) {
                System.out.println("Invalid choice");
            }
        }
        System.out.println("Goodbye!");
    }
}
