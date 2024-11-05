import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Your code here
        long countOfEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        //System.out.println(countOfEvens);

        List<String> strings = Arrays.asList("hello", "world", "java", "apple", "streams", "ink");
// Your code here
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');

        long countOfVowelStrings = strings.stream()
                .filter(s -> vowels.contains(s.charAt(0)))
                .count();
       // System.out.println(countOfVowelStrings);

        List<Buch> books = Arrays.asList(
                new Buch("Book 1", "Author 1", 300),
                new Buch("Book 2", "Author 2", 600),
                new Buch("Book 3", "Author 3", 450),
                new Buch("Book 4", "Author 4", 550)
        );
// Your code here
        long countLargeBooks = books.stream()
                .filter(b -> b.getPages() > 500)
                .count();

        System.out.println(countLargeBooks);
    }
}
