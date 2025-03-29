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
        // a an to of the

        List<String> ingnore = new ArrayList<>();
        ingnore.add("a");ingnore.add("an");
        ingnore.add("to"); ingnore.add("of");  ingnore.add("the");

        // get top repeated words

      Map<String, Long> map =Arrays.stream(para.split(" "))
                .filter(e->!ingnore.contains(e))
                .limit(3)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



        System.out.println(map);


    }
}
