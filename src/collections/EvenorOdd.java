package collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenorOdd {
    public static void main(String[] args) {
        getSumSquareRoot();
    }
    public List<Integer> printEvenOdd(List<Integer> ints, Predicate p){
        return (List<Integer>) ints.stream().
                filter(p).
                collect(Collectors.toList());
    }

    public static void getSumSquareRoot(){
        int[] arr = {1,3,2};
        System.out.println(Arrays.stream(arr).filter(e->e%2==0)
                .map(e->e*e)
                .sum());

    }
}
