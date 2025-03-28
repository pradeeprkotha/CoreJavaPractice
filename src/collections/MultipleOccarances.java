package collections;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MultipleOccarances {
    public static void main(String[] args) {
        System.out.println(getOccarances("twerquilmnbvcasdfgrt"));
    }
    public static String getOccarances(String output){
        Map<String, Long> map= Arrays.stream(output.split(""))
//                .filter(e->output.contains(e))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return map.toString();
    }

    public static String getFirstRepeated(String input){
        Map<String, Long> map= Arrays.stream(input.split(""))
                .filter(e->input.contains(e))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (String k:map.keySet()){
            if(map.get(k)>1)
            System.out.println(k);
        }
return "";
    }
}
