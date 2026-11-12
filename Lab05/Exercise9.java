package Lab05;

import java.util.Arrays;
import java.util.List;

public class Exercise9 {
    public static void main(String[] args) {
        printCube();
        System.out.println("-----------------------");
        printPositive();
        System.out.println("-----------------------");
        printSorted();
    }

    public static void printCube() {
        List<Integer> numbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);
        numbers.stream().map(n -> n * n * n).forEach(System.out::println);
    }

    public static void printPositive() {
        List<Integer> numbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);
        numbers.stream().filter(n -> n > 0).forEach(System.out::println);
    }

    public static void printSorted() {
        List<Integer> numbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);
        numbers.stream().sorted().forEach(System.out::println);
    }
}
