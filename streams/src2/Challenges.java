import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenges {

    public static Person firstSutablePerson(List<Person> listOfPeople, int age, char firstLetter, int pageNumber, int pageSize){
        return listOfPeople.stream()
                .skip((pageNumber - 1) * pageSize)
                .limit(pageSize)
                .filter(p -> p.getAge() >= age && p.getName().charAt(0) == firstLetter)
                .findFirst().orElse(new Person("defaultPerson", 20));

    }

    //Additional challenge 1:
    public static Double averageSalaryOfTopFive(List<Employee> employees){
        return employees.stream()
                .filter(e -> e.getAge() < 30)
                .sorted()
                .limit(5)
                .map(e -> e.getSalary())
                .mapToDouble(Double::doubleValue)
                .average().orElse(0);

    }

    //Additional challenge 2:
    public static List<Department> firstThreeDep(List<Department> company){
        return company.stream()
                .filter(d -> {
                    return d.getEmployees().stream()
                            .allMatch(e -> e.getSalary() > 50000);
                })
                .limit(3)
                .collect(Collectors.toList());
    }

    //Additional challenge 3:

    public static Product findProduct(List<Product> products){
        return products.stream()
                .filter(p -> p.isAvailable() && p.getPrice() < 100 && p.getRating() > 4.5 && p.getReviewsNumber() >= 10)
                .findFirst().orElse(null);
    }


    public static void main(String[] args) {

        List<Person> group1 = Arrays.asList(
                new Person("Alice", 25, "Female"),
                new Person("Bob", 17, "Male"),
                new Person("Charlie", 35, "Male"),
                new Person("Eve", 20, "Female"),
                new Person("Jimmy", 20, "Male"),
                new Person("Klara", 25, "Female"),
                new Person("Billy", 17, "Male"),
                new Person("Jack", 35, "Male"),
                new Person("Inga", 20, "Female"),
                new Person("James", 16, "Male"),
                new Person("Alla", 25, "Female"),
                new Person("Bred", 17, "Male"),
                new Person("James", 35, "Male"),
                new Person("Martha", 20, "Female"),
                new Person("Julia", 20, "Female")
        );
        List<Person> group2 = Arrays.asList(
                new Person("Alice", 25, "Female"),
                new Person("Bob", 17, "Male"),
                new Person("Charlie", 35, "Male"),
                new Person("Eve", 20, "Female"),
                new Person("Jimmy", 20, "Male"),
                new Person("Klara", 25, "Female"),
                new Person("Billy", 17, "Male"),
                new Person("Jack", 35, "Male"),
                new Person("Inga", 20, "Female"),
                new Person("James", 16, "Male"),
                new Person("Alla", 25, "Female"),
                new Person("Bred", 17, "Male"),
                new Person("James", 15, "Male"),
                new Person("Martha", 20, "Female"),
                new Person("Malene", 20, "Female")
        );

        System.out.println("First adult from 2d. page whose name starts with 'J' (group1): " + firstSutablePerson(group1, 18, 'J', 2, 10));
        System.out.println("First adult from 2d. page whose name starts with 'J' (group2): " + firstSutablePerson(group2, 18, 'J', 2, 10));

        //Additional challenge 1:
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25, 51000),
                new Employee("Bob", 30, 60000),
                new Employee("Charlie", 27, 55000),
                new Employee("Eve", 25, 50500),
                new Employee("Jimmy", 27, 60000),
                new Employee("Malene", 35, 55000),
                new Employee("Bred", 25, 53000),
                new Employee("James", 28, 70000),
                new Employee("Inga", 29, 72000)
        );
        System.out.println("Average of salary of top five employees under 30: " + averageSalaryOfTopFive(employees));

        //Additional challenge 2:
        List<Employee> employees2 = Arrays.asList(
                new Employee("Alice", 25, 45000),
                new Employee("Bob", 30, 60000),
                new Employee("Charlie", 27, 55000)

        );
        List<Employee> employees3 = Arrays.asList(
                new Employee("Bred", 25, 50500),
                new Employee("James", 28, 70000),
                new Employee("Inga", 29, 72000)
        );
        List<Employee> employees4 = Arrays.asList(
                new Employee("Alice", 25, 54000),
                new Employee("Bob", 30, 60000),
                new Employee("Charlie", 27, 55000),
                new Employee("James", 28, 70000),
                new Employee("Inga", 29, 72000)
        );
        List<Employee> employees5 = Arrays.asList(
                new Employee("James", 28, 61000),
                new Employee("Inga", 29, 60500)
        );

        Department sales = new Department("Sales department", employees2);
        Department devs = new Department("Development department", employees);
        Department security = new Department("Security department", employees4);
        Department management = new Department("Management", employees3);
        Department finance = new Department("Financial accounting", employees5);

        List<Department> company = Arrays.asList(devs, sales, security, management, finance);

        System.out.println("First 3 departments with high salary: " + firstThreeDep(company));

        //Additional challenge 3:
        List<Product> products = Arrays.asList(new Product("Table", 250, true, 3.6, 9),
                                                new Product("Chair", 150, false, 4.6, 10),
                                                new Product("Sofa", 950, false, 4.9, 55),
                                                new Product("Desk", 420, true, 4.5, 15),
                                                new Product("Computer chair", 450, true, 4.7, 19),
                                                new Product("Game desk", 650, true, 4.8, 3),
                                                new Product("Game chair", 620, false, 4.6, 66),
                                                new Product("Cupboard", 400, true, 3.6, 5),
                                                new Product("Dinner table", 450, true, 5.0, 1),
                                                new Product("Shelf", 300, false, 4.6, 7),
                                                new Product("Children chair", 99, true, 4.6, 10)
                );

        System.out.println("Founded product: " + findProduct(products));
    }
}
