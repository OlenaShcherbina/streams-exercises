import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Section1 {

    public static Integer maxValue(List<Integer> integers) {
        return integers.stream()
                .reduce((n1, n2) -> n1 > n2 ? n1 : n2).orElse(null);
    }

    public static Integer minValue(List<Integer> numbers) {
        return numbers.stream()
                .reduce((n1, n2) -> n1 < n2 ? n1 : n2).orElse(null);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 15, 23, -9, 8);
        List<Integer> ints = new ArrayList<>();

        System.out.println("Max value: " + maxValue(numbers) + ", Min value: " + minValue(numbers) + ";");
        System.out.println("Max value: " + maxValue(ints) + ", Min value: " + minValue(ints) + ";");
    }
}