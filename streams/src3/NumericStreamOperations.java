import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamOperations {
    public static void main(String[] args) {
        // Practice 1
        int sum = IntStream.rangeClosed(1, 5)
                .sum();
        double average = IntStream.rangeClosed(1, 5)
                        .average().orElse(0);
        System.out.printf("Sum = %d, average = %.2f%n", sum, average);

        // Practice 2
        int[] nums = {45, 12, 56, 15, 24};
        OptionalInt maxOpt = IntStream.of(nums)
                .max();
        OptionalInt minOpt = IntStream.of(nums)
                .min();
        System.out.println("Max = " + maxOpt + ", min = " + minOpt);
    }
}
