package collections;

import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      call();
        StreamAPI streamAPI = new StreamAPI();
        streamAPI.StreamTest();

        Predicate p = new Predicate() {
            @Override
            public boolean test(Object o) {
                if((int)o%1 ==0){
                    return true;
                }
                return false;
            }
        };
//        streamAPI.evenOrOdd(p);

        LambdaExpression le = new LambdaExpression();
        le.getthings();
        le.abstractFun(2);
        le.getwhenNeed();
        le.getwhenNeed2();
    }

    public static void call(){
        SamplePojo sp = new SamplePojo();
        sp.setAge(33);
        sp.weight = 100;
        System.out.println(sp.weight);
        System.out.println(sp.getAge());
    }
}