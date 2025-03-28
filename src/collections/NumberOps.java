package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberOps {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(16);
        ints.add(17);
        EvenorOdd eo = new EvenorOdd();
        Predicate evenOdd = new Predicate() {
            @Override
            public boolean test(Object o) {
                if((int)o%2 ==0){
                    return true;
                }else {
                    return false;
                }
            }
        };
        Predicate prime = new Predicate() {
            @Override
            public boolean test(Object o) {
                if((int)o%2 ==0){
                    return true;
                }else {
                    return false;
                }
            }
        };
        System.out.println(eo.printEvenOdd(ints,evenOdd));

        PrimeNumber pn = new PrimeNumber();
        System.out.println(pn.isPrime(16));
        pn.printPrimes(100);

    }
}
