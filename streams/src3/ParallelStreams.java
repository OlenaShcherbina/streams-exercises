import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ParallelStreams {
    public static void main(String[] args) {
        //Practice 1
        List<Integer> nums = Arrays.asList(2,5,9,10,-45,120);
        int sum = nums.parallelStream()
                .mapToInt(i -> i)
                .sum();
        System.out.println("Sum = " + sum);

        //Practice 2
        List<Integer> squares = nums.stream()
                .parallel()
                .map(n -> n*n)
                .toList();
        System.out.println("List of squares: " + squares);

        // Extra 1
        long start1 = System.currentTimeMillis();
        long countP = countParallelPrimes();
        long end1 = System.currentTimeMillis();
        System.out.println("Count = " + countP +", Time parallel: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        long countS = countSequentialPrimes();
        long end2 = System.currentTimeMillis();
        System.out.println("Count = " + countS +", Time sequential: " + (end2 - start2));

        // Extra 2
        List<String> strings = Arrays.asList("hello", "hi", "java", "Streams", "Numeric stream operations");
        List<String> upStrings = strings.parallelStream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Uppercase list: " + upStrings);


    }
    public static long countParallelPrimes(){
        return IntStream.rangeClosed(2, 100000)
                .boxed()
                .parallel()
                .filter(n -> isPrime(n))
                .count();

    }
    public static long countSequentialPrimes(){
        return IntStream.rangeClosed(2, 100000)
                .boxed()
                .filter(n -> isPrime(n))
                .count();
    }
    public static boolean isPrime(int n){
        if(n < 1){
            return false;
        }
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

