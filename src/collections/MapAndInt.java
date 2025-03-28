package collections;

import java.util.*;

public class MapAndInt {
    public static void main(String[] args) {

//        1, [2, 3]
//        2, [4, 5]
//        3, [6],
//        4, [7],
//        5, [8]

        Map<Integer, List<Integer>> map = new HashMap<>(); // 1,2,3,4,5
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        List<Integer> list2 = new ArrayList<>();
        list.add(4);
        list.add(5);

        map.put(1, list);
        map.put(2, list2);

        Set<Integer> set = new HashSet<>();
        for(int k: map.keySet()){
            set.add(k);
            for(int i: map.get(k)){
                set.add(i);
            }
        }
        System.out.println(set.toString());
    }
}
