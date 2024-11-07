import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreams {
    public static void main(String[] args) {
        //Practice 1
        IntStream nums = IntStream.range(1, 11);

        System.out.println(nums.boxed().toList());

        //Practice 2
        DoubleStream dStream = Stream.iterate(1.5, i -> i)
                .limit(5)
                .mapToDouble(Double::doubleValue);
        System.out.println(dStream.boxed().toList());

        // Extra 1
        Long sumOfNatNums = LongStream.rangeClosed(1, 100)
                .sum();

        System.out.println("Sum of the first 100 natural numbers = " +sumOfNatNums);

        // Extra 2
        IntStream evens = IntStream.rangeClosed(1,20)
                .boxed()
                .filter(n -> n%2 == 0)
                .mapToInt(Integer::intValue);

        System.out.println(evens.boxed().toList());

        // Bonus 1
        DoubleStream sqRoots = IntStream.rangeClosed(1, 5)
                .boxed()
                .mapToDouble(n -> (Math.sqrt(n.doubleValue())));
        System.out.print("5 square roots: ");
        sqRoots.boxed().forEach(n -> System.out.printf("%.2f ", n));
        System.out.println();

        // Bonus 2
        IntStream primes = IntStream.iterate(2, n -> n+1)
                .boxed()
                .filter(n -> {
                    for(int i = 2; i < n; i++){
                        if(n % i == 0){
                            return false;
                        }
                    }
                    return true;
                })
                .limit(10)
                .mapToInt(Integer::intValue);

        System.out.println(primes.boxed().toList());

        // Challenge

    }

}
