package decpract;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Practice {
    static void main() {
        String para = "Hello how are you doing its a apple and banana and apple again";
        Arrays.stream(para.split(" "))
                .filter(e-> !e.equals(" "))
                .collect(Collectors.groupingBy(w->w, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()>1)
                .forEach(e->{System.out.println(e.getKey() + " = "+e.getValue());});

        System.out.println("Big one is "+greatest(17879,277));
    }

    public static int greatest(int a, int b){
        return (a>b)? a:b;
    }
}
