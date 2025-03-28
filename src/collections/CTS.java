package collections;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CTS {
    public static void main(String[] args) {
        String s = "aabbccdjsajksakfakfdsjkfhjahdsfjhafkc";
        Map<String, Long> map = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map.toString());

//        Map 16 {1,2};
    }
}
