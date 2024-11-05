import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5, -6, 7, -8, 9, -10);
// Your code here
        List<Integer> positiveNumbers = numbers.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());

        System.out.println(positiveNumbers);

        List<String> strings = Arrays.asList("hello", "world", "java", "streams", "lambda", "functional");
// Your code here

        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filteredStrings);

        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "Female"),
                new Person("Bob", 17, "Male"),
                new Person("Charlie", 35, "Male"),
                new Person("Eve", 20, "Female")
        );
// Your code here

        List<Person> adultsMale = people.stream()
                .filter((Person s) -> s.getAge() >= 18 && s.getGender().equals("Male"))
                .collect(Collectors.toList());

        List<Person> adultsFemale = people.stream()
                .filter((Person s) -> s.getAge() >= 18 && s.getGender().equals("Female"))
                .collect(Collectors.toList());

        System.out.println(adultsMale);
        System.out.println(adultsFemale);




    }
}
