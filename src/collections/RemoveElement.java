package collections;

import java.util.Arrays;

public class RemoveElement {
    public void removeElement(){
        int[] nums = {3,2,2,3};

        int n = 3;
        int k =0;
        int l =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=n){
                nums[k] = nums[i];
                k++;
            }
        }
        int[] nums2 = new int[k];
        System.out.println(k);

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=n){
                nums2[l] = nums[i];
                l++;
            }
        }
        System.out.println(Arrays.toString(nums2));
    }
}
