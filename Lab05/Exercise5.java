package Lab05;

public class Exercise5 {
    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 6, 10, 50};
        for (int number : numbers) {
            System.out.println("Factorial of " + number + " is: " + calculateFactorial(number));
            System.out.println("Factorial of " + number + " (recursion) is: " + factorialRecursive(number));
        }
    }
}
