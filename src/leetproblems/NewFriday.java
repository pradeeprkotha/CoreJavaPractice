package leetproblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewFriday {
    public static void main(String[] args) {
        // large paragaraph figureout top 3 words theose are occured multiple times and you have to avoid small words
        String para = "Hey i am a king java developer java is object oriented Raja programming language king king" +
                "and object Raja is the blue print king of the king king king class Raja and class is the blue print of the object "+
                ", the developers are using java 8 functionalities Raja";

        List<String> ingnore = Arrays.asList("is", "the", "a", "an", "to", "of");

        Comparator<Long> cmp = Comparator.reverseOrder();
        // get top repeated words
    Arrays.stream(para.split(" "))
                .filter(e->!ingnore.contains(e))
                .map(e->e.toUpperCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(cmp))
                .limit(3)
                .forEach(e->System.out.println(e));






    }
}
