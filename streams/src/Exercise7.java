import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercise7 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
// Your code here

        Optional<Integer> sum= numbers.stream()
                .reduce((a, b) -> a + b);

        System.out.println("Sum = " + sum.orElse(0));

        List<String> strings = Arrays.asList("hello", "world", "java", "streams");
// Your code here

        String concatenatedString = strings.stream()
                .reduce("", (s1, s2) -> s1+s2);

        System.out.println("Concatenated string: " + concatenatedString);

        String concatenatedString2 = strings.stream()
                .reduce("", (s1, s2) -> s1.concat(s2));

        System.out.println("Concatenated string: " + concatenatedString2);


        List<Product> products = Arrays.asList(
                new Product("Product 1", 10.99),
                new Product("Product 2", 15.49),
                new Product("Product 3", 7.99)
        );

// Your code here
        Optional<Double> totalPrice = products.stream()
                .map(p1 -> p1.getPrice())
                .reduce((p1, p2) -> p1 + p2);

        System.out.println("Total cost: " + totalPrice.orElse(0.0));

        double summa = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("Total cost: " + summa);
    }
}
