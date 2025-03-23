
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Friday {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        for (int i =0; i<2000; i++){
            list.add(i);
        }


        Predicate even = new Predicate() {
            @Override
            public boolean test(Object o) {
                if((int) o%2==0){
                    return true;
                }else {
                    return false;
                }
            }
        };
        Predicate odd = new Predicate() {
            @Override
            public boolean test(Object o) {
                if((int) o%2!=0){
                    return true;
                }else {
                    return false;
                }
            }
        };
        System.out.println(getEvenOrOdd(list, even));
        System.out.println(getEvenOrOdd(list, odd));
    }

    public static List<Integer> getEvenOrOdd(List<Integer> list, Predicate p){
        List<Integer> even = (List<Integer>) list.stream()
                .filter(p)
                .collect(Collectors.toList());

        return even;
    }

}
