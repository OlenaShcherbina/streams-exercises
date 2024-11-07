import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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

    // Additional ex.1
    public static void demonstrationFirstVsAny(List<Integer> nums){
        System.out.println("Find first: " + nums.stream()
                        .parallel()
                .findFirst());

        System.out.println("Find any: " + nums.stream()
                .parallel()
                .findAny());
    }
    // Additional ex.2
    public static Person findFirstAdult(List<Person> people){
        return people.stream()
                .filter(p -> p.getAge() >= 18)
                .findFirst().orElse(null);
    }

    // Additional ex.3
    public static Employee findAnyByTitle(List<Employee> employees, String title){
        return employees.stream()
                .filter(e -> e.getJobTitle().equalsIgnoreCase(title))
                .parallel()
                .findAny()
                .orElse(null);

    }
    public static void main(String[] args) {

        List<Integer> nums = List.of(1,2,4,5,7,8);

        System.out.println("Firs even number: " + firstEvenNum(nums));
        System.out.println("Any number greater that 3: " + anyNumberGreaterThan(nums, 3));

        // Additional ex.1
        demonstrationFirstVsAny(nums);

        // Additional ex.2
        List<Person> people = Arrays.asList(
                new Person("Jane", 15, "Female"),
                new Person("Alice", 15, "Female"),
                new Person("Bob", 17, "Male"),
                new Person("Charlie", 35, "Male"),
                new Person("Eve", 20, "Female")
        );

        System.out.println("First adult person: " + findFirstAdult(people));

        // Additional ex.3
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25, 50000, "MiddleDev"),
                new Employee("Bob", 30, 60000, "Middledev"),
                new Employee("Charlie", 35, 55000, "Dev"),
                new Employee("Clara", 45, 65000, "deV"),
                new Employee("Martha", 38, 95000, "Dev"),
                new Employee("Jane", 25, 50000, "MiddleDev"),
                new Employee("Mick", 30, 60000, "Middledev"),
                new Employee("Chloe", 25, 50000, "MiddleDev"),
                new Employee("Billy", 30, 60000, "Middledev"),
                new Employee("Bruce", 25, 50000, "MiddleDev"),
                new Employee("Carol", 30, 60000, "Middledev"),
                new Employee("Alla", 25, 50000, "MiddleDev"),
                new Employee("Jack", 30, 60000, "Middledev"),
                new Employee("Susi", 25, 50000, "MiddleDev"),
                new Employee("Ron", 30, 60000, "Middledev")
        );
        System.out.println("Any employee with title 'middledev' " + findAnyByTitle(employees, "middledev"));
    }
}
