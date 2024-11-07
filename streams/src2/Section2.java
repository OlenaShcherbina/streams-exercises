import java.util.*;
import java.util.stream.Collectors;

public class Section2 {

    public static List<Integer> limitedEvens(List<Integer> list, int limit){
        return list.stream()
                .filter(n -> n % 2 == 0)
                .limit(limit)
                .collect(Collectors.toList());
    }
    // Additional ex.1
    /* Incorrect understanding of the task (this method returns Map<PageNumber, List<Product>

    public static Map<Integer, List<String>> pagination(List<String> products, int pages, int pageSize){
        Map<Integer, List<String>> result = new LinkedHashMap<>();
        for(int i = 0; i < pages; i++){
            result.put(i, products.stream()
                    .skip(i * pageSize)
                    .limit(pageSize)
                    .collect(Collectors.toList()));
        }
        return result;
    }
    */

    public static List<String> paginationCorrect(List<String> products, int pageNumber, int pageSize){
        return products.stream()
                .skip((pageNumber -1) * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());
    }


    // Additional ex.2
    public static List<Integer> shortList(List<Integer> list, int start, int end){
        return list.stream()
                .skip(start - 1)
                .limit(end - start + 1).collect(Collectors.toList());
    }
    // Additional ex.3
    public static List<String> lastFiveElements(List<String> list){
        return list.stream()
                .skip(list.size() - 5)
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i < 101; i++){
            nums.add(i);
        }

        System.out.println("First 5 even numbers: " + limitedEvens(nums, 5));

        List<Integer> filteredNums = nums.stream()
                .skip(50)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("10 numbers after skipped 50: " + filteredNums);

        // Additional ex.1
        List<String> products = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            products.add("Product" + (i+1));
        }
        // Incorrect version
      //  System.out.println(pagination(products, 4, 4).toString());

        System.out.println("Products on page 4: " + paginationCorrect(products, 4, 4));

        // Additional ex.2

        System.out.println("Elements from 3d. to 7th.: " + shortList(nums, 3, 7));

        // Additional ex.2

        System.out.println("Last 5 elements: " + lastFiveElements((products)));

    }
}
