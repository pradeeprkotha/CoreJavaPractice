import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MultipleOccrances {
    public static void main(String[] args) {
        System.out.println(getMultipleOccarances("interTdegree"));
    }
    public static String getMultipleOccarances(String input){


        Map<String, Long> map = Arrays.stream(input.split(""))
//                .filter(e->input.contains(e))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return "String "+map.toString();
    }
}
