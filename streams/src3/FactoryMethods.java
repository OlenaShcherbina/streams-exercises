import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FactoryMethods {


    public static void main(String[] args) {
        //Practice 1
        Stream<Integer> integers = Stream.of(1,2,3,4,5);
        System.out.println(integers.toList());
        //Practice 2
        Stream<String> fruits = Stream.of("Banana", "Persimmons", "Apple");
        System.out.println(fruits.toList());

        //Extra 1
        Stream<Integer> randomNums = Stream.generate(() -> 100 * (Math.random() +0.01))
                .map(i -> i.intValue())
                .limit(10);
        System.out.println(randomNums.toList());

        //Extra 2
        Stream<UUID> idStream = Stream.generate(UUID::randomUUID)
                .limit(5);
        System.out.println(idStream.toList());

        //Bonus 1
        Stream<Integer> powersOfTwo = Stream.iterate(1, x -> x*2) // starts with pow(2, 0); if we want to start from pow(2, 1) --> Stream.iterate(2, x -> x*2)
                .limit(10);
        System.out.println(powersOfTwo.toList());

        //Bonus 2


        //Challenge


    }
}
