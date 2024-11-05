import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7);
// Your code here
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
       // sortedNumbers.forEach(System.out::println);

        List<String> strings = Arrays.asList("hello", "World", "java", "Streams", "Apple");
// Your code here
        List<String> sortedStrings = strings.stream()
                .map(string -> string.toLowerCase())
                .sorted()
                .collect(Collectors.toList());

       // sortedStrings.forEach(System.out::println);

        List<String> sortedStrings2 = strings.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
        sortedStrings2.forEach(System.out::println);

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25, 50000),
                new Employee("Bob", 30, 60000),
                new Employee("Charlie", 35, 55000)
        );
// Your code here
        List<Employee> sortedEmployees = employees.stream()
                .sorted() // added compareTo() method within the class Employee
                .collect(Collectors.toList());

      //  sortedEmployees.forEach(System.out::println);

        List<Employee> sortedEmployees2 = employees.stream()
                .sorted((em1, em2) -> Double.compare(em2.getSalary(), em1.getSalary()))
                .collect(Collectors.toList());

      //  sortedEmployees2.forEach(System.out::println);
    }
}
