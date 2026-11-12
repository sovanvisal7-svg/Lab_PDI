package Lab05;

import java.util.stream.IntStream;

public class Exercise11 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3, 8};
        int max = IntStream.of(numbers).max().getAsInt();
        int min = IntStream.of(numbers).min().getAsInt();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
