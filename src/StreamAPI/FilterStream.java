package StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 *  Stream API Filter method
 *  .filter() method is used to filter the elements of a stream based on a given predicate.
 *  the condition is applied to each element of the stream,
 *  and only those elements that satisfy the condition are included in the resulting stream.
 *
 */
public class FilterStream {
    public static void main(String[] args) {
        List<String> list = asList("Hello", "Test", "Loaded", "List", "Testing", "Test");

        list.stream().filter(e-> e.startsWith("H"))
                .forEach(System.out::println);


        // find first repeated element
        Set<String> set = new HashSet<>();
        String str = String.valueOf(
                list.stream()
                .filter(e-> !set.add(e))
                .findFirst());
        System.out.println("First repeated element is: " + str);

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("First even number: " +numbers.stream()
                .filter(n -> n % 2 == 0).findFirst());
        System.out.println("Any even number: " +numbers.stream()
                .filter(n -> n % 2 == 0).findAny());


        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        boolean anyGreaterThanFive = numbers.stream().anyMatch(n -> n > 5);

        System.out.println("All even: " + allEven); // Output: true
        System.out.println("Any greater than 5: " + anyGreaterThanFive);



        // Filter equivalent old way
        List<String> list2 = asList("Hello", "Test", "Loaded", "List", "Testing", "Test");
        for (String s : list2) {
            if (s.startsWith("H")) {
                System.out.println(s);// add this to the list
            }
        }

        int sum =  numbers.stream()
//                .map(e-> e*e)
                .mapToInt(e-> e*e)
                .sum();
        System.out.println("Sum of numbers: " + sum);

        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Count of each element: " + map);

    }
}
