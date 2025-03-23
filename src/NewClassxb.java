import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewClassxb {
    public static void main(String[] args) {
        String s = "pradeep";
        Map<String, Long> map = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Set<String> set = Arrays.stream(s.split(""))
                .collect(Collectors.toSet());

//        System.out.println(set.toString());

        for(String s1: map.keySet()){
//            System.out.println(s1);
        }

        char[] arr = s.toCharArray();
        for(int i =0; i<=arr.length; i++){

            int pos = arr.length-i-1;
            if(pos>=0){
                System.out.println(arr[pos]);
            }
        }

        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 2);
        fruits.put("Apple", 2);
        fruits.put("Apple", 2);
        fruits.put("Apple", 3);
        fruits.put("Apple", 5);

        System.out.println(fruits.get("Apple")+" == "+fruits.size());

    }

}
