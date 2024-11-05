import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("hello", "world", "java", "streams");
// Your code here
        Stream<String> chars = strings.stream()
                .flatMap(word -> Stream.of(word.split("")));

        Stream<Character> characters = strings.stream()
                .flatMap(word -> word.chars().mapToObj(ch -> (char)ch));

       // chars.forEach(System.out::println);
       // characters.forEach(System.out::println);

        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
// Your code here
        Stream<Object> integers= lists.stream()
                .flatMap(list -> Stream.of(list.toArray()));


        Stream<Integer> ints= lists.stream()
                .flatMap(list -> list.stream());

        // integers.forEach(System.out::println);
        //ints.forEach(System.out::println);

        List<Book> books = Arrays.asList(
                new Book("Book 1", Arrays.asList(new Author("Author 1"), new Author("Author 2"))),
                new Book("Book 2", Arrays.asList(new Author("Author 3"))),
                new Book("Book 3", Arrays.asList(new Author("Author 2"), new Author("Author 4")))
        );
// Your code here

        Stream<String> authorsNames = books.stream()
                .flatMap(book -> book.getAuthors().stream()
                        .map(author -> author.getName()));

        // authorsNames.forEach(System.out::println);

    }
}
