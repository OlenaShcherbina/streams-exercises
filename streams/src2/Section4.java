import java.util.List;

public class Section4 {

    public static Integer firstEvenNum(List<Integer> nums){
        return nums.stream()
                .filter(n -> n%2 == 0)
                .findFirst().orElse(null);
    }

    public static Integer anyNumberGreaterThan(List<Integer> nums, Integer min){
        return nums.stream()
                .filter(n -> n > min)
                .findAny().orElse(null);
    }

    public static void main(String[] args) {

        List<Integer> nums = List.of(1,2,4,5,7,8);

        System.out.println("Firs even number: " + firstEvenNum(nums));
        System.out.println("Any number greater that 3: " + anyNumberGreaterThan(nums, 3));
    }
}
