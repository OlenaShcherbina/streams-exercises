import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Section1 {

    public static Integer maxValue(List<Integer> integers) {
        return integers.stream()
                .reduce((n1, n2) -> n1 > n2 ? n1 : n2).orElse(null);
    }

    public static Integer minValue(List<Integer> numbers) {
        return numbers.stream()
                .reduce((n1, n2) -> n1 < n2 ? n1 : n2).orElse(null);
    }
// using identity value
    public static Integer minValue2(List<Integer> numbers) {
        return numbers.stream()
                .reduce(-20, (n1, n2) -> n1 < n2 ? n1 : n2);
    }

    // Additional ex. 2.
    public static String findLongestString(List<String> strings){
        return strings.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).orElse(null);
    }

    // Additional ex. 3.
    public static Optional<Employee> findEmployee(List<Employee> employees){
        return employees.stream()
                .reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 15, 23, -9, 8);
        List<Integer> ints = new ArrayList<>();

        System.out.println("Max value: " + maxValue(numbers) + ", Min value: " + minValue(numbers) + ";");
        System.out.println("Max value: " + maxValue(ints) + ", Min value: " + minValue(ints) + ";");

        // Example for additional exercise 1.:
        System.out.println("Min value: " + minValue2(numbers) + ";");

        // Additional ex. 2.
        List<String> strings = Arrays.asList("hello", "hi", "theLongestString", "java");
        System.out.println("The longest string is : " + findLongestString(strings));

        // Additional ex. 3.
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25, 50000),
                new Employee("Bob", 30, 60000),
                new Employee("Charlie", 35, 55000)
        );
        List<Employee> employees2 = new ArrayList<>();

        System.out.println("The person with the highest salary is : " + findEmployee(employees).get());
        System.out.println("The person with the highest salary is : " + findEmployee(employees2));

    }
}

/*
Additional Exercises
Explain why using an identity value (like 0) for finding max/min with reduce() can be problematic.
        When we use an identity value, the result will consist the value anyway, even when the list is empty or min = identity value when all elements of the list are greater than identity value (for example), it could cause a mistake
 */