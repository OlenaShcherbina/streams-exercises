import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5);
// Your code here
        List<Integer> numbersWithoutDuplicates = numbers.stream()
                .distinct().collect(Collectors.toList());

        // numbersWithoutDuplicates.forEach(System.out::println);

        List<String> strings = Arrays.asList("hello", "WORLD", "java", "HELLO", "streams");
// Your code here
        List<String> stringsWithoutDuplicates = strings.stream()
                .map(string -> string.toLowerCase())
                .distinct()
                .collect(Collectors.toList());

        // stringsWithoutDuplicates.forEach(System.out::println);

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35),
                new Person("Alice", 25)
        );
// Your code here

        List<Person> uniqPeople = people.stream()
                .distinct() // added equals method into the class Person
                .collect(Collectors.toList());

        uniqPeople.forEach(person -> System.out.println(person.getName() + " " + person.getAge() + ";"));
    }
}
