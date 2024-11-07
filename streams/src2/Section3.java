import java.util.Arrays;
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

    //Additional ex 1.
    public static boolean verification(List<Integer> numbers){
        return numbers.stream()
                .allMatch(n -> n >= 0); // .nonMatch(n -> n < 0);
    }

    //Additional ex 2.
    public static boolean isAllAdults(List<Person> people){
        return people.stream()
                .allMatch(p -> p.getAge() >= 18);
    }

    //Additional ex 3.
    public static boolean hasSomeoneGreatSalary(List<Employee> employees){
        return employees.stream()
                .anyMatch(e -> e.getSalary() > 100000);
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

        //Additional ex 1.
        List<Integer> numsWithNegative = List.of(1,2,4,5,7,8, -10);
        System.out.println("Are all numbers positive: " + verification(evens));
        System.out.println("Are all numbers positive: " + verification(numsWithNegative));

        //Additional ex 2.
        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "Female"),
                new Person("Bob", 17, "Male"),
                new Person("Charlie", 35, "Male"),
                new Person("Eve", 20, "Female")
        );
        System.out.println("Are all people adults: " + isAllAdults(people));

        //Additional ex 3
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25, 50000),
                new Employee("Bob", 30, 60000),
                new Employee("Charlie", 35, 55000),
                new Employee("Klara", 35, 101000)
        );
        System.out.println("Does anyone have a salary greater than 100000?: " + hasSomeoneGreatSalary(employees));
    }
}
