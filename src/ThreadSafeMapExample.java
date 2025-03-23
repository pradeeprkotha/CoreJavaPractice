import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeMapExample {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Multiple threads can safely access and modify the map
        Thread thread1 = new Thread(() -> {
            map.put("A", 1);
            map.put("B", 2);

            map.put("B", 2);map.put("B", 2);map.put("B", 2);map.put("B", 2);map.put("B", 2);map.put("B", 2000);

        });

        Thread thread2 = new Thread(() -> {
            System.out.println(map.get("A")); // Output: 1
            map.put("C", 3);
            map.put("C", 3);
        });

        thread1.start();
        thread2.start();
        System.out.println(map.get("B")); // O
    }
}