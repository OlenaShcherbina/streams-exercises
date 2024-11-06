import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Section2 {

    public static List<Integer> limitedEvens(List<Integer> list, int limit){
        return list.stream()
                .filter(n -> n % 2 == 0)
                .limit(limit)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i < 101; i++){
            nums.add(i);
        }

        System.out.println("First 5 even numbers: " + limitedEvens(nums, 5));

        List<Integer> filteredNums = nums.stream()
                .skip(50)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("10 numbers after skipped 50: " + filteredNums);

    }
}
