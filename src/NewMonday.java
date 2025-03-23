import java.util.HashSet;
import java.util.Set;

public class NewMonday {


//    You are climbing a staircase. It takes n steps to reach the top.
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//    Example 1:
//    Input: n = 2 Output: 2 Explanation: There are two ways to climb to the top.1. 1 step + 1 step2. 2 steps
    //
//    Example 2:
//    Input: n = 3Output: 3Explanation:
//    There are three ways to climb to the top.1. 1 step + 1 step + 1 step2. 1 step + 2 steps3. 2 steps + 1 step
//    example 3 :
//    Input: n = 4 /
//    Output: 5
//    Explanation: There are five ways to reach 4th stair: {1, 1, 1, 1}, {1, 1, 2}, {2, 1, 1}, {1, 2, 1} and {2, 2}.

    // 30 =


    public static void main(String[] args) {

//        n!/(n-r)!

      //  2/2-1 = 2
//                6/3-2

        int stairs = 4;
        int output = 5; // possible ways 24/4-1 =24/6 = 4

        int s = 3;

//        int[] outp = [{1,1,1}, {1,2,0},  {2,1,0}]; 6/3-1 = 6/2 = 3


//       10 {1,1,1,1....1} {2,2,1,1....1} {1,2,1,2,....2}
//        6!/5! =


        int n=5;
        int r = 0;

        r = n/2;


//        int outputFinal = getFactorial(n)/getFactorial(n-r);
        System.out.println(getFactorial(4));


        // Fact n
    }

    public static int getFactorial(int n){
        int factorial =1;
        for(int i=2; i<n;i++){
            factorial = factorial *i;
        }
        return factorial;


    }


}
