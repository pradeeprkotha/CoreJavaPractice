package leetproblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementInTwoArrays {
    public static void main(String[] args) {
        // distint and sorted arrays
        int[] arr1 = {1,3,4,5,1,7};

        for(int i =0; i < arr1.length; i++){
            for (int j = i+1; j < arr1.length; j++){
                if(arr1[i] == arr1[j]){
                    System.out.println("Duplicate element is: "+arr1[i]);
                    break;
                }
            }
        }




        int[] arr2 = {2,3,4,6};

        int loop=0;

        for(int i=0; i< arr1.length; i++){
            for(int j =0; j<arr2.length; j++){
                loop++;
                if(arr1[i] ==arr2[j]){
                    System.out.println("Duplicate element is: "+arr1[i]);
                    System.out.println("loop repeated: "+loop);
//                    return;
                }
            }
        }

        System.out.println("loop repeated: "+loop);


        int[] arr3 = {9,9,9,1,1,2,2,3,4,5}; // convert to map

        Map<Integer, Long> map = Arrays.stream(arr3)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

        List<String> list = Arrays.asList("apple", "banana", "chikko", "banana");

        Map<String, Long> map2 =list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map2);

        int[] arr9 = {9,6,1,2,4,6,7}; // Sorting

        for(int i =0; i < arr9.length; i++){
            for (int j = i+1; j < arr9.length; j++){
                if(arr9[i] > arr9[j]){
                    int temp = arr9[i];
                    arr9[i] = arr9[j];
                    arr9[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr9));

    }
}
