package leetproblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewFriday {
    public static void main(String[] args) {
        // large paragaraph figureout top 3 words theose are occured multiple times and you have to avoid small words
        String para = "Hey i am a java developer java is object oriented programming language " +
                "and object is the blue print of the class and class is the blue print of the object "+
                ", the developers are using java 8 functionalities";

        List<String> ingnore = Arrays.asList("is", "the", "a", "an", "to", "of");

        // get top repeated words
      Map<String, Long> map =Arrays.stream(para.split(" "))
                .filter(e->!ingnore.contains(e))
                .limit(3)
                .map(e->e.toUpperCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}
