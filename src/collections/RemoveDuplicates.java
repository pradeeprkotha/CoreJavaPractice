package collections;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDups();
        removedups();
    }
    public static void removedups(){
        int[] nums = {1,1,2,5,6,7,3};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(Arrays.stream(nums).distinct().toArray()));



    }
    public static void removeDups(){
        String s = "tester";
        Object[] chars = Arrays.stream(s.split("")).distinct().toArray();
        System.out.println(Arrays.toString(chars));
    }
}
