import java.util.Arrays;

public class MergeArrays {
    public void mergeTwoArrays(){
        int[] arr1 = {1,16,12,3,6,9};
        int[] arr2 = {4,5,10};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];
        int i=0; int j=0; int k=0;
        while(i<n1){
            arr3[k++] = arr1[i++];
        }
        while(j<n2){
            arr3[k++] = arr2[j++];
        }
        Arrays.sort(arr3);
        System.out.println(""+arr3.toString());
        for(int p: arr3){
            System.out.print(p+", ");
        }

    }
}
