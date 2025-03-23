import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDups();
        removedups();
    }
    public static void removedups(){
        int[] nums = {1,1,2,5,6,7,3};

        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(Arrays.stream(nums).distinct().toArray()));



    }
    public static void removeDups(){
        String s = "tester";
        Object[] chars = Arrays.stream(s.split("")).distinct().toArray();
        System.out.println(Arrays.toString(chars));
    }
}
