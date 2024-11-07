import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Section5 {
   // Additional Ex. 1
   // Combine skip(), filter(), limit(), and findFirst() to find the first even number from the second page of a list.
        public static Integer firsEvenFromPage(List<Integer> nums, int pageNumber, int pageSize){
            return nums.stream()
                    .skip((pageNumber - 1) * pageSize)
                    .limit(pageSize)
                    .filter(n -> n%2 == 0)
                    .findFirst().orElse(null);
        }

    // Additional Ex. 2
    public static List<String> firstThree(List<String> list){
            return list.stream()
                    .filter(s -> s.length() > 5 && s.charAt(0) == 'A')
                    .limit(3)
                    .collect(Collectors.toList());
    }

    // Additional Ex. 3
    public static Integer findNumber(List<Integer> nums){
            return nums.stream()
                    .filter(n -> n>0 && n%2 == 0 && n%3 == 0)
                    .findFirst().orElse(null);
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i < 10000001; i++){
            nums.add(i);
        }

       List<Integer> limitedList = nums.stream()
                .filter(n -> {
                    System.out.println("processing: " + n + " ...");
                   return n%7 == 0;})
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(limitedList);


        List<Integer> largeListOfNums = IntStream.rangeClosed(1, 1000000)
                .boxed()
                .toList();

        boolean isNumberExist = largeListOfNums.stream()
                .anyMatch(x -> {
                  //  System.out.println("Processing " + x + " ...");
                    return x > 100000;
                });

        System.out.println("Is number greater than 100000 exist within the list: " + isNumberExist);


        // Additional Ex. 1
        System.out.println("First even number from 2d. page: " + firsEvenFromPage(largeListOfNums, 2, 99));

        // Additional Ex. 2
        List<String> strings = Arrays.asList("hello", "Amount", "API", "hi", "streams", "Account", "algorithm", "Allegory", "Albert");
        System.out.println("Firs three words starts with 'A' and longer than 5 letters: " + firstThree(strings));

        // Additional Ex. 3
        List<Integer> numbers = IntStream.rangeClosed(-10, 16).boxed().toList();
        System.out.println("First positive even number with divides by 3: " + findNumber(numbers));
    }
}
