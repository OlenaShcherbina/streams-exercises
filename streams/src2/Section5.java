import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Section5 {
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


    }
}
