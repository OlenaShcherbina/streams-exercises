import java.util.List;

public class Section3 {

    public static boolean checkNumbersForEven(List<Integer> numbers){
        return numbers.stream()
                .allMatch(n -> n % 2 == 0);
    }

    public static boolean isAnyLongWord(List<String> list){
        return list.stream()
                .anyMatch(s -> s.length() > 5);
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,4,5,7,8);
        List<Integer> evens = List.of(2,2,4,6,10,8);

        System.out.println(checkNumbersForEven(nums));
        System.out.println(checkNumbersForEven(evens));

        List<String> words = List.of("hello", "java", "streams", "Lessons");
        List<String> shortWords = List.of("hi", "java", "Num");

        System.out.println(isAnyLongWord(words));
        System.out.println(isAnyLongWord(shortWords));
    }
}
