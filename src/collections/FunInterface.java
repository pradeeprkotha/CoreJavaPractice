package collections;

@FunctionalInterface
public interface FunInterface {
    public void getthings();
    public default void getwhenNeed() {
        System.out.println("A print is from default method");
    }
    public default void getwhenNeed2() {
        System.out.println("A print is from default method");
    }
}
