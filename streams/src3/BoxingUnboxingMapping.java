import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxingUnboxingMapping {
    public static void main(String[] args) {
        // Practice 1
        List<Integer> intList = IntStream.rangeClosed(1,5)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(intList);

        // Practice 2
        IntStream intStream = intList.stream()
                .mapToInt(Integer::intValue);

        // Extra 1
        Stream<String> stringStream = intStream
                .mapToObj(i -> String.valueOf(i));

        // Extra 2
        Stream<String> strings = Stream.of("1", "2" , "3");
             int sum = strings.mapToInt(s -> Integer.valueOf(s))
                     .sum();
        System.out.println("Sum of 'strings' = " + sum);

        // Bonus 1


    }
}
