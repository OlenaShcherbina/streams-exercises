import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "streams");
        // Your code here
        List<String> uppercaseStrings = strings.stream()
                .map(i -> i.substring(0,1).toUpperCase()+ i.substring(1))
                .collect(Collectors.toList());

        System.out.println(uppercaseStrings);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Your code here
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        // Your code here
        List<String> peopleInfo = people.stream()
                .map(p -> "'Name <" + p.getName() + ">, Age <" + p.getAge() + ">'" )
                .collect(Collectors.toList());
        System.out.println(peopleInfo);
    }
}
