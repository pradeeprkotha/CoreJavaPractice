package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPI {
    public void StreamTest(){
        List<String> strs = new ArrayList<>();
        strs.add("Hello");
        strs.add("World");
        strs.add("Java");
        strs.add("Hello");
        strs.add("All");
        strs.stream().forEach(e->{
            System.out.println(e);
        });
        List<String> strs2 = strs.stream()
                .filter(e->e.equalsIgnoreCase("Hello"))
                .collect(Collectors.toList());

        System.out.println(strs2);
    }
    public void findRepeatedWords(){

    }

    public void findRepeatedChars(){

    }

    public void evenOrOdd(Predicate p){
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(5);
        ints.add(2);
        ints.add(4);
        List<Integer> outs = new ArrayList<>();
        outs = (List<Integer>) ints
                .stream()
                .filter(p)
                .collect(Collectors.toList());
        System.out.println(outs);

    }

    public void evenOrOdd(){
        int[] ins = {1,2,3,7,6,8,9};
        int[] res = Arrays.stream(ins)
                .filter(e->e%2==0)
                .toArray();
        System.out.println(Arrays.toString(res));
    }
}
