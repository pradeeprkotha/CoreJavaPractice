import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewOne {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("banana");
        list1.add("banana");
        list1.add("apple");
        list1.add("apple");
        list1.add("mango");
        list1.add("orange");list1.add("orange");list1.add("orange");list1.add("orange");list1.add("orange");list1.add("orange");list1.add("orange");list1.add("orange");




        Map<String, Long> map1 =  list1.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<String> sortedKeys=new ArrayList(map1.keySet());
        Collections.sort(sortedKeys);

        for(String s: sortedKeys){
            System.out.println(s+" = " +map1.get(s));
        }


    }
}
