package Lambda;

public class LambdaMain  {
    public static void main(String[] args) {
        Printable p = (a, b) -> a + b;
        System.out.println(p.print(10, 20));

        Printable p1 = (a, b) -> a - b;
        System.out.println(p1.print(20, 10));
    }
}
